package com.fivecode.fcingresoegresothymeleaf.controller;

import com.fivecode.fcingresoegresothymeleaf.entities.Empleado;
import com.fivecode.fcingresoegresothymeleaf.entities.Empresa;
import com.fivecode.fcingresoegresothymeleaf.service.IEmpleadoService;
import com.fivecode.fcingresoegresothymeleaf.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmpleadoController {

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IEmpresaService empresaService;

    private final Logger LOG = Logger.getLogger(""+ EmpleadoController.class);

    @GetMapping("/empleados/list")
    public String getList(Model model){
        LOG.log(Level.INFO, "getListEmpleados");
        List<Empleado> empleados = empleadoService.findAll();

        for (Empleado employee : empleados)
            System.out.println(employee.toString());
        model.addAttribute("empleados", empleados);

        return "/empleados/list";
    }

    @GetMapping("/empleados/crear")
    public String createEmpleado(Model modelo){
        LOG.log(Level.INFO, "createEmpleado");
        //Empleado
        Empleado empleado = new Empleado();
        modelo.addAttribute("empleado", empleado);
        //Empresas
        List<Empresa> empresas = empresaService.findAll();
        modelo.addAttribute("empresas", empresas);
        return "/empleados/modificar";
    }

}
