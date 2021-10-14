package com.user.usermanager.service;

import com.user.usermanager.repo.ExerciceRepository;
import com.user.usermanager.exception.UserNotFoundException;
import com.user.usermanager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ExerciceService {

    private final ExerciceRepository exerciceRepository;

    @Autowired
    public ExerciceService(ExerciceRepository exerciceRepository) {

        this.exerciceRepository = exerciceRepository;
    }

    public User addUser(User user){
        user.setUserCode(UUID.randomUUID().toString());
        return exerciceRepository.save(user);
    }

    public List<User> findAllUsers() {
        return exerciceRepository.findAll();
    }

    public User updateUser(User user) {
        return exerciceRepository.save(user);
    }

    public User findUserById(Long id){
        return (User) exerciceRepository.findUserById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));

    }
    public void deleteUser(Long id){
        exerciceRepository.deleteUserById(id);
    }

}
