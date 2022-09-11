package com.fivecode.fcingresoegreso.controller;

import com.fivecode.fcingresoegreso.entity.Empleado;
import com.fivecode.fcingresoegreso.entity.Empresa;
import com.fivecode.fcingresoegreso.entity.MovimientoDinero;
import com.fivecode.fcingresoegreso.entity.Rol;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

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

        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(1);
        empresa.setNit("1000789");
        empresa.setNombre("Sotfclean");
        empresa.setDireccion("Carre 80 # 23");
        empresa.setTelefono("312556688");
        empleado.setEmpresa(empresa);

        movimiento.setEstado(true);
        movimiento.setFecha(LocalTime.now());

        return movimiento;
    }
}
