package com.fivecode.fcingresoegreso.controller;



import com.fivecode.fcingresoegreso.entity.Empresa;
import com.fivecode.fcingresoegreso.service.EmpresaService;
import com.fivecode.fcingresoegreso.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping ("/api")

public class EmpresaRestController {

    @Autowired
    private IEmpresaService empresaService;


    @GetMapping("/empresa/{id}")
    public Empresa findById(@PathVariable int id) {
        return EmpresaService.findById(id);
    }

    @GetMapping("/empresa")
    public List<Empresa> findAll() {
        List<Empresa> empresas = new ArrayList<Empresa>();
        Empresa empresa1 = new Empresa();
        empresa1.setIdEmpresa(1);
        empresa1.setNombre("Totto");
        empresa1.setDireccion("Cl 26 Cra 15");
        empresa1.setTelefono("6525984");
        empresa1.setNit("800978485");
        empresas.add(empresa1);
        Empresa empresa2 = new Empresa();
        empresa2.setIdEmpresa(2);
        empresa2.setNombre("Quala");
        empresa2.setDireccion("Cr 6 Clle 155");
        empresa2.setTelefono("6520000");
        empresa2.setNit("900078485");
        empresas.add(empresa2);
        return empresas;
    }

    @PostMapping("/empresa")
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        Empresa newEmpresa = new Empresa();
        newEmpresa.setIdEmpresa(empresa.getIdEmpresa());
        newEmpresa.setNombre(empresa.getNombre());
        newEmpresa.setDireccion(empresa.getDireccion());
        newEmpresa.setTelefono(empresa.getTelefono());
        newEmpresa.setTelefono(empresa.getTelefono());
        return newEmpresa;

    }

    @PutMapping("/empresa/{id}")
    public Empresa updateEmpresa(@PathVariable int id, @RequestBody Empresa empresa) {
        Empresa putEmpresa = findById(id);
        putEmpresa.setIdEmpresa(empresa.getIdEmpresa());
        putEmpresa.setNombre(empresa.getNombre());
        putEmpresa.setDireccion(empresa.getDireccion());
        putEmpresa.setTelefono(empresa.getTelefono());
        putEmpresa.setTelefono(empresa.getTelefono());
        return putEmpresa;
    }

    @DeleteMapping("/empresa/{id}")
    public void deleteEmpresa(@PathVariable int id) {
        Empresa deleteEmpresa = findById(id);
    }

}
