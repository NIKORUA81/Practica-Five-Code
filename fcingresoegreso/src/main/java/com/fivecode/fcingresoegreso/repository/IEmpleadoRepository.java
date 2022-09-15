package com.fivecode.fcingresoegreso.repository;

import com.fivecode.fcingresoegreso.entities.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends CrudRepository<Empleado, Long> {
}
