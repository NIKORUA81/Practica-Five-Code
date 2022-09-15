package com.fivecode.fcingresoegresothymeleaf.repository;

import com.fivecode.fcingresoegresothymeleaf.entities.MovimientoDinero;
import org.springframework.data.repository.CrudRepository;

public interface IMovimientoRepository extends CrudRepository<MovimientoDinero, Long> {
}
