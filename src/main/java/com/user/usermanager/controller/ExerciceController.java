package com.user.usermanager.controller;

import com.user.usermanager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExerciceController {

    @Autowired
    private ExerciceController exerciceController;


    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = ExerciceService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
