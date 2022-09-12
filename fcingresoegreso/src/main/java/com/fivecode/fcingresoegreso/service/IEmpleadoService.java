package com.fivecode.fcingresoegreso.service;

import com.fivecode.fcingresoegreso.entity.Empleado;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IEmpleadoService {

    public Empleado findById(long id);

    public List<Empleado> findAll();

    public Empleado createEmpleado(Empleado empleado);

    public Empleado updateEmpleado(long id, Empleado empleado);

    public void deleteEmpleado(long id);
}
