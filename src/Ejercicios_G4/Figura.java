package Ejercicios_G4;

import java.util.Scanner;

public class Figura {
public void G4_Figura_4(Scanner scanner) {
        
        
        System.out.print("Ingrese el tamaño: ");
        int tamaño = scanner.nextInt();
        
        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño - i; j++) {
                System.out.print("  "); 
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public void G4_Figura_9(Scanner scanner) {
        System.out.print("Ingrese la altura de la figura: ");
    
        int altura = scanner.nextInt();
        int anchoFigura = (2 * altura) - 1;

        for (int nivelActual = 0; nivelActual < altura; nivelActual++) {
            for (int posicion = 1; posicion <= anchoFigura; posicion++) {
                if ((nivelActual == 0) && (posicion == altura)) {
                    System.out.print("");
                } else if ((nivelActual > 0) && (posicion == (altura - nivelActual))) {
                    System.out.print("|");
                } else if ((nivelActual > 0) && (posicion == (altura + nivelActual) - 1)) {
                    System.out.print("|");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
    

    

    public void G4_Figura_14(Scanner scanner) {
        System.out.print("Introduce el número de filas para el Triángulo de Pascal: ");
        int filas = scanner.nextInt();

        for (int i = 0; i < filas; i++) {
           
            for (int j = 0; j < filas - i; j++) {
                System.out.print(" ");
            }

            int valor = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(valor + " ");
                valor = valor * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    public void G4_Figura_19(Scanner scanner){
        System.out.print("Introduce el número de filas para el patrón triangular: ");
        int filas = scanner.nextInt();
        
        System.out.print("Introduce el número inicial: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("+ ");
                } else if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print(numero + " ");
                    numero++;
                }
            }
            System.out.println();
        }

        
    }
}
