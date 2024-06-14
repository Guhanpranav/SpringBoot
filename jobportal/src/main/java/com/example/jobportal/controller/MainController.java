package com.example.jobportal.controller;


import com.example.jobportal.entity.Jobs;
import com.example.jobportal.entity.User;
import com.example.jobportal.repository.JobRepo;
import com.example.jobportal.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    userRepo usr;
    @Autowired
    JobRepo job;

    @PostMapping("/registerUser")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        Optional<User> u = Optional.ofNullable(usr.save(user));
        if(u.isPresent()){
            return new ResponseEntity<>(user, HttpStatus.OK);
        }

        return new ResponseEntity<>(user, HttpStatus.BAD_REQUEST);
    }


    @PostMapping("/registerJob")
    public ResponseEntity<Jobs> registerJob(@RequestBody Jobs jobs){
        Optional<Jobs> j = Optional.ofNullable(job.save(jobs));
        if(j.isPresent()){
            return new ResponseEntity<>(jobs, HttpStatus.OK);
        }

        return new ResponseEntity<>(jobs, HttpStatus.BAD_REQUEST);
    }

}
