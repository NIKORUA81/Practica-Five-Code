package com.fivecode.fcingresoegreso.entity;

public class MovimientoDinero {
    private long idTransaccion;
    private String descripcion;
    private float monto;

 /*   public MovimientoDinero(long idTransaccion, String descripcion, float monto) {
        this.idTransaccion = idTransaccion;
        this.descripcion = descripcion;
        this.monto = monto;
    }*/

    public long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(long idTransaccion) {
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

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idTransaccion=" + idTransaccion +
                ", descripcion='" + descripcion + '\'' +
                ", monto=" + monto +
                '}';
    }
}
