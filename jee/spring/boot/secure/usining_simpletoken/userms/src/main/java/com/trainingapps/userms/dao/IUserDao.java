package com.trainingapps.userms.dao;

import com.trainingapps.userms.entity.AppUser;

import java.util.List;
import java.util.Optional;

public interface IUserDao {

    AppUser save(AppUser user);

    Optional<AppUser> findByUsername(String username);

    List<AppUser> findAll();

}
