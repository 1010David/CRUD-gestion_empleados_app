package com.employee_management.backend.repository;


import com.employee_management.backend.modelo.empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository <empleado, Long> {


}
