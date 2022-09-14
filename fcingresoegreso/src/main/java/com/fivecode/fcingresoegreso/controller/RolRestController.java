package com.fivecode.fcingresoegreso.controller;

import com.fivecode.fcingresoegreso.entities.RolPrueba;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RolRestController {

    @GetMapping("/rol/{id}")
    public RolPrueba findById(@PathVariable int id){
        RolPrueba rolPrueba = new RolPrueba();
        rolPrueba.setIdRol(id);
        rolPrueba.setDescipcion("Admin");
        rolPrueba.setEstado(true);
        return rolPrueba;
    }

    @GetMapping("/rol")
    public List<RolPrueba> findAll(){
        List<RolPrueba> roles = new ArrayList<RolPrueba>();
        RolPrueba rolPrueba1 = new RolPrueba();
        rolPrueba1.setIdRol(1);
        rolPrueba1.setDescipcion("Admin");
        rolPrueba1.setEstado(true);
        roles.add(rolPrueba1);
        RolPrueba rolPrueba2 = new RolPrueba();
        rolPrueba2.setIdRol(2);
        rolPrueba2.setDescipcion("User");
        rolPrueba2.setEstado(true);
        roles.add(rolPrueba2);
        return roles;
    }

    @PostMapping("/rol")
    public RolPrueba createRol(@RequestBody RolPrueba rolPrueba){
        RolPrueba newRolPrueba = new RolPrueba();
        newRolPrueba.setIdRol(3);
        newRolPrueba.setDescipcion(rolPrueba.getDescipcion());
        newRolPrueba.setEstado(rolPrueba.isEstado());
        return newRolPrueba;
    }

    @PutMapping("/rol/{id}")
    public RolPrueba updateRol(@PathVariable int id, @RequestBody RolPrueba rolPrueba){
        RolPrueba putRolPrueba = findById(id);
        putRolPrueba.setDescipcion(rolPrueba.getDescipcion());
        putRolPrueba.setEstado(rolPrueba.isEstado());
        return putRolPrueba;
    }

    @DeleteMapping("/rol/{id}")
    public void deleteRol(@PathVariable int id){
        RolPrueba deleteRolPrueba = findById(id);
    }
}
