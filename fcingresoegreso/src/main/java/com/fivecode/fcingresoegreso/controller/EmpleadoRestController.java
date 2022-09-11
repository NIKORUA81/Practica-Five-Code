package com.fivecode.fcingresoegreso.controller;

import com.fivecode.fcingresoegreso.entity.Empleado;
import com.fivecode.fcingresoegreso.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api")

public class EmpleadoRestController {

    @Autowired
    private IEmpleadoService empleadoService;


    @GetMapping("/empleado/{idEmpleado}")
    public Empleado findById(@PathVariable long idEmpleado) { return empleadoService.findById(idEmpleado);
    }

    @GetMapping("/empleado")
    public List<Empleado> findAll() {
        return empleadoService.findAll();
    }

    @PostMapping("/empleado")
    public Empleado createEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.createEmpleado(empleado);
    }

    @PatchMapping("/empleado/{idEmpleado}")
    public Empleado upDaEmpleado (@PathVariable long idEmpleado, @RequestBody Empleado empleado) {
        return empleadoService.upDaEmpleado(idEmpleado, empleado);
    }

    @PutMapping("/empleado/{idEmpleado}")
    public Empleado updateEmpleado(@PathVariable long idEmpleado, @RequestBody Empleado empleado) {
        return empleadoService.updateEmpleado(idEmpleado, empleado);
    }

    @DeleteMapping("/empleado/{idEmpleado}")
    public void deleteEmpleado(@PathVariable long idEmpleado) {
        empleadoService.deleteEmpleado(idEmpleado);
    }

}

