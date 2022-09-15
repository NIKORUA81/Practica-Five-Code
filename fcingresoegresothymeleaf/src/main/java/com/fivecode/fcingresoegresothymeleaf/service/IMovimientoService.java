package com.fivecode.fcingresoegresothymeleaf.service;

import com.fivecode.fcingresoegresothymeleaf.entities.MovimientoDinero;

import java.util.List;

public interface IMovimientoService {

    public MovimientoDinero findById(long id);

    public List<MovimientoDinero> findAll();

    public MovimientoDinero createMovimiento(MovimientoDinero movimiento);

    public MovimientoDinero updateMovimiento(long id, MovimientoDinero movimiento);

    public void deleteMovimiento(long id);
}
