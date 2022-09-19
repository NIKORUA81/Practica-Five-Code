package com.fivecode.fcingresoegresothymeleaf.controller;

import com.fivecode.fcingresoegresothymeleaf.entities.MovimientoDinero;
import com.fivecode.fcingresoegresothymeleaf.service.IEmpleadoService;
import com.fivecode.fcingresoegresothymeleaf.service.IEmpresaService;
import com.fivecode.fcingresoegresothymeleaf.service.IMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class MovimientoController {

    @Autowired
    private IMovimientoService movimientoService;

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IEmpresaService empresaService;

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
        return "/movimientos/list";
    }

    @GetMapping("/movimientos/crear")
    public String createMovimiento(Model modelo){
        LOG.log(Level.INFO, "createMovimiento");
        MovimientoDinero movimiento = new MovimientoDinero();
        modelo.addAttribute("movimiento", movimiento);
        return "/movimientos/modificar";
    }

    @PostMapping("/movimientos/guardar")
    public String guardarMovimiento(MovimientoDinero moven){
        LOG.log(Level.INFO, "guardarMovimiento");
        moven.setEstado(true);
        System.out.println(moven.toString());
        moven = movimientoService.createMovimiento(moven);
        return "redirect:/movimientos/list";
    }
}
