package com.fivecode.fcingresoegreso.service;

import com.fivecode.fcingresoegreso.entity.Empresa;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmpresaService implements IEmpresaService {

    @Override
    public static Empresa findById(int id) {
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(id);
        empresa.setNombre("Totto");
        empresa.setDireccion("Cl 26 Cra 15");
        empresa.setTelefono("6525984");
        empresa.setNit("800978485");
        return empresa;
    }

    @Override
    public List<Empresa> findAll() {
        return null;
    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        return null;
    }

    @Override
    public Empresa updateEmpresa(int id, Empresa empresa) {
        return null;
    }

    @Override
    public void deleteEmpresa(int id) {

    }
}
