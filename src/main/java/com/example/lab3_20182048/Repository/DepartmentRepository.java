package com.example.lab3_20182048.Repository;


import com.example.lab3_20182048.Entity.Department;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    @Transactional
    @Modifying
    @Query(value = "update departments set location_id=?1 where department_id=?2",nativeQuery = true)
    void cambiarCiudadPorId(Integer idCiudad,Integer idDepartamento);
}