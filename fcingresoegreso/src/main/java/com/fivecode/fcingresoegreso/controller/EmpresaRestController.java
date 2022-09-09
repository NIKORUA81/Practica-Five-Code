package com.fivecode.fcingresoegreso.controller;

import com.fivecode.fcingresoegreso.entity.Empresa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresaRestController {

    @GetMapping("/rol/{id}")
    public Empresa findById(@PathVariable long id){
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(id);
        empresa.setNit("1000789");
        empresa.setNombre("Sotfclean");
        empresa.setTelefono("312556688");
        empresa.setEstado(true);
        return empresa;
    }

    @GetMapping("/rol")
    public List<Empresa> findAll(){
        List<Empresa> empresas = new ArrayList<Empresa>();
        Empresa empresa1 = new Empresa();
        empresa1.setIdEmpresa(1);
        empresa1.setNit("1000789");
        empresa1.setNombre("Sotfclean");
        empresa1.setTelefono("312556688");
        empresa1.setEstado(true);
        empresas.add(empresa1);

        Empresa empresa2 = new Empresa();
        empresa2.setIdEmpresa(2);
        empresa2.setNit("1000789");
        empresa2.setNombre("Sotfclean");
        empresa2.setTelefono("312556688");
        empresa2.setEstado(true);
        return empresas;
    }

    @PostMapping("/rol")
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        Empresa newEmpresa = new Empresa();
        newEmpresa.setIdEmpresa(3);
        newEmpresa.setNit(empresa.getNit());
        newEmpresa.setNombre(empresa.getNombre());
        newEmpresa.setTelefono(empresa.getTelefono());
        newEmpresa.setEstado(empresa.isEstado());
        return newEmpresa;
    }

    @PutMapping("/rol/{id}")
    public Empresa updateEmpresa(@PathVariable long id, @RequestBody Empresa empresa){
        Empresa putEmpresa = findById(id);
        putEmpresa.setNit(empresa.getNit());
        putEmpresa.setNombre(empresa.getNombre());
        putEmpresa.setTelefono(empresa.getTelefono());
        putEmpresa.setEstado(empresa.isEstado());
        return putEmpresa;
    }

    @DeleteMapping("/rol/{id}")
    public void deleteEmpresa(@PathVariable long id){
        Empresa deleteEmpresa = findById(id);
    }

}
