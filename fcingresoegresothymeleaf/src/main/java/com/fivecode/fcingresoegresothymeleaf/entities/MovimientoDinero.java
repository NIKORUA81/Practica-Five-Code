package com.fivecode.fcingresoegresothymeleaf.entities;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "movimientos")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaccion", nullable = false)//Cambiar el nombre en la BD, si no se quiere cambiar no es necesario colocar "name"
    private long idTransaccion;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "monto", nullable = false)
    private float monto;

    @ManyToOne
    @JoinColumn(name = "empleado", nullable = false)
    private Empleado empleado;

    @Column(name = "estado", nullable = false)
    private boolean estado;

    @ManyToOne
    @JoinColumn(name = "empresa", nullable = false)
    private Empresa empresa;

    @Column(name = "fecha", nullable = false)
    private LocalTime fecha;

    /*
    public MovimientoDinero(long idTransaccion, String descripcion, float monto) {
        this.idTransaccion = idTransaccion;
        this.descripcion = descripcion;
        this.monto = monto;
    }
    */

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

    public LocalTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalTime fecha) {
        this.fecha = fecha;
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
                ", fecha=" + fecha +
                '}';
    }

}
