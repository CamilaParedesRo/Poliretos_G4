package Ejercicios_G4;

import java.util.Scanner;

public class Recursion {

   public static int sumaRecursiva(int [] A, int i){
      if (i == A.length){
         return 0;
      }else {
         return A[i] + sumaRecursiva(A, i+1);
      }
   }
   int A [] = {2,1,5,4,3,2,7,8,5};
   int resusultado;
   public void G4_Recursion_2(){
      System.out.println("Recursion 2");
      resusultado = sumaRecursiva(A, 0);
      System.out.println(resusultado);
      System.out.println(" ");
   }

   public static int multiplicacion_recursiva(int a, int b) {
    if (b == 0) {
        return 0;
    } else if (b > 0) {
        return a + multiplicacion_recursiva(a, b - 1);
    } else {
        return -multiplicacion_recursiva(a, -b);
    }
}

  public void G4_Recursion_3(){
    int resultado = multiplicacion_recursiva(100, 4); // multiplicacion 
    System.out.println("Resultado: " + resultado);
    System.out.println( " ");
}

    public int G4_Recursion_4(Scanner scanner) {
        System.out.println("Recursion 4");
        
        if (scanner.hasNextLine()) {
            scanner.nextLine(); 
        }
        
        System.out.print("Ingrese la base: ");
        int a = scanner.nextInt();

        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        System.out.print("Ingrese el exponente: ");
        int b = scanner.nextInt();

        int resultado = calcularPotencia(a, b);
        System.out.println("Resultado: " + resultado);

        return resultado;
    }

    public int calcularPotencia(int a, int b) {
        if (b == 0) {
            return 1; 
        }
        return a * calcularPotencia(a, b - 1); 
    }
    
   

  
}
