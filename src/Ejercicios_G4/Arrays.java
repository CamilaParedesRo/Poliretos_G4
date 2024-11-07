package Ejercicios_G4;

import java.util.Scanner;

public class Arrays {
 public void G4_Areglo_1(Scanner scanner) {

        System.out.println("Arreglo 1");
        
        String nombreCompleto = "Anahi Valentina Pillajo Teran";
        String[] palabras = nombreCompleto.split(" ");
        
       
        int[] porcentajes = new int[palabras.length];
        
        
        
        System.out.print("Ingrese el porcentaje de carga para cada palabra: ");
        
        for (int i = 0; i < palabras.length; i++) {
            porcentajes[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < palabras.length; i++) {
            mostrarProgreso(palabras[i], porcentajes[i]);
        }
        
        
    }

    public  void mostrarProgreso(String palabra, int porcentaje) {
        int barras = porcentaje / 10; 
        StringBuilder barra = new StringBuilder("[");
        
        for (int i = 0; i < 10; i++) {
            if (i < barras) {
                barra.append("=");
            } else {
                barra.append(" ");
            }
        }
        
        barra.append("] ");
        System.out.printf("%s %d%% %s%n", barra.toString(), porcentaje, palabra);
    }
}
