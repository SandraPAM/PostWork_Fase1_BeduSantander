package org.bedu.java.jse.basico;

import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public byte leeOpcion(){
        System.out.print("Opción: ");
        byte opcion = scanner.nextByte();
        scanner.nextLine();
        return opcion;
    }

    public String leeCadena(String intro){
        System.out.println(intro.toUpperCase()+ ": ");
        return scanner.nextLine();
    }

}
