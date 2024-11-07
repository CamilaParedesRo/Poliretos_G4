package Ejercicios_G4;

import java.util.Scanner;

public class SerieDeCaracteres {
     public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;  
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true;  
    }

    public void G4_Secuencia_CaracterS3(Scanner scanner) {
        System.out.print("Ingrese el límite de la serie S3: ");
        int limit = scanner.nextInt(); 
        int contador = 0;
       

        for (int numero = 2; contador < limit; numero++) {
            if (esPrimo(numero)) {
                for (int i = 0; i < numero; i++) {
                    System.out.print("+");
                }
                System.out.print(" ");
                contador++;
            }
        }
        System.out.println();
    }

    public void G4_Secuencia_CaracterS8() {
      
        imprimirSecuencia('a', 1);
        imprimirSecuencia('b', 3);
        imprimirSecuencia('c', 5);
        imprimirSecuencia('d', 7);
        imprimirSecuencia('e', 9);
        imprimirSecuencia('f', 11);
    }

    public void imprimirSecuencia(char letra, int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(letra);
        }
        System.out.print(" ");
    }

}
