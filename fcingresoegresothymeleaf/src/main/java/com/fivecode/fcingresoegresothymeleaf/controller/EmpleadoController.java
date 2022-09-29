package com.fivecode.fcingresoegresothymeleaf.controller;

import ch.qos.logback.classic.joran.ReconfigureOnChangeTaskListener;
import com.fivecode.fcingresoegresothymeleaf.entities.Empleado;
import com.fivecode.fcingresoegresothymeleaf.entities.Empresa;
import com.fivecode.fcingresoegresothymeleaf.entities.Rol;
import com.fivecode.fcingresoegresothymeleaf.service.IEmpleadoService;
import com.fivecode.fcingresoegresothymeleaf.service.IEmpresaService;
import com.fivecode.fcingresoegresothymeleaf.service.IRolService;
import com.fivecode.fcingresoegresothymeleaf.util.EncriptarPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmpleadoController extends EncriptarPassword {

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IEmpresaService empresaService;

    @Autowired
    private IRolService rolService;

    private final Logger LOG = Logger.getLogger(""+ EmpleadoController.class);



    @GetMapping("/empleados/list")
    public String getList(Model model){
        LOG.log(Level.INFO, "getListEmpleados");
        List<Empleado> empleados = empleadoService.findAll();
        /*
        for (Empleado employee : empleados)
            System.out.println(employee.toString());
        */
        model.addAttribute("empleados", empleados);
        //Empresas
        List<Empresa> empresas = empresaService.findAll();
        model.addAttribute("empresas", empresas);

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
        //Rol
        List<Rol> roles = rolService.findAll();
        modelo.addAttribute("roles", roles);
        return "/empleados/modificar";
    }

    @PostMapping("/empleados/guardar")
    public String guardarEmpleado(@Valid Empleado employee, BindingResult error, Model model){
        LOG.log(Level.INFO, "guardarEmpleado");



        if(employee.getRol().getIdRol() == 0){
            FieldError field = new FieldError("empleado", "rol", "No puede ser null");
            error.addError(field);
        }

        if(employee.getEmpresa().getIdEmpresa() == 0) {
            FieldError field = new FieldError("empleado", "empresa", "No puede ser null");
            error.addError(field);
        }

        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());

        if(error.hasErrors()) {
            //Roles
            List<Rol> roles = rolService.findAll();
            model.addAttribute("roles", roles);
            //Empresas
            List<Empresa> empresas = empresaService.findAll();
            model.addAttribute("empresas", empresas);
            return "/empleados/modificar";
        }
        employee.setEstado(true);
        //System.out.println(employee.toString());
        employee.setClave(encriptarPassword(employee.getClave()));
        employee = empleadoService.createEmpleado(employee);
        return "redirect:/empleados/list";
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
    public String editEmpleado(@PathVariable("id") long id, Model model){
        LOG.log(Level.INFO, "editEmpleado");
        Empleado empleado = empleadoService.findById(id);
        System.out.println(empleado.toString());
        model.addAttribute("empleado", empleado);
        //Roles
        List<Rol> roles = rolService.findAll();
        model.addAttribute("roles", roles);
        //Empresas
        List<Empresa> empresas = empresaService.findAll();
        model.addAttribute("empresas", empresas);
        return "/empleados/modificar";
    }


    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public String deleteEmpleado(@PathVariable("id") long id, Model model){
        LOG.log(Level.INFO, "deleteEmpleado");
        empleadoService.deleteEmpleado(id);
        return "redirect:/empleados/list";
    }
}
