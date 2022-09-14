package com.fivecode.fcingresoegreso.controller;

import com.fivecode.fcingresoegreso.entities.Empresa;
import com.fivecode.fcingresoegreso.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresaRestController {

    /*
    private long idEmpresa;
    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;
    private boolean estado;
    * */

    @Autowired
    private IEmpresaService empresaService;

    @GetMapping("/empresa/{id}")
    public Empresa findById(@PathVariable long id){
        return empresaService.findById(id);
    }

    @GetMapping("/empresa")
    public List<Empresa> findAll(){
        return empresaService.findAll();
    }

    @PostMapping("/empresa")
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return empresaService.createEmpresa(empresa);
    }

    @PutMapping("/empresa/{id}")
    public Empresa updateEmpresa(@PathVariable long id, @RequestBody Empresa empresa){
        return empresaService.updateEmpresa(id, empresa);
    }

    @DeleteMapping("/empresa/{id}")
    public void deleteEmpresa(@PathVariable long id){
        empresaService.deleteEmpresa(id);
    }

}
