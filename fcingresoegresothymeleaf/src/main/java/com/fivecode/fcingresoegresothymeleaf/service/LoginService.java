package com.fivecode.fcingresoegresothymeleaf.service;

import com.fivecode.fcingresoegresothymeleaf.entities.Empleado;
import com.fivecode.fcingresoegresothymeleaf.repository.IEmpleadoRepository;
import com.fivecode.fcingresoegresothymeleaf.repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("UserDetailsService")
public class LoginService implements UserDetailsService {

    @Autowired
    private IEmpleadoRepository empleadoRepository;


    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Empleado empleado = empleadoRepository.findByUsername(username);

        if(empleado == null){
            throw new UsernameNotFoundException(username);
        }

        var roles = new ArrayList<GrantedAuthority>();

        roles.add(new SimpleGrantedAuthority( empleado.getRol().getDescripcion()));

        return new User(empleado.getUsername(), empleado.getClave(), roles);
    }

}
