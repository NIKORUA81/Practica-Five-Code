package com.fivecode.fcingresoegreso.controller;

import com.fivecode.fcingresoegreso.entity.Empleado;
import com.fivecode.fcingresoegreso.entity.Empresa;
import com.fivecode.fcingresoegreso.entity.MovimientoDinero;
import com.fivecode.fcingresoegreso.entity.Rol;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class MoviemientoRestController {

    /*
    private long idTransaccion;
    private String descripcion;
    private float monto;
    private Empleado empleado;
    private boolean estado;
    private Empresa empresa;
    private Date fecha
    */

    @GetMapping("/movimiento/{id}")
    public MovimientoDinero findById(@PathVariable long id){
        MovimientoDinero movimiento = new MovimientoDinero();
        movimiento.setIdTransaccion(id);
        movimiento.setDescripcion("Venta de limpiadores");
        movimiento.setMonto(45000);

        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(1);
        empleado.setNombre("Victor Machado");
        empleado.setCorreo("Victor@asd.com");
        empleado.setCedula(1000789);
        empleado.setClave("wer234");
        movimiento.setEmpleado(empleado);

        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(1);
        empresa.setNit("1000789");
        empresa.setNombre("Sotfclean");
        empresa.setDireccion("Carre 80 # 23");
        empresa.setTelefono("312556688");
        movimiento.setEmpresa(empresa);

        movimiento.setEstado(true);
        movimiento.setFecha(LocalTime.now());

        return movimiento;
    }

    @GetMapping("/movimiento")
    public List<MovimientoDinero> findAll(){
        List<MovimientoDinero> movimientos = new ArrayList<>();
        //Movimiento de Dinero 1 -------------------------------
        MovimientoDinero movimiento1 = new MovimientoDinero();
        movimiento1.setIdTransaccion(1);
        movimiento1.setDescripcion("Venta de limpiadores");
        movimiento1.setMonto(45000);

        Empleado empleado1 = new Empleado();
        empleado1.setIdEmpleado(1);
        empleado1.setNombre("Victor Machado");
        empleado1.setCorreo("Victor@asd.com");
        empleado1.setCedula(1000789);
        empleado1.setClave("wer234");
        empleado1.setEstado(true);
        empleado1.setTelefono(312556688);

        Empresa empresa1 = new Empresa();
        empresa1.setIdEmpresa(1);
        empresa1.setNit("1000789");
        empresa1.setNombre("Sotfclean");
        empresa1.setDireccion("Carre 80 # 23");
        empresa1.setTelefono("312556688");

        movimiento1.setEmpresa(empresa1);

        movimiento1.setEmpleado(empleado1);

        movimiento1.setEstado(true);
        movimiento1.setFecha(LocalTime.now());
        movimientos.add(movimiento1);

        //Movimiento de Dinero 1 -------------------------------
        MovimientoDinero movimiento2 = new MovimientoDinero();
        movimiento2.setIdTransaccion(2);
        movimiento2.setDescripcion("Venta de quimicos");
        movimiento2.setMonto(75000);

        Empleado empleado2 = new Empleado();
        empleado2.setIdEmpleado(2);
        empleado2.setNombre("Carlos Hernandez");
        empleado2.setCorreo("Carlos@asd.com");
        empleado2.setCedula(1000555);
        empleado2.setClave("wer247777");
        empleado2.setEstado(true);
        empleado2.setTelefono(312556688);

        Empresa empresa2 = new Empresa();
        empresa2.setIdEmpresa(1);
        empresa2.setNit("1000789");
        empresa2.setNombre("Sotfclean");
        empresa2.setDireccion("Carre 80 # 23");
        empresa2.setTelefono("312556688");

        movimiento2.setEmpresa(empresa2);

        movimiento2.setEmpleado(empleado2);

        movimiento2.setEstado(true);
        movimiento2.setFecha(LocalTime.now());
        movimientos.add(movimiento2);

        return movimientos;
    }

    @PostMapping("/empleado")
    public MovimientoDinero createMovimiento(@RequestBody MovimientoDinero movimiento){
        MovimientoDinero newMovimiento = new MovimientoDinero();
        newMovimiento.setIdTransaccion(3);
        newMovimiento.setDescripcion(movimiento.getDescripcion());
        newMovimiento.setMonto(movimiento.getMonto());

        newMovimiento.setEmpleado(movimiento.getEmpleado());
        newMovimiento.setEmpresa(movimiento.getEmpresa());

        newMovimiento.setEstado(movimiento.isEstado());
        newMovimiento.setFecha(LocalTime.now());
        return newMovimiento;
    }

    @PutMapping("/movimiento/{id}")
    public MovimientoDinero updateMovimiento(@PathVariable long id, @RequestBody MovimientoDinero movimiento){
        MovimientoDinero putMOvimiento = findById(id);
        putMOvimiento.setIdTransaccion(movimiento.getIdTransaccion());
        putMOvimiento.setDescripcion(movimiento.getDescripcion());
        putMOvimiento.setMonto(movimiento.getMonto());

        putMOvimiento.setEmpleado(movimiento.getEmpleado());
        putMOvimiento.setEmpresa(movimiento.getEmpresa());

        putMOvimiento.setEstado(movimiento.isEstado());
        putMOvimiento.setFecha(LocalTime.now());
        return putMOvimiento;
    }

    @DeleteMapping("/movimiento/{id}")
    public void deleteMovimiento(@PathVariable long id){

        MovimientoDinero deleteMovimiento = findById(id);
    }
}
