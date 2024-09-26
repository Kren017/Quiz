
package com.mycompany.marioclases;

import java.util.Scanner; 

public class MarioClases {

    public static void main(String[] args) {
        Mario mario = new Mario("Mario", 3, 10);
        Scanner scanner = new Scanner(System.in);
        int input;

        while (mario.getVidas() > 0) {
            System.out.println("Escribe 1 para moverte a la derecha, -1 para moverte a la izquierda, 2 para saltar, 0 para no hacer nada, -2 para perder una vida:");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    mario.setMovimiento(1);
                    break;
                case -1:
                    mario.setMovimiento(-1);
                    break;
                case 0:
                    mario.setMovimiento(0);
                    break;
                case 2:
                    mario.setSalto(1); 
                    break;
                case -2:
                    mario.perderVida();
                    break;
                default:
                    System.out.println("Acción no reconocida.");
                    continue;
            }
            mario.desplazamientoMario();
            mario.saltar();
            mario.setMovimiento(0); 
            mario.setSalto(0); 
        }
        System.out.println("¡Juego terminado!");
        scanner.close();
    }
}
