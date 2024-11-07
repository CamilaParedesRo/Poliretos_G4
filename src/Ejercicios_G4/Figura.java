package Ejercicios_G4;

import java.util.Scanner;

public class Figura {
public void G4_Figuras_2() {
      int tamano = 5;
      System.out.println("Figura 02");    
      for (int filas = 1; filas <= tamano; filas++) {                      
          for (int columnas = 1 ; columnas <= tamano ; columnas++){        
              if ((filas == 1 && columnas == 1)| (filas == 5 && columnas == 5)||(filas == 1 && columnas == 5)||(filas == 5 && columnas == 1) 
                  ||(filas == 3 && columnas == 1)||(filas == 3 && columnas == 5)||(filas == 1 && columnas == 3)||(filas == 5 && columnas == 3)){   
                  System.out.print( "* ");                        
              } else if ((filas == 1 && columnas == 2)| (filas == 1 && columnas == 4)||(filas == 2 && columnas == 1)||(filas == 2 && columnas == 5)
               ||(filas == 4 && columnas == 1)| (filas == 4 && columnas == 5)||(filas == 5 && columnas == 4)||(filas == 5 && columnas == 2)    ) {
                  System.out.print("+ ");                         
              } else {
                  System.out.print( "  ");
              }
          }
          System.out.println();    
      }
      System.out.println(" ");    
   } 

   public void G4_Figuras_3 (Scanner scanner){
        int tamano;
      System.out.println("Figura 03");    
        System.out.println("Ingrese el numero de la extención de la escalera: ");
        tamano = scanner.nextInt();
        for (int filas = 1; filas <= tamano; filas++) {                      
            for (int columnas = 1 ; columnas <= tamano; columnas++){
                if (columnas <= filas){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println ("");
        }
        System.out.println(" ");
   }


   public void G4_Figuras_7(Scanner scanner){
       int desplazamiento;
      System.out.println("Figura 07");    
        System.out.println("Ingrese el numero de la extención de la escalera: ");
        desplazamiento = scanner.nextInt();
        for (int filas = 1; filas <= desplazamiento; filas++) {                      
            for (int columnas = 1 ; columnas <= desplazamiento; columnas++){   
                if (filas == columnas){ 
                System.out.print(  " |__ ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" " );
        }
      System.out.println(" ");    
    }

    public void G4_Figuras_12( Scanner scanner) {
      int numeros;
      System.out.println("Figura 12");    
       System.out.println("Ingrese el numero de la extención de}l triángulo de números invertido: ");
       numeros = scanner.nextInt();
       System.out.println( " ");

       for (int filas = 1; filas <= numeros; filas++) {                      
           for (int columnas = 1 ; columnas <= numeros; columnas++){   
               if (columnas <= numeros - filas + 1){
                   System.out.print(columnas);
               } else { 
               System.out.print(" ");
               }  
       }
       System.out.println( " ");
   }  
   System.out.println(" ");
}

public void G4_Figuras_17() {
   int longitud = 5 ;
   System.out.println("Figura 17");    
    for (int filas = 1; filas <= longitud ; filas++) {                      
        for (int columnas = 1 ; columnas <= longitud ; columnas++){   
          if (filas == columnas || filas + columnas == longitud + 1) {
            if (filas % 2 == 1) {
              System.out.print("1");
          } else {
              System.out.print("0");
          }
      } else {
          System.out.print(" "); 
      }
    }
    System.out.println();
} 
System.out.println(" ");

}
}