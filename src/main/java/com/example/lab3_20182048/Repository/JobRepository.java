package com.example.lab3_20182048.Repository;


import com.example.lab3_20182048.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, String> {
}