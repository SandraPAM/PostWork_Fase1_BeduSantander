package org.bedu.java.jse.basico;

import org.bedu.java.jse.basico.modelo.ListaTareas;
import org.bedu.java.jse.basico.modelo.Tarea;

import java.util.ArrayList;
import java.util.List;

public class ListasTareas {
    /*
        System.out.println("1. Crear nueva lista de tareas");
        System.out.println("2. Ver listas de tareas");
        System.out.println("3. Ver tareas de lista");
        System.out.println("4. Actualizar lista de tareas");
        System.out.println("5. Eliminar lista de tareas");
     */
    private Lector lector = new Lector();
    private List<ListaTareas> listasTareas = new ArrayList<>();

    public void crearNuevaList(){
        System.out.println("Crear nueva lista de tareas.");
        String nombre = lector.leeCadena("Nombre de la lista");

        ListaTareas listaTareas = new ListaTareas(nombre);
        listasTareas.add(listaTareas);

    }

    public boolean existsAnyList(){
        //return listasTareas.size() > 0;
        if (listasTareas == null || listasTareas.isEmpty()){
            System.out.println("Aún no se ha creado ninguna lista de tareas");
            return false;
        }

        return  true;
    }

    public void verListaTareas(){
        System.out.println("Ver lista de tareas.");

        if (existsAnyList()){
            for( int i = 0; i < listasTareas.size(); i++){
                System.out.println(i+1 + ": " + listasTareas.get(i).getNombre());
            }
        }
    }

    public boolean validIndexLista(byte index){
        if (!existsAnyList() || index >= listasTareas.size() || index < 0){
            System.out.println("No existe índice de lista");
            return false;
        }
        return true;
    }

    public void verTareasDeLista(){
        System.out.println("Ver tareas de lista.");

        byte lista = lector.leeOpcion();
        if (validIndexLista((byte) (lista-1))){

            ListaTareas listaTareas = listasTareas.get((int)lista-1);
            if (listaTareas.numTareas() == 0){
                System.out.println("Aún no hay tareas agregadas a la lista #" + lista);
            }

            int indexTarea = 1;
            for(Tarea tarea: listaTareas.getTareas()){
                System.out.println(lista + "." + indexTarea + ": " + tarea.getNombre());
                indexTarea++;
            }
        }
    }

    public void actualizarListaDeTareas(){
        System.out.println("Actualizar lista de tareas.");

        byte lista = lector.leeOpcion();

        if (!validIndexLista((byte)(lista-1))){
            return;
        }
    }

    public void eliminarListaDeTareas(){
        System.out.println("Eliminar lista de tareas.");

        byte lista = lector.leeOpcion();

        if (validIndexLista((byte)(lista-1))){
            ListaTareas listaEliminada = listasTareas.remove(lista-1);
            System.out.println("Se elimino satisfactoriamente la lista de tareas #" +
                    lista + ": " + listaEliminada.getNombre());
        }

    }
}
