package org.bedu.java.jse.basico;

import org.bedu.java.jse.basico.modelo.ListaTareas;

public class ListasTareas {
    /*
        System.out.println("1. Crear nueva lista de tareas");
        System.out.println("2. Ver listas de tareas");
        System.out.println("3. Ver tareas de lista");
        System.out.println("4. Actualizar lista de tareas");
        System.out.println("5. Eliminar lista de tareas");
     */
    private Lector lector = new Lector();

    public void crearNuevaList(){
        System.out.println("Crear nueva lista de tareas.");
        String nombre = lector.leeCadena();

        ListaTareas listaTareas = new ListaTareas(nombre);

    }

    public void verListaTareas(){
        System.out.println("Ver lista de tareas.");
    }

    public void verTareasDeLista(){
        System.out.println("Ver tareas de lista.");

        byte lista = lector.leeOpcion();
    }

    public void actualizarListaDeTareas(){
        System.out.println("Actualizar lista de tareas.");

        byte lista = lector.leeOpcion();
    }

    public void eliminarListaDeTareas(){
        System.out.println("Eliminar lista de tareas.");

        byte lista = lector.leeOpcion();
    }
}
