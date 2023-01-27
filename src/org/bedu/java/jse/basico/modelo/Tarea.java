package org.bedu.java.jse.basico.modelo;

import java.time.LocalDate;

public class Tarea {
    private String nombre;
    private LocalDate fechaCracion;
    private LocalDate fechaExpiracion;
    private boolean realizada;
    private LocalDate fechaRealizacion;
    {
        fechaCracion = LocalDate.now();
    }

    Tarea(String nombre){
        setNombre(nombre);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tarea that = (Tarea) o;
        return nombre.equals(that.nombre);
    }

    @Override
    public int hashCode(){
        int hash = 0;
        hash = hash + nombre.hashCode();

        return hash;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public LocalDate getFechaCracion(){
        return fechaCracion;
    }

    public void setFechaCracion(LocalDate date){
        this.fechaCracion = date;
    }

    public LocalDate getFechaExpiracion(){
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate date){
        this.fechaExpiracion = date;
    }

    public boolean getRealizada(){
        return realizada;
    }

    public void setRealizada(boolean status){
        this.realizada = status;
    }

    public LocalDate getFechaRealizacion(){
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate date){
        this.fechaRealizacion = date;
    }
}
