package org.bedu.java.jse.basico.modelo;

import java.time.LocalDate;

public class ListaTareas {
    private String nombre;
    private LocalDate fechaCreacion;
    {
        setFechaCreacion(LocalDate.now());
    }

    ListaTareas(String nombre){
        setNombre(nombre);
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){

        nombre.equals(nombre);
        this.nombre = nombre;
    }

    public LocalDate getFechaCracion(){
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate date){
        this.fechaCreacion = date;
    }


}
