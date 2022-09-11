package com.fivecode.fcingresoegreso.service;

import com.fivecode.fcingresoegreso.entity.MovimientoDinero;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoDineroService implements IMovimientoDineroService {

    @Override
    public MovimientoDinero findById(long idTransaccion) {
        MovimientoDinero empresa = new MovimientoDinero();
        empresa.setIdEmpresa(idTransaccion);
        empresa.setNombre("Totto");
        empresa.setDireccion("Cl 26 Cra 15");
        empresa.setTelefono("6525984");
        empresa.setNit("800978485");
        return empresa;
    }

    @Override
    public List<MovimientoDinero> findAll() {
        List<MovimientoDinero> empresas = new ArrayList<MovimientoDinero>();
        MovimientoDinero empresa1 = new MovimientoDinero();
        empresa1.setIdEmpresa(1);
        empresa1.setNombre("Totto");
        empresa1.setDireccion("Cl 26 Cra 15");
        empresa1.setTelefono("6525984");
        empresa1.setNit("800978485");
        empresas.add(empresa1);
        MovimientoDinero empresa2 = new MovimientoDinero();
        empresa2.setIdEmpresa(2);
        empresa2.setNombre("Quala");
        empresa2.setDireccion("Cr 6 Clle 155");
        empresa2.setTelefono("6520000");
        empresa2.setNit("900078485");
        empresas.add(empresa2);
        return empresas;
    }

    @Override
    public MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero) {
        MovimientoDinero newMovimientoDinero = new MovimientoDinero();
        newMovimientoDinero.setIdTransaccion(movimientoDinero.getIdTransaccion());
        newMovimientoDinero.setNombre(movimientoDinero.getNombre());
        newMovimientoDinero.setDireccion(movimientoDinero.getDireccion());
        newMovimientoDinero.setTelefono(movimientoDinero.getTelefono());
        newMovimientoDinero.setNit(empresa.getNit());
        return newMovimientoDinero;
    }

    @Override
    public MovimientoDinero upDaMovimientoDinero (@PathVariable long idTransaccion, @RequestBody Empresa empresa){
        MovimientoDinero patchMovimientoDinero = findById(idEmpresa);
        patchEmpresa.setNombre(empresa.getNombre());
        patchEmpresa.setDireccion(empresa.getDireccion());
        patchEmpresa.setTelefono(empresa.getTelefono());
        return patchEmpresa;
    }

    @Override
    public MovimientoDinero updateMovimientoDinero(long idTransaccion, MovimientoDinero movimientoDinero) {
        MovimientoDinero putMovimientoDinero = findById(idTransaccion);
        putMovimientoDinero.setIdTransaccion(movimientoDinero.getIdTransaccion());
        putMovimientoDinero.setDescripcion(movimientoDinero.getDescripcion());
        putMovimientoDinero.setMonto(movimientoDinero.getMonto());
        return putMovimientoDinero;
    }

    @Override
    public void deleteMovimientoDinero(long idTransaccion) {
        MovimientoDinero deleteMovimientoDinero = findById(idTransaccion);
    }

}
