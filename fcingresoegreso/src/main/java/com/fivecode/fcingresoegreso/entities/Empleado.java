package com.fivecode.fcingresoegreso.entities;

public class Empleado {
    private long idEmpleado;
    private String nombre;
    private String correo;
    private int cedula;
    private String clave;
    private Empresa empresa;
    //private RolPrueba rolPrueba;
    private boolean estado;

    private int telefono;
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

