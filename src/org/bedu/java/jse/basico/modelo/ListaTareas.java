package org.bedu.java.jse.basico.modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaTareas implements Serializable {
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
            System.out.printf("La tarea con el índice indicado (%d) no se encuentra en la lista.%n", index);
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
        System.out.println("#:\t\t|TAREA|\t[COMPLETADO]\t|FECHA");
        for(Tarea tarea: getTareas()){
            System.out.println((index + 1) + ": |" + tarea.getNombre() + "|\t[" +
                    (tarea.getRealizada() ? "🀫" : " ") + "]\t|"
                    + (tarea.getRealizada() ? tarea.getFechaRealizacion() : ""));
            index++;
        }
    }

}
