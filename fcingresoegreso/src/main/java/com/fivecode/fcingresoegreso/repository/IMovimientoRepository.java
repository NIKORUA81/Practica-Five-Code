package com.fivecode.fcingresoegreso.repository;

import com.fivecode.fcingresoegreso.entities.MovimientoDinero;
import org.springframework.data.repository.CrudRepository;

public interface IMovimientoRepository extends CrudRepository<MovimientoDinero, Long> {
}
