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


   public void G4_Figura_4(Scanner scanner) {

    System.out.println("Figura 4");
    
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

    public void G4_Figura_9(Scanner scanner) {
        System.out.println("Figura 9");
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

public void G4_Figura_14(Scanner scanner) {
    System.out.println("Figura 14");
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



    public void G4_Figura_19(Scanner scanner){
        System.out.println("Figura 19");
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
