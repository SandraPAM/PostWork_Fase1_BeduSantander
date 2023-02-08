package org.bedu.java.jse.basico;

public class ListaTareasMain {
    public static void main(String[] args){
        Menu menu = new Menu();
        Lector lector = new Lector();
        ListasTareas lista = new ListasTareas();
        byte opcionSelectionada = 0;

        do {
            menu.muestraOpciones();
            opcionSelectionada = lector.leeOpcion();

            System.out.printf("%n%nLa opción seleccionada es: %d%n", opcionSelectionada);

            switch (opcionSelectionada){
                case 1:
                    lista.crearNuevaList();
                    break;
                case 2:
                    lista.verListaTareas();
                    break;
                case 3:
                    lista.verTareasDeLista();
                    break;
                case 4:
                    lista.actualizarListaDeTareas();
                    break;
                case 5:
                    lista.eliminarListaDeTareas();
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("Opción desconocida.");
            }
        }while(opcionSelectionada != 6);
    }
}
