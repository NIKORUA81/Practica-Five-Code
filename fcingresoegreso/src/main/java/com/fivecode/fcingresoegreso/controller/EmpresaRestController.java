package com.fivecode.fcingresoegreso.controller;

import com.fivecode.fcingresoegreso.entity.Empresa;
import com.fivecode.fcingresoegreso.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api")

public class EmpresaRestController {

    @Autowired
    private IEmpresaService empresaService;


    @GetMapping("/empresa/{idEmpresa}")
    public Empresa findById(@PathVariable long idEmpresa) { return empresaService.findById(idEmpresa);
    }

    @GetMapping("/empresa")
    public List<Empresa> findAll() {
        return empresaService.findAll();
    }

    @PostMapping("/empresa")
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return empresaService.createEmpresa(empresa);
    }

    @PatchMapping("/empresa/{idEmpresa}")
    public Empresa upDaEmpresa (@PathVariable long idEmpresa, @RequestBody Empresa empresa) {
        return empresaService.upDaEmpresa(idEmpresa, empresa);
    }

    @PutMapping("/empresa/{idEmpresa}")
    public Empresa updateEmpresa(@PathVariable long idEmpresa, @RequestBody Empresa empresa) {
        return empresaService.updateEmpresa(idEmpresa, empresa);
    }

    @DeleteMapping("/empresa/{idEmpresa}")
    public void deleteEmpresa(@PathVariable long idEmpresa) {
        empresaService.deleteEmpresa(idEmpresa);
    }

}
