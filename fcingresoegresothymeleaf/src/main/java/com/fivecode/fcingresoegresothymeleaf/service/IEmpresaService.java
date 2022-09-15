package com.fivecode.fcingresoegresothymeleaf.service;

import com.fivecode.fcingresoegresothymeleaf.entities.Empresa;

import java.util.List;

public interface IEmpresaService {

    public Empresa findById(long id);

    public List<Empresa> findAll();

    public Empresa createEmpresa(Empresa empresa);

    public Empresa updateEmpresa(long id, Empresa empresa);

    public void deleteEmpresa(long id);
}
