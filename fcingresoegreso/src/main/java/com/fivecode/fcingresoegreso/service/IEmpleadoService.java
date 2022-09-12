package com.fivecode.fcingresoegreso.service;

import com.fivecode.fcingresoegreso.entity.Empleado;

import java.util.List;

public interface IEmpleadoService {

    public Empleado findById (long idEmpleado);

    public List<Empleado> findAll();

    public Empleado createEmpleado(Empleado empleado);

    public Empleado upDaEmpleado(long idEmpleado, Empleado empleado);

    public Empleado updateEmpleado(long idEmpleado, Empleado empleado);

    public void deleteEmpleado(long idEmpleado);

}
