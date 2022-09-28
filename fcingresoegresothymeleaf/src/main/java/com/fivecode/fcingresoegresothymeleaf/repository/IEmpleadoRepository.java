package com.fivecode.fcingresoegresothymeleaf.repository;

import com.fivecode.fcingresoegresothymeleaf.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {

    Empleado findByUsername(String username);

}
