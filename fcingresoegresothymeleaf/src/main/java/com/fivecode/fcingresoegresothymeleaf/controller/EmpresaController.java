package com.fivecode.fcingresoegresothymeleaf.controller;

import com.fivecode.fcingresoegresothymeleaf.entities.Empleado;
import com.fivecode.fcingresoegresothymeleaf.entities.Empresa;
import com.fivecode.fcingresoegresothymeleaf.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmpresaController {

    @Autowired
    private IEmpresaService empresaService;

    private final Logger LOG = Logger.getLogger(""+ EmpresaController.class);

    @GetMapping("/empresas/list")
    public String getList(Model model){
        LOG.log(Level.INFO, "getListEmpresas");
        List<Empresa> empresas = empresaService.findAll();

        for (Empresa enterprise : empresas)
            System.out.println(enterprise.toString());
        model.addAttribute("empresas", empresas);
        return "/empresas/list";
    }

    @GetMapping("/empresas/crear")
    public String createEmpresa(Model modelo){
        LOG.log(Level.INFO, "createEmpresa");
        Empresa empresa = new Empresa();
        modelo.addAttribute("empresa", empresa);
        return "/empresas/modificar";
    }

    @PostMapping("/empresas/guardar")
    public String guardarEmpresa(Empresa enterprise){
        LOG.log(Level.INFO, "guardarEmpresa");
        enterprise.setEstado(true);
        System.out.println(enterprise.toString());
        enterprise = empresaService.createEmpresa(enterprise);
        return "redirect:/empresas/list";
    }
}
