package com.fivecode.fcingresoegreso.controller;

import com.fivecode.fcingresoegreso.entity.Empresa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping("/empresa/{id}")
    public Empresa findById(@PathVariable long id){
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(id);
        empresa.setNit("1000789");
        empresa.setNombre("Sotfclean");
        empresa.setDireccion("Carre 80 # 23");
        empresa.setTelefono("312556688");
        empresa.setEstado(true);
        return empresa;
    }

    @GetMapping("/empresa")
    public List<Empresa> findAll(){
        List<Empresa> empresas = new ArrayList<Empresa>();
        Empresa empresa1 = new Empresa();
        empresa1.setIdEmpresa(1);
        empresa1.setNit("1000789");
        empresa1.setNombre("Sotfclean");
        empresa1.setDireccion("Carre 80 # 23");
        empresa1.setTelefono("312556688");
        empresa1.setEstado(true);
        empresas.add(empresa1);

        Empresa empresa2 = new Empresa();
        empresa2.setIdEmpresa(2);
        empresa2.setNit("1000233");
        empresa2.setNombre("Gama Alta");
        empresa2.setDireccion("Carre 43 # 14");
        empresa2.setTelefono("310556698");
        empresa2.setEstado(true);
        empresas.add(empresa2);
        return empresas;
    }

    @PostMapping("/empresa")
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        Empresa newEmpresa = new Empresa();
        newEmpresa.setIdEmpresa(3);
        newEmpresa.setNit(empresa.getNit());
        newEmpresa.setNombre(empresa.getNombre());
        newEmpresa.setDireccion(empresa.getDireccion());
        newEmpresa.setTelefono(empresa.getTelefono());
        newEmpresa.setEstado(empresa.isEstado());
        return newEmpresa;
    }

    @PutMapping("/empresa/{id}")
    public Empresa updateEmpresa(@PathVariable long id, @RequestBody Empresa empresa){
        Empresa putEmpresa = findById(id);
        putEmpresa.setNit(empresa.getNit());
        putEmpresa.setNombre(empresa.getNombre());
        putEmpresa.setDireccion(empresa.getDireccion());
        putEmpresa.setTelefono(empresa.getTelefono());
        putEmpresa.setEstado(empresa.isEstado());
        return putEmpresa;
    }

    @DeleteMapping("/empresa/{id}")
    public void deleteEmpresa(@PathVariable long id){

        Empresa deleteEmpresa = findById(id);
    }

}
