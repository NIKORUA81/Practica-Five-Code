package com.fivecode.fcingresoegreso.service;

import com.fivecode.fcingresoegreso.entities.MovimientoDinero;
import com.fivecode.fcingresoegreso.repository.IMovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimientoService implements IMovimientoService{

    @Autowired
    private IMovimientoRepository movimientoRepository;
    @Override
    public MovimientoDinero findById(long id) {
        Optional<MovimientoDinero> movimiento = movimientoRepository.findById(id);
        return movimiento.get();
    }

    @Override
    public List<MovimientoDinero> findAll() {
        List<MovimientoDinero> movimientos = (List<MovimientoDinero>) movimientoRepository.findAll();
        return movimientos;
    }

    @Override
    public MovimientoDinero createMovimiento(MovimientoDinero movimiento) {
        MovimientoDinero newMovimiento = movimientoRepository.save(movimiento);
        return newMovimiento;
    }

    @Override
    public MovimientoDinero updateMovimiento(long id, MovimientoDinero movimiento) {
        MovimientoDinero putMovimiento = movimientoRepository.save(movimiento);
        return putMovimiento;
    }

    @Override
    public void deleteMovimiento(long id) {
        movimientoRepository.deleteById(id);
    }
}
