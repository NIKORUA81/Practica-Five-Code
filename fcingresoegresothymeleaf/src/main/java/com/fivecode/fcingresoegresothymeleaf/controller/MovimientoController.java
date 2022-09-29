package com.fivecode.fcingresoegresothymeleaf.controller;

import com.fivecode.fcingresoegresothymeleaf.entities.Empleado;
import com.fivecode.fcingresoegresothymeleaf.entities.Empresa;
import com.fivecode.fcingresoegresothymeleaf.entities.MovimientoDinero;
import com.fivecode.fcingresoegresothymeleaf.service.IEmpleadoService;
import com.fivecode.fcingresoegresothymeleaf.service.IEmpresaService;
import com.fivecode.fcingresoegresothymeleaf.service.IMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class MovimientoController {

    @Autowired
    private IMovimientoService movimientoService;

    @Autowired
    private IEmpleadoService empleadoService;


    private final Logger LOG = Logger.getLogger(""+ MovimientoController.class);

    @GetMapping("/movimientos/list")
    public String getList(Model model){
        LOG.log(Level.INFO, "getListMovimientos");
        List<MovimientoDinero> movimientos = movimientoService.findAll();
        /*
        for (MovimientoDinero moven : movimientos)
            System.out.println(moven.toString());
        */
        model.addAttribute("movimientos", movimientos);
        List<Empleado> empleados = empleadoService.findAll();
        model.addAttribute("empleados", empleados);
        return "/movimientos/list";
    }

    @GetMapping("/movimientos/crear")
    public String createMovimiento(Model modelo){
        LOG.log(Level.INFO, "createMovimiento");
        //Movimiento
        MovimientoDinero movimiento = new MovimientoDinero();
        modelo.addAttribute("movimiento", movimiento);
        //Empleado
        List<Empleado> empleados = empleadoService.findAll();
        modelo.addAttribute("empleados", empleados);
        return "/movimientos/modificar";
    }

    @PostMapping("/movimientos/guardar")
    public String guardarMovimiento(@Valid MovimientoDinero moven, BindingResult error, Model model){
        LOG.log(Level.INFO, "guardarMovimiento");

        if(moven.getEmpleado().getIdEmpleado() == 0){
            FieldError field = new FieldError("moven", "empleado", "No puede ser null");
            error.addError(field);
        }

        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            //Empleados
            List<Empleado> empleados = empleadoService.findAll();
            model.addAttribute("empleados", empleados);
            return "/movimientos/modificar";
        }

        moven.setEstado(true);
        //System.out.println(moven.toString());
        moven = movimientoService.createMovimiento(moven);
        return "redirect:/movimientos/list";
    }

    @RequestMapping(value = "/movimientos/editar/{id}", method = RequestMethod.GET)
    public String editMovimientos(@PathVariable("id") long id, Model model){
        LOG.log(Level.INFO, "editMovimientos");
        System.out.println(id);
        MovimientoDinero moven = movimientoService.findById(id);
        System.out.println(moven.toString());
        model.addAttribute("moven", moven);
        //Empleados
        List<Empleado> empleados = empleadoService.findAll();
        model.addAttribute("empleados", empleados);
        return "/movimientos/modificar";
    }

    @RequestMapping(value = "/movimientos/eliminar/{id}", method = RequestMethod.GET)
    public String deleteMovimiento(@PathVariable("id") long id, Model model){
        LOG.log(Level.INFO, "deleteMovimiento");
        movimientoService.deleteMovimiento(id);
        return "redirect:/movimientos/list";
    }
}
