package com.fivecode.fcingresoegreso.controller;

import com.fivecode.fcingresoegreso.entity.Rol;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RolRestController {

    @GetMapping("/rol/{id}")
    public Rol findById(@PathVariable int id){
        System.out.println(id);
        Rol rol = new Rol();
        rol.setIdRol(id);
        rol.setDescipcion("Admin");
        rol.setEstado(true);
        return rol;
    }
}
