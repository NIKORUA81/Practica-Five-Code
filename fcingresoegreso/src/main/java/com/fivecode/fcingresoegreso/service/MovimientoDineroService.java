package com.fivecode.fcingresoegreso.service;

import com.fivecode.fcingresoegreso.entity.MovimientoDinero;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoDineroService implements IMovimientoDineroService {

    @Override
    public MovimientoDinero findById(long idTransaccion) {
        MovimientoDinero movimiento = new MovimientoDinero();
        movimiento.setIdTransaccion(idTransaccion);
        movimiento.setIdTransaccion(1);
        movimiento.setDescripcion("Venta de Mercancia");
        movimiento.setMonto(175.5f);
        return movimiento;
    }

    @Override
    public List<MovimientoDinero> findAll() {
        List<MovimientoDinero> movimientos = new ArrayList<MovimientoDinero>();
        MovimientoDinero movimientoDinero1 = new MovimientoDinero();
        movimientoDinero1.setIdTransaccion(1);
        movimientoDinero1.setDescripcion("Venta de Mercancia");
        movimientoDinero1.setMonto(145.5f);
        movimientos.add(movimientoDinero1);
        MovimientoDinero movimientoDinero2 = new MovimientoDinero();
        movimientoDinero2.setIdTransaccion(2);
        movimientoDinero2.setDescripcion("Compra de Mercancia");
        movimientoDinero2.setMonto(15.5f);
        movimientos.add(movimientoDinero2);
        return movimientos;
    }

    @Override
    public MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero) {
        MovimientoDinero newMovimientoDinero = new MovimientoDinero();
        newMovimientoDinero.setIdTransaccion(movimientoDinero.getIdTransaccion());
        newMovimientoDinero.setDescripcion(movimientoDinero.getDescripcion());
        newMovimientoDinero.setMonto(movimientoDinero.getMonto());
        return newMovimientoDinero;
    }

    @Override
    public MovimientoDinero upDaMovimientoDinero (@PathVariable long idTransaccion, @RequestBody MovimientoDinero movimientoDinero){
        MovimientoDinero patchMovimientoDinero = findById(idTransaccion);
        patchMovimientoDinero.setDescripcion(movimientoDinero.getDescripcion());
        patchMovimientoDinero.setMonto(movimientoDinero.getMonto());
        return patchMovimientoDinero;
    }

    @Override
    public MovimientoDinero updateMovimientoDinero(long idTransaccion, MovimientoDinero movimientoDinero) {
        MovimientoDinero putMovimientoDinero = findById(idTransaccion);
        putMovimientoDinero.setIdTransaccion(movimientoDinero.getIdTransaccion());
        putMovimientoDinero.setDescripcion(movimientoDinero.getDescripcion());
        putMovimientoDinero.setMonto(movimientoDinero.getMonto());
        return putMovimientoDinero;
    }

    @Override
    public void deleteMovimientoDinero(long idTransaccion) {
        MovimientoDinero deleteMovimientoDinero = findById(idTransaccion);
    }

}
