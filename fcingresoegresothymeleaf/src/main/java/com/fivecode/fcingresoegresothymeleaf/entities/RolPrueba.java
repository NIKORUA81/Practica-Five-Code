package com.fivecode.fcingresoegresothymeleaf.entities;

public class RolPrueba {
    private int idRol;
    private String descipcion;
    private boolean estado;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "idRol=" + idRol +
                ", descipcion='" + descipcion + '\'' +
                ", estado=" + estado +
                '}';
    }
}
