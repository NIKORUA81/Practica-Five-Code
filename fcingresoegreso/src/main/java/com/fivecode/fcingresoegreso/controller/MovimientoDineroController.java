package com.fivecode.fcingresoegreso.controller;

import com.fivecode.fcingresoegreso.entity.MovimientoDinero;
import com.fivecode.fcingresoegreso.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api")

public class MovimientoDineroController {

    @Autowired
    private IMovimientoDineroService movimientoDineroService;


    @GetMapping("/movimientoDinero/{idTransaccion}")
    public MovimientoDinero findById(@PathVariable long idTransaccion) {
        return movimientoDineroService.findById(idTransaccion);
    }

    @GetMapping("/movimientoDinero")
    public List<MovimientoDinero> findAll() {
        return movimientoDineroService.findAll();
    }

    @PostMapping("/movimientoDinero")
    public MovimientoDinero createMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero) {
        return movimientoDineroService.createMovimientoDinero(movimientoDinero);
    }

    @PatchMapping("/movimientoDinero/{idTransaccion}")
    public MovimientoDinero upDaMovimientoDinero (@PathVariable long idTransaccion, @RequestBody MovimientoDinero movimientoDinero) {
        return movimientoDineroService.upDaMovimientoDinero(idTransaccion, movimientoDinero);
    }

    @PutMapping("/movimientoDinero/{idTransaccion}")
    public MovimientoDinero updateMovimientoDinero(@PathVariable long idTransaccion, @RequestBody MovimientoDinero movimientoDinero) {
        return movimientoDineroService.updateMovimientoDinero(idTransaccion, movimientoDinero);
    }

    @DeleteMapping("/movimientoDinero/{idTransaccion}")
    public void deleteMovimientoDinero(@PathVariable long idTransaccion) {
        movimientoDineroService.deleteMovimientoDinero(idTransaccion);
    }

}
