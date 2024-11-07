package Ejercicios_G4;

import java.util.Scanner;

public class SerieNumerica {

   public void G4_SeriesNumericas_S1 (Scanner scanner){
      System.out.println("Serie Numerica 01");
      int a = 0, b =1, c = 0, n;
      System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
      n = scanner.nextInt();
      System.out.println(" La serie es la siguiente: ");
      for (int i = 0; i < n; i++) {
          System.out.print(a + " ");
          c = a + b;
          a = b;
          b = c;
       }
       System.out.println(" ");
   }

   public void G4_SeriesNumericas_S6(Scanner scanner){
      System.out.println(" ");
      System.out.println("Serie Numerica 06");
      int a = 1, n ;
      System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
      n = scanner.nextInt();
      System.out.println(" La serie es la siguiente: ");
      for (int i = 0; i < n; i++) {
          System.out.print(a + " ");
          a = a + (2*i) + 3;
      }
      System.out.println(" ");
  }



}
