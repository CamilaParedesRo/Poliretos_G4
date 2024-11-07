package Ejercicios_G4;
import java.util.Scanner;
public class Arrays {
    
   public void G4_Array_4() {
      System.out.println("Array 4"); 
      String nombre = "Monserrath";
      String apellido = "Rodriguez";
      int longitudNombre = nombre.length();
      int longitudApellido = apellido.length();
      char[][] matriz = new char[longitudNombre][longitudApellido];

      for (int filas = 0; filas < longitudNombre; filas++) {
          for (int columnas = 0; columnas < longitudApellido; columnas++) {
              if (filas + columnas == longitudApellido - 1) {
                  matriz[filas][columnas] = apellido.charAt(filas);
              } else if (filas == columnas) {
                  matriz[filas][columnas] = nombre.charAt(filas);
              } else {
                  matriz[filas][columnas] = ' ';
              }
          }
      }
      for (int filas = 0; filas < longitudNombre; filas++) {
          for (int columnas = 0; columnas < longitudApellido; columnas++) {
              System.out.print(matriz[filas][columnas] + " ");
          }
          System.out.println(); 
      }
      System.out.println(" "); 
  }


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
