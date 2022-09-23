package com.fivecode.fcingresoegresothymeleaf.web;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("addmin")
                .password("{noop}123")
                .roles("ADMIN")
                .and()
                .withUser("user")
                .password("{noop}123")
                .roles("USER")
                ;
    }
}
