package org.bedu.java.jse.basico.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private String nombre;
    private final List<Tarea> tareas = new ArrayList<>();
    private final LocalDate fechaCreacion;
    {
        fechaCreacion = LocalDate.now();
    }

    public ListaTareas(String nombre){
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

    public void agregaTarea(Tarea tarea){
        tareas.add(tarea);
    }

    public Tarea eliminaTarea(int index){
        if (index > tareas.size()){
            System.out.println("La tarea con el índice indicado (" + index
                    + ") no se encunetra en la lista.");
            return null;
        }

        return tareas.remove(index);
    }

    public List<Tarea> getTareas(){
        return this.tareas;
    }

    public int numTareas(){
        return tareas.size();
    }

    public void muestraTareas(){
        int index = 1;
        for(Tarea tarea: getTareas()){
            System.out.println(index + ": " + tarea.getNombre());
            index++;
        }
    }

}
