package com.fivecode.fcingresoegreso.entity;

public class MovimientoDinero {
    private int idTransaccion;
    private String descripcion;
    private float monto;
    private Empleado empleado;
    private boolean estado;
    private Empresa empresa;

    /*
    public MovimientoDinero(long idTransaccion, String descripcion, float monto) {
        this.idTransaccion = idTransaccion;
        this.descripcion = descripcion;
        this.monto = monto;
    }
    */

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idTransaccion=" + idTransaccion +
                ", descripcion='" + descripcion + '\'' +
                ", monto=" + monto +
                ", empleado=" + empleado +
                ", estado=" + estado +
                ", empresa=" + empresa +
                '}';
    }

}
