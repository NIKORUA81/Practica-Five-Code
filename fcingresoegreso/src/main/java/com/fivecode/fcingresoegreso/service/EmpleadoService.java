package com.fivecode.fcingresoegreso.service;


import com.fivecode.fcingresoegreso.entity.Empleado;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService implements IEmpleadoService{

    @Override
    public Empleado findById(long idEmpleado) {
        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(idEmpleado);
        empleado.setNombre("Raul Huerta");
        empleado.setCorreo("notiene@notiene.com");
        empleado.setCedula(25456354);
        return empleado;
    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = new ArrayList<Empleado>();
        Empleado empleado1 = new Empleado();
        empleado1.setIdEmpleado(1);
        empleado1.setNombre("Toto Castro");
        empleado1.setCorreo("notiene@notiene.com");
        empleado1.setCedula(25456354);
        empleados.add(empleado1);
        Empleado empleado2 = new Empleado();
        empleado2.setIdEmpleado(2);
        empleado2.setNombre("Trosqui Rocas");
        empleado2.setCorreo("sitiene@sitiene.com");
        empleado2.setCedula(456354);
        empleados.add(empleado2);
        return empleados;
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {
        Empleado newEmpleado = new Empleado();
        newEmpleado.setIdEmpleado(empleado.getIdEmpleado());
        newEmpleado.setNombre(empleado.getNombre());
        newEmpleado.setCorreo(empleado.getCorreo());
        newEmpleado.setCedula(empleado.getCedula());
        return newEmpleado;
    }

    @Override
    public Empleado upDaEmpleado (@PathVariable long idEmpleado, @RequestBody Empleado empleado){
        Empleado patchEmpleado = findById(idEmpleado);
        patchEmpleado.setNombre(empleado.getNombre());
        patchEmpleado.setCorreo(empleado.getCorreo());
        return patchEmpleado;
    }

    @Override
    public Empleado updateEmpleado(long idEmpleado, Empleado empleado) {
        Empleado putEmpleado = findById(idEmpleado);
        putEmpleado.setIdEmpleado(empleado.getIdEmpleado());
        putEmpleado.setNombre(empleado.getNombre());
        putEmpleado.setCorreo(empleado.getCorreo());
        putEmpleado.setCedula(empleado.getCedula());
        return putEmpleado;
    }

    @Override
    public void deleteEmpleado(long idEmpleado) {
        Empleado deleteEmpleado = findById(idEmpleado);
    }

}
