package com.fivecode.fcingresoegreso.service;

import com.fivecode.fcingresoegreso.entity.Empresa;


import java.util.List;

public interface IEmpresaService {

    public Empresa findById (long idEmpresa);

    public List<Empresa> findAll();

    public Empresa createEmpresa(Empresa empresa);
    public Empresa upDaEmpresa (long idEmpresa, Empresa empresa);

    public Empresa updateEmpresa(long idEmpresa, Empresa empresa);

    public void deleteEmpresa(long idEmpresa);
}
