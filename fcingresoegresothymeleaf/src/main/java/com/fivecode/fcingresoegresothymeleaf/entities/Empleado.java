package com.fivecode.fcingresoegresothymeleaf.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado", nullable = false)//Cambiar el nombre en la BD, si no se quiere cambiar no es necesario colocar "name"
    private long idEmpleado;
    @NotEmpty
    @Column(name = "nombre", nullable = false) //nullable = false, el campo no puede estar nulo
    private String nombre;
    @NotEmpty
    @Column(name = "correo", nullable = false)
    private String correo;
    @NotEmpty
    @Column(name = "cedula", nullable = false, unique = true)//unique = true, que el campo sea único, que no se repita
    private int cedula;
    @NotEmpty
    @Column(name = "clave", nullable = false)
    private String clave;
    @ManyToOne //Cardinalidad
    @JoinColumn(name = "empresa", nullable = false)
    private Empresa empresa;
    //private RolPrueba rolPrueba;
    @Column(name = "estado")
    private boolean estado;
    @Column(name = "telefono", nullable = false)
    private int telefono;

    @Column(name = "rol")
    private Rol rol;


    /*public Empleado(long idEmpleado, String nombre, String correo, int cedula, String clave){
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
        this.clave = clave;
    }*/

    public long getIdEmpleado() {

        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {

        this.idEmpleado = idEmpleado;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getCorreo() {

        return correo;
    }

    public void setCorreo(String correo) {

        this.correo = correo;
    }

    public int getCedula() {

        return cedula;
    }

    public void setCedula(int cedula) {

        this.cedula = cedula;
    }

    public String getClave() {

        return clave;
    }

    public void setClave(String clave) {

        this.clave = clave;
    }

    public Empresa getEmpresa() {

        return empresa;
    }

    public void setEmpresa(Empresa empresa) {

        this.empresa = empresa;
    }

    public boolean isEstado() {

        return estado;
    }

    public void setEstado(boolean estado) {

        this.estado = estado;
    }

    public int getTelefono() {

        return telefono;
    }

    public void setTelefono(int telefono) {

        this.telefono = telefono;
    }

    /*public RolPrueba getRolPrueba() {

        return rolPrueba;
    }

    public void setRolPrueba(RolPrueba rolPrueba) {
        this.rolPrueba = rolPrueba;
    }*/

    public Rol getRol() {
        return
                rol;
    }

    public void setRol(Rol rol) {

        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", cedula=" + cedula +
                ", clave='" + clave + '\'' +
                ", empresa=" + empresa +
                ", estado=" + estado +
                ", telefono=" + telefono +
                ", rol=" + rol +
                '}';
    }
}

