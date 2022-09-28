package com.fivecode.fcingresoegresothymeleaf.service;

import com.fivecode.fcingresoegresothymeleaf.entities.Rol;

import java.util.List;

public interface IRolService {

    public Rol findById(long id);


    public List<Rol> findAll();

    public Rol createRol(Rol rol);

    public Rol updateRol(int id, Rol rol);

    public void deleteRol(int id);
}
