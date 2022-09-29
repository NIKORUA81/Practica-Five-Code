package com.fivecode.fcingresoegresothymeleaf.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "movimientos")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaccion", nullable = false)//Cambiar el nombre en la BD, si no se quiere cambiar no es necesario colocar "name"
    private long idTransaccion;

    @NotEmpty
    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    //@NotEmpty
    @Column(name = "monto", nullable = false)
    private float monto;

    @ManyToOne
    @JoinColumn(name = "empleado", nullable = false)
    private Empleado empleado;

    @Column(name = "estado", nullable = false)
    private boolean estado;

    /*
    @ManyToOne
    @JoinColumn(name = "empresa", nullable = false)
    private Empresa empresa;
    */

    //@NotEmpty
    @Column(name = "fecha", nullable = false)
    private String fecha;

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

    /*
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    */

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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
                ", fecha='" + fecha + '\'' +
                '}';
    }

}
