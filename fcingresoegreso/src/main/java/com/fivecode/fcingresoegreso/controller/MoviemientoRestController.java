package com.fivecode.fcingresoegreso.controller;

import com.fivecode.fcingresoegreso.entities.MovimientoDinero;
import com.fivecode.fcingresoegreso.service.IMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private IMovimientoService movimientoService;

    @GetMapping("/movimiento/{id}")
    public MovimientoDinero findById(@PathVariable long id){
        return movimientoService.findById(id);
    }

    @GetMapping("/movimiento")
    public List<MovimientoDinero> findAll(){
        return movimientoService.findAll();
    }

    @PostMapping("/movimiento")
    public MovimientoDinero createMovimiento(@RequestBody MovimientoDinero movimiento){
        return movimientoService.createMovimiento(movimiento);
    }

    @PutMapping("/movimiento/{id}")
    public MovimientoDinero updateMovimiento(@PathVariable long id, @RequestBody MovimientoDinero movimiento){
        return movimientoService.updateMovimiento(id, movimiento);
    }

    @DeleteMapping("/movimiento/{id}")
    public void deleteMovimiento(@PathVariable long id){
        movimientoService.deleteMovimiento(id);
    }
}
