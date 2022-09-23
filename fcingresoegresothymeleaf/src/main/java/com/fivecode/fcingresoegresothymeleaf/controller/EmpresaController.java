package com.fivecode.fcingresoegresothymeleaf.controller;

import com.fivecode.fcingresoegresothymeleaf.entities.Empleado;
import com.fivecode.fcingresoegresothymeleaf.entities.Empresa;
import com.fivecode.fcingresoegresothymeleaf.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
        /*
        for (Empresa enterprise : empresas)
            System.out.println(enterprise.toString());
         */
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
    public String guardarEmpresa(@Valid Empresa enterprise, BindingResult error, Model model){
        LOG.log(Level.INFO, "guardarEmpresa");
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            return "/empresas/modificar";
        }
        enterprise.setEstado(true);
        enterprise = empresaService.createEmpresa(enterprise);
        return "redirect:/empresas/list";
    }

    @RequestMapping(value = "/empresas/editar/{id}", method = RequestMethod.GET)
    public String editEmpresa(@PathVariable("id") long id, Model model){
        LOG.log(Level.INFO, "editEmpresa");
        System.out.println(id);
        Empresa empresa = empresaService.findById(id);
        System.out.println(empresa.toString());
        model.addAttribute("empresa", empresa);
        return "/empresas/modificar";
    }

    @RequestMapping(value = "/empresas/eliminar/{id}", method = RequestMethod.GET)
    public String deleteEmpresa(@PathVariable("id") long id, Model model){
        LOG.log(Level.INFO, "deleteEmpresa");
        empresaService.deleteEmpresa(id);
        return "redirect:/empresas/list";
    }

}
