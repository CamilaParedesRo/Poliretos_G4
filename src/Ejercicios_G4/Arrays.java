package Ejercicios_G4;

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

}
