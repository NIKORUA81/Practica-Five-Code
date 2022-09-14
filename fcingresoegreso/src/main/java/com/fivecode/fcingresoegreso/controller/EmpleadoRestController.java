package com.fivecode.fcingresoegreso.controller;

import com.fivecode.fcingresoegreso.entities.Empleado;
import com.fivecode.fcingresoegreso.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/empleado/{id}")
    public Empleado findById(@PathVariable long id){
        return empleadoService.findById(id);
    }

    @GetMapping("/empleado")
    public List<Empleado> findAll(){
        return empleadoService.findAll();
    }

    @PostMapping("/empleado")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return empleadoService.createEmpleado(empleado);
    }

    @PutMapping("/empleado/{id}")
    public Empleado updateEmpleado(@PathVariable long id, @RequestBody Empleado empleado){
        return empleadoService.updateEmpleado(id, empleado);
    }

    @DeleteMapping("/empleado/{id}")
    public void deleteEmpleado(@PathVariable long id){
        empleadoService.deleteEmpleado(id);
    }
}
