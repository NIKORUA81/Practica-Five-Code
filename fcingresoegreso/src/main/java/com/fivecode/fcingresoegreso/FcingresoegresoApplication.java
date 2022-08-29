package com.fivecode.fcingresoegreso;

import com.fivecode.fcingresoegreso.entity.Empleado;
import com.fivecode.fcingresoegreso.entity.Empresa;
import com.fivecode.fcingresoegreso.entity.MovimientoDinero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FcingresoegresoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FcingresoegresoApplication.class, args);


//Creando una empresa
		Empresa empresa1 = new Empresa(123, "Camiones SA", "Calle 24", "3101234567", "1128123000");
		System.out.println("-----------Empresa-------------");
		System.out.println(empresa1.getIdEmpresa());
		System.out.println(empresa1.getNombre());
		System.out.println(empresa1.getNit());
		System.out.println(empresa1.getDireccion());
		System.out.println(empresa1.getTelefono());


		//Creando un empleado
		Empleado empleado1 = new Empleado(101, "Diego Oviedo" , "diego@gmail.com", 100456789);
		System.out.println("-----------Empleado-------------");
		System.out.println(empleado1.getIdEmpleado());
		System.out.println(empleado1.getCedula());
		System.out.println(empleado1.getNombre());
		System.out.println(empleado1.getCorreo());


		//Creando una transancción
		MovimientoDinero movimientoDinero = new MovimientoDinero(0010, "Venta de algodon tipo A", 85000);
		System.out.println("-----------Transacción-------------");
		System.out.println(movimientoDinero.getIdTransaccion());
		System.out.println(movimientoDinero.getDescripcion());
		System.out.println(movimientoDinero.getMonto());
	}

}

