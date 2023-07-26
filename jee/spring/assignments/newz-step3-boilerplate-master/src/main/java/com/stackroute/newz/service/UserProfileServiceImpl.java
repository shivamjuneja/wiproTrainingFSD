package com.stackroute.newz.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.newz.model.UserProfile;
import com.stackroute.newz.repository.UserProfileRepository;
import com.stackroute.newz.util.exception.UserProfileAlreadyExistsException;
import com.stackroute.newz.util.exception.UserProfileNotExistsException;

/*
 * This class is implementing the UserProfileRepository interface. This class has to be annotated with
 * @Service annotation.
 * @Service - is an annotation that annotates classes at the service layer, thus
 * clarifying it's role.
 *
 * */
@Service
@Transactional
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileRepository repository;


    /*
     * Add a new user. Throw UserProfileAlreadyExistsException if the userProfile with specified
     * userId already exists.
     */
    @Override
    public UserProfile registerUser(UserProfile user) throws UserProfileAlreadyExistsException {
        Optional<UserProfile>optional=repository.findById(user.getUserId());
        if(optional.isPresent()){
           throw new UserProfileAlreadyExistsException();
        }
        user = repository.save(user);
        return user;
    }

    /*
     * Update an existing userProfile by it's userId. Throw UserProfileNotExistsException
     * if the userProfile with specified userId does not exist.
     */
    @Override
    public UserProfile updateUserProfile(UserProfile user, String userId)
            throws UserProfileNotExistsException {
        UserProfile found=repository.getOne(userId);
        if(found==null){
            throw new UserProfileNotExistsException();
        }
        repository.save(user);
        return user;
    }


    /*
     * Delete an existing userProfile by it's userId. Throw UserProfileNotExistsException if
     * the userProfile with specified userId does not exist.
     */
    @Override
    public void deleteUserProfile(String userId) throws UserProfileNotExistsException {
        UserProfile found=repository.getOne(userId);
        if(found==null){
            throw new UserProfileNotExistsException();
        }

         repository.deleteById(userId);
    }


    /*
     * Retrieve an existing userProfile by it's userId. Throw UserProfileNotExistsException
     * if the userProfile with specified userId does not exist.
     */
    @Override
    public UserProfile getUserProfile(String userId) throws UserProfileNotExistsException {
       Optional<UserProfile>optional=repository.findById(userId);
       if(!optional.isPresent()){
           throw new UserProfileNotExistsException();
       }
        return optional.get();
    }

    /*
     * Retrieve all existing userProfiles
     */
    @Override
    public List<UserProfile> getAllUserProfiles() {

        return repository.findAll();
    }

}
