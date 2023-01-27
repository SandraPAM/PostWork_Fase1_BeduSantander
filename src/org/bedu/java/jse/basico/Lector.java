package org.bedu.java.jse.basico;

import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public byte leeOpcion(){
        System.out.println("Opción: ");
        return scanner.nextByte();
    }

}
