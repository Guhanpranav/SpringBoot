package com.example.jobportal.repository;

import com.example.jobportal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<User, Integer> {

}
