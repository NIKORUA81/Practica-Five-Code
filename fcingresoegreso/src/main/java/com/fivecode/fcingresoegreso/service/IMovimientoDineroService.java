package com.fivecode.fcingresoegreso.service;

import com.fivecode.fcingresoegreso.entity.MovimientoDinero;


import java.util.List;

public interface IMovimientoDineroService {

    public MovimientoDinero findById (long idTransaccion);

    public List<MovimientoDinero> findAll();

    public MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero);
    public MovimientoDinero upDaMovimientoDinero (long idTransaccion, MovimientoDinero movimientoDinero);

    public MovimientoDinero updateMovimientoDinero(long idTransaccion, MovimientoDinero movimientoDinero);

    public void deleteMovimientoDinero(long idTransaccion);

}
