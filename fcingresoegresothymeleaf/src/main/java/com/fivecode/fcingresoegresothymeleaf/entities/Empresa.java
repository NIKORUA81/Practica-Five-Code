package com.fivecode.fcingresoegresothymeleaf.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name="empresas")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa", nullable = false)
    private long idEmpresa;
    @NotEmpty
    @Column(name = "nombre", nullable = false) //Cambiar el nombre en la BD, si no se quiere cambiar no es necesario colocar "name"
    private String nombre;
    @NotEmpty
    @Column(name = "direccion", nullable = false) //nullable = false, el campo no puede estar nulo
    private String direccion;
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @NotEmpty
    @Column(name = "nit", nullable = false)
    private String nit;
    @Column(name = "estado")
    private boolean estado;

    /*
    @Column(name = "created_at")
    private Date CreateAt;

    @Column(name = "update_at")
    private Date UpddateAt;
    */

    /*
    public Empresa(long idEmpresa, String nombre, String direccion, String telefono, String nit) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit; //Número que identifique la empresa de manera legal
    }
    */

    //Getters y Setters
    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nit='" + nit + '\'' +
                ", estado=" + estado +
                '}';
    }
}
