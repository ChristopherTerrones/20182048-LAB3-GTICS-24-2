package com.example.lab3_20182048.Repository;

import com.example.lab3_20182048.Entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}