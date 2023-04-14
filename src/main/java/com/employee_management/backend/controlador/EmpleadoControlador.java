package com.employee_management.backend.controlador;


import com.employee_management.backend.modelo.empleado;
import com.employee_management.backend.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmpleadoControlador {
    @Autowired
    private EmpleadoRepository repositorio;
    @GetMapping("/empleados")
    public List<empleado> listarTodosLosEmpleados(){
        return repositorio.findAll();
    }

}
