package Ejercicios_G4;

import java.util.Scanner;

public class Loading {

   public void G4_Loading_4() {
      System.out.print("Loading 4");
      try {
          for (int i = 0; i <= 100; i += 10) { 
              System.out.print("\r");
              if ( (i / 10) % 2 == 0 ){
                  System.out.print(  "o0o" + " " + i + "%");
              }else{
                  System.out.print(  "0o0" + " " + i + "%");
              }
              Thread.sleep(700); 
          }
          System.out.println("\r Cargando siguiente pantalla ... Espere ");
      } catch (InterruptedException e) {
          System.out.println("La señal esta siendo interrumpida");
      }
      System.out.print(" ");
  }

      public void G4_Loading_9 (Scanner scanner){
         System.out.print("Loading 9");
        System.out.print("Ingresa tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        int longitud = nombreCompleto.length();
        
        for (int i = 0; i < longitud; i++) {
            int porcentaje = (i * 100) / (longitud - 1);
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(nombreCompleto.charAt(i) + "\t " + porcentaje + "%");
        }
        System.out.print("");
    }
}
