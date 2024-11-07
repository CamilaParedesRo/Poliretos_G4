package Ejercicios_G4;

import java.util.Scanner;

public class SerieDeCaracteres {
      public void G4_SeriesDeCaracteres_SC1 (Scanner scanner){
        int cantidad;
      System.out.println("Serie de caractes 01");
        System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
        cantidad = scanner.nextInt();
        System.out.println(" La serie es la siguiente: ");
        for (int i = 0 ; i < cantidad; i++) {
            if (i % 2 == 0) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
        }
       System.out.println(" ");
   }

   public void G4_SeriesDeCaracteres_SC6_1( Scanner scanner){
      int cantidad;
      System.out.println("Serie de caractes 06");
      System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
      cantidad = scanner.nextInt();
      System.out.println(" La serie es la siguiente: ");
      for (int i = 0 ; i < cantidad; i++) {
          
          System.out.print((char)('a' + (i % 26)) + " "); // Codigo ASCII empieza de a es 97
      }
      System.out.println(" ");

   }

   public void G4_SeriesDeCaracteres_SC6_2 (Scanner scanner){
      int cantidad;
      System.out.println("Serie de caractes 06");
      System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
      cantidad = scanner.nextInt();
      System.out.println(" La serie es la siguiente: ");
      for (int i = 0 ; i < cantidad; i++) {
          if (i % 2 == 0) {          
              System.out.print((char)('a' + (i % 26))  + " ");
          }else if (i % 4 == 1) {
              System.out.print("+ ");
          }else{ 
              System.out.print("- ");
          }
      }
      System.out.println(" ");
  }

}
