package com.fivecode.fcingresoegresothymeleaf.service;

import com.fivecode.fcingresoegresothymeleaf.entities.Empleado;

import java.util.List;

public interface IEmpleadoService {

    public Empleado findById(long id);

    public List<Empleado> findAll();

    public Empleado createEmpleado(Empleado empleado);

    public Empleado updateEmpleado(long id, Empleado empleado);

    public void deleteEmpleado(long id);
}
