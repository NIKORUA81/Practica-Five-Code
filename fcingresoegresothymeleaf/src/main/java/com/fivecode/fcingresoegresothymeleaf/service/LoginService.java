package com.fivecode.fcingresoegresothymeleaf.service;

import com.fivecode.fcingresoegresothymeleaf.entities.Empleado;
import com.fivecode.fcingresoegresothymeleaf.repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("UserDetailsService")
public class LoginService implements UserDetailsService {

    @Autowired
    private IEmpleadoRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username){
        Empleado usuario = usuarioRepository.finbByUsername(username);
        if (usuario == null){
            throw new UsernameNotFoundException(username);
        }
        var roles = new ArrayList<GrantedAuthority>();

        roles.add(new SimpleGrantedAuthority(usuario.getRol().getDescripcion()));

        return new User(usuario.getUsername(),usuario.getClave(),roles);
    }

}
