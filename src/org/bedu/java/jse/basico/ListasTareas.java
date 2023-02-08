package org.bedu.java.jse.basico;

import org.bedu.java.jse.basico.modelo.ListaTareas;
import org.bedu.java.jse.basico.modelo.Tarea;

import java.util.ArrayList;
import java.util.List;

public class ListasTareas {
    private Lector lector = new Lector();
    private List<ListaTareas> listasTareas = new ArrayList<>();

    private Menu menu = new Menu();
    private ManejadorTareas manejadorTareas = new ManejadorTareas();


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
            System.out.printf("No existe índice #%d de lista%n", index);
            return false;
        }
        return true;
    }

    public void verTareasDeLista(){
        System.out.println("Ver tareas de lista.");

        byte indexLista = lector.leeOpcion();
        if (validIndexLista((byte) (indexLista-1))){

            ListaTareas listaTareas = listasTareas.get((int)indexLista-1);
            if (listaTareas.numTareas() == 0){
                System.out.printf("Aún no hay tareas agregadas a la lista #%d%n" + indexLista);
            }

            int indexTarea = 1;
            for(Tarea tarea: listaTareas.getTareas()){
                System.out.printf("%d.%d: %s%n", indexLista, indexTarea, tarea.getNombre());
                indexTarea++;
            }
        }
    }

    public void actualizarListaDeTareas(){
        System.out.println("Actualizar lista de tareas.");

        byte indice = lector.leeOpcion();

        if (!validIndexLista((byte)(indice-1))){
            return;
        }

        ListaTareas listaActual = listasTareas.get(indice - 1);
        menu.muestraOpcionesTarea();
        byte opcionSeleccionada = lector.leeOpcion();

        switch (opcionSeleccionada){
            case 1:
                Tarea nuevaTarea = manejadorTareas.nuevaTarea();
                listaActual.agregaTarea(nuevaTarea);
                break;
            case 2:
                Tarea t1 = manejadorTareas.eliminarTarea(listaActual);
                if(t1 != null){
                    System.out.printf("Se eliminó la tarea %s%n", t1.getNombre());
                } else {
                    System.out.println("No se pudo eliminar la tarea");
                }
                break;
            case 3:
                Tarea t2 = manejadorTareas.marcarTareaFinalizada(listaActual);
                if(t2 != null){
                    System.out.printf("La tarea %s se completó el %2$te de %2$tB de %2$tY%n",
                            t2.getNombre(), t2.getFechaRealizacion());
                } else {
                    System.out.println("La tarea no pudo ser marcada como finalizada");
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Opción desconocida.");
        }
    }

    public void eliminarListaDeTareas(){
        System.out.println("Eliminar lista de tareas.");

        byte lista = lector.leeOpcion();

        if (validIndexLista((byte)(lista-1))){
            ListaTareas listaEliminada = listasTareas.remove(lista-1);
            System.out.printf("Se eliminó satisfactoriamente la lista de tareas #%d: %s%n",
                    lista, listaEliminada.getNombre());
        }

    }
}
