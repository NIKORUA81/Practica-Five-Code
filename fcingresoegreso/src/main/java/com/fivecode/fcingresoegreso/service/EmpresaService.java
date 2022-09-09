package com.fivecode.fcingresoegreso.service;

import com.fivecode.fcingresoegreso.entity.Empresa;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmpresaService implements IEmpresaService {

    @Override
    public Empresa findById(long idEmpresa) {
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(idEmpresa);
        empresa.setNombre("Totto");
        empresa.setDireccion("Cl 26 Cra 15");
        empresa.setTelefono("6525984");
        empresa.setNit("800978485");
        return empresa;
    }

    @Override
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

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        Empresa newEmpresa = new Empresa();
        newEmpresa.setIdEmpresa(empresa.getIdEmpresa());
        newEmpresa.setNombre(empresa.getNombre());
        newEmpresa.setDireccion(empresa.getDireccion());
        newEmpresa.setTelefono(empresa.getTelefono());
        newEmpresa.setNit(empresa.getNit());
        return newEmpresa;
    }

    @Override
    public Empresa upDaEmpresa (@PathVariable long idEmpresa, @RequestBody Empresa empresa){
        Empresa patchEmpresa = findById(idEmpresa);
        patchEmpresa.setNombre(empresa.getNombre());
        patchEmpresa.setDireccion(empresa.getDireccion());
        patchEmpresa.setTelefono(empresa.getTelefono());
        return patchEmpresa;
    }

    @Override
    public Empresa updateEmpresa(long idEmpresa, Empresa empresa) {
        Empresa putEmpresa = findById(idEmpresa);
        putEmpresa.setIdEmpresa(empresa.getIdEmpresa());
        putEmpresa.setNombre(empresa.getNombre());
        putEmpresa.setDireccion(empresa.getDireccion());
        putEmpresa.setTelefono(empresa.getTelefono());
        putEmpresa.setTelefono(empresa.getTelefono());
        return putEmpresa;
    }

    @Override
    public void deleteEmpresa(long idEmpresa) {
        Empresa deleteEmpresa = findById(idEmpresa);
    }
}
