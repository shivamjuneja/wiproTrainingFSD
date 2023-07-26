package com.stackroute.newz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.newz.model.Reminder;
import com.stackroute.newz.repository.ReminderRepository;
import com.stackroute.newz.service.ReminderService;
import com.stackroute.newz.util.exception.ReminderNotExistsException;

/*
 * This class is implementing the ReminderService interface. This class has to be annotated with
 * @Service annotation.
 * @Service - is an annotation that annotates classes at the service layer, thus
 * clarifying it's role.
 *
 * */
@Service
public class ReminderServiceImpl implements ReminderService {

    @Autowired
    private ReminderRepository repository;


    /*
     * Add a new reminder.
     */
    @Override
    public Reminder addReminder(Reminder reminder) {
        reminder = repository.save(reminder);
        return reminder;
    }

    /*
     * Update an existing reminder by it's reminderId. Throw ReminderNotExistsException
     * if the reminder with specified reminderId does not exist.
     */
    @Override
    public Reminder updateReminder(Reminder reminder) throws ReminderNotExistsException {
        Reminder found=repository.getOne(reminder.getReminderId());
        if (found==null) {
            throw new ReminderNotExistsException();
        }

        repository.saveAndFlush(reminder);
        return reminder;
    }

    /*
     * Delete an existing reminder by it's reminderId. Throw ReminderNotExistsException if
     * the reminder with specified reminderId does not exist.
     */
    @Override
    public void deleteReminder(int reminderId) throws ReminderNotExistsException {
        Reminder reminder=repository.getOne(reminderId);
        if(reminder==null){
            throw new ReminderNotExistsException();
        }
        repository.deleteById(reminderId);

    }

    /*
     * Retrieve an existing reminder by it's reminderId. Throw ReminderNotExistsException
     * if the reminder with specified reminderId does not exist.
     */
    @Override
    public Reminder getReminder(int reminderId) throws ReminderNotExistsException {
        Optional<Reminder> optional = repository.findById(reminderId);
        if (!optional.isPresent()) {
            throw new ReminderNotExistsException();
        }
        return optional.get();
    }

    /*
     * Retrieve all existing reminders
     */
    @Override
    public List<Reminder> getAllReminders() {
        return repository.findAll();
    }

}
