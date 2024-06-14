package com.example.jobportal.repository;


import com.example.jobportal.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<Jobs,Integer> {
}
