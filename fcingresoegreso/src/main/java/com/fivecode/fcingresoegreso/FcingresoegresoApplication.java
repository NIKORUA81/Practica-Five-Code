package com.fivecode.fcingresoegreso;

import com.fivecode.fcingresoegreso.entity.Empleado;
import com.fivecode.fcingresoegreso.entity.Empresa;
import com.fivecode.fcingresoegreso.entity.Transaccion;
import org.springframework.boot.SpringApplication;
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
		System.out.println(empresa1.getDocumento());
		System.out.println(empresa1.getDireccion());
		System.out.println(empresa1.getTelefono());



		//Creando un empleado
		Empleado empleado1 = new Empleado(101, "Diego", "Oviedo", "diego@gmail.com", 100456789);
		System.out.println("-----------Empleado-------------");
		System.out.println(empleado1.getIdEmpleado());
		System.out.println(empleado1.getCedula());
		System.out.println(empleado1.getNombre());
		System.out.println(empleado1.getApellido());
		System.out.println(empleado1.getCorreo());


		//Creando una transancción
		Transaccion transaccion1 = new Transaccion(0010, "Venta de algodon tipo A", 85000);
		System.out.println("-----------Transacción-------------");
		System.out.println(transaccion1.getIdTransaccion());
		System.out.println(transaccion1.getDescripcion());
		System.out.println(transaccion1.getMonto());
	}

}
