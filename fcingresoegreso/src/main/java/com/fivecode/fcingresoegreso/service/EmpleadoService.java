package com.fivecode.fcingresoegreso.service;

import com.fivecode.fcingresoegreso.entity.Empleado;
import com.fivecode.fcingresoegreso.entity.Empresa;
import com.fivecode.fcingresoegreso.entity.Rol;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService implements IEmpleadoService{
    @Override
    public Empleado findById(long id) {
        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(id);
        empleado.setNombre("Victor Machado");
        empleado.setCorreo("Victor@asd.com");
        empleado.setCedula(1000789);
        empleado.setClave("wer234");

        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(1);
        empresa.setNit("1000789");
        empresa.setNombre("Sotfclean");
        empresa.setDireccion("Carre 80 # 23");
        empresa.setTelefono("312556688");
        empleado.setEmpresa(empresa);

        empleado.setEstado(true);
        empleado.setTelefono(312556688);

        Rol rol = Rol.Admin;
        empleado.setRol(rol);
        return empleado;
    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = new ArrayList<Empleado>();
        Empleado empleado1 = new Empleado();
        empleado1.setIdEmpleado(1);
        empleado1.setNombre("Victor Machado");
        empleado1.setCorreo("Victor@asd.com");
        empleado1.setCedula(1000789);
        empleado1.setClave("wer234");

        Empresa empresa1 = new Empresa();
        empresa1.setIdEmpresa(1);
        empresa1.setNit("1000789");
        empresa1.setNombre("Sotfclean");
        empresa1.setDireccion("Carre 80 # 23");
        empresa1.setTelefono("312556688");
        empleado1.setEmpresa(empresa1);

        empleado1.setEstado(true);
        empleado1.setTelefono(312556688);

        Rol rol1 = Rol.Admin;
        empleado1.setRol(rol1);
        empleados.add(empleado1);

        Empleado empleado2 = new Empleado();
        empleado2.setIdEmpleado(2);
        empleado2.setNombre("Carlos Hernandez");
        empleado2.setCorreo("Carlos@asd.com");
        empleado2.setCedula(1000555);
        empleado2.setClave("wer247777");

        Empresa empresa2 = new Empresa();
        empresa2.setIdEmpresa(1);
        empresa2.setNit("1000789");
        empresa2.setNombre("Sotfclean");
        empresa2.setDireccion("Carre 80 # 23");
        empresa2.setTelefono("312556688");
        empleado2.setEmpresa(empresa2);

        empleado2.setEstado(true);
        empleado2.setTelefono(312556688);

        Rol rol2 = Rol.Operario;
        empleado2.setRol(rol2);
        empleados.add(empleado2);
        return empleados;
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {
        Empleado newEmpleado = new Empleado();
        newEmpleado.setIdEmpleado(3);
        newEmpleado.setNombre(empleado.getNombre());
        newEmpleado.setCorreo(empleado.getCorreo());
        newEmpleado.setCedula(empleado.getCedula());
        newEmpleado.setClave(empleado.getClave());
        newEmpleado.setEmpresa(newEmpleado.getEmpresa());
        newEmpleado.setEstado(empleado.isEstado());
        newEmpleado.setTelefono(empleado.getTelefono());
        newEmpleado.setRol(empleado.getRol());
        return newEmpleado;
    }

    @Override
    public Empleado updateEmpleado(long id, Empleado empleado) {
        Empleado putEmpleado = findById(id);
        putEmpleado.setIdEmpleado(empleado.getIdEmpleado());
        putEmpleado.setNombre(empleado.getNombre());
        putEmpleado.setCorreo(empleado.getCorreo());
        putEmpleado.setCedula(empleado.getCedula());
        putEmpleado.setClave(empleado.getClave());
        putEmpleado.setEmpresa(empleado.getEmpresa());
        putEmpleado.setEstado(empleado.isEstado());
        putEmpleado.setTelefono(empleado.getTelefono());
        putEmpleado.setRol(empleado.getRol());
        return putEmpleado;
    }

    @Override
    public void deleteEmpleado(long id) {
        Empleado deleteEmpleado = findById(id);
    }
}
