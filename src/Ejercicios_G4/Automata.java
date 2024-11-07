package Ejercicios_G4;

import java.util.Scanner;

public class Automata {
public static boolean validarCadena_automata1(String cadena) {
      int estado = 0; 
      for (int i = 0; i < cadena.length(); i++) {
          char simbolo = cadena.charAt(i);
          switch (estado) {
              case 0:
                  if (simbolo == 'a') {
                      estado = 0;
                  } else if (simbolo == 'b') {
                      estado = 1;
                  } else {
                      return false;
                  }
                  break;

              case 1:
                  if (simbolo == 'b') {
                      estado = 1;
                  } else if (simbolo == 'c') {
                      estado = 2;
                  } else {
                      return false;
                  }
                  break;

              case 2:
                  return false;
          }
      }
      return estado == 2;
  }
  
  public void G4_Automata_1(Scanner scanner) {
   System.out.println("Automata 1 ");
   System.out.println("Escriba una cadena para validar: ");
   String cadena = scanner.nextLine();
      if (validarCadena_automata1(cadena)) {
          System.out.println("La cadena es válida");
      } else {
          System.out.println("La cadena no es válida");
      }
   System.out.println(" ");
  } 



// Automata 2
  public enum Estado {
   q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, qError
}

public static Estado transicion(Estado estadoActual, char c) {
   switch (estadoActual) {
       case q0:
           if (c == 'f') return Estado.q1;
           if (c == 'i') return Estado.q4;
           return Estado.qError;

       case q1:
           if (c == 'o') return Estado.q2;
           return Estado.qError;

       case q2:
           if (c == 'r') return Estado.q3;
           return Estado.qError;

       case q3: 
           if (c == '(') return Estado.q0;
           return Estado.qError;

       case q4:
           if (c == 'f') return Estado.q5;
           return Estado.qError;

       case q5:
           if (c == '(') return Estado.q0;
           if (c == 'e') return Estado.q6;
           return Estado.qError;

       case q6:
           if (c == 's') return Estado.q7;
           return Estado.qError;

       case q7:
           if (c == 'e') return Estado.q8;
           return Estado.qError;

       case q8: 
           if (c == '(') return Estado.q0;
           return Estado.qError;

       case q9:
           if (c == 'e') return Estado.q10;
           return Estado.qError;

       case q10:
           if (c == 'h') return Estado.q11;
           return Estado.qError;

       case q11: 
           if (c == '(') return Estado.q0;
           return Estado.qError;

       default:
           return Estado.qError;
   }
}

public static boolean validarCadena_automata6(String cadena) {
   Estado estadoActual = Estado.q0;

   for (char c : cadena.toCharArray()) {
       estadoActual = transicion(estadoActual, c);
       if (estadoActual == Estado.qError) {
           return false; 
       }
   }
   return estadoActual == Estado.q3 || estadoActual == Estado.q5 || estadoActual == Estado.q8 || estadoActual == Estado.q11;
}

// Método para ejecutar el autómata
public void G4_Automata_6(Scanner scanner) {
   System.out.print("Automata 6");
   System.out.print("Ingrese una palabra: ");
   String cadena = scanner.nextLine();

   if (validarCadena_automata6(cadena)) {
       System.out.println("La palabra es válida en el lenguaje L.");
   } else {
       System.out.println("La palabra no es válida en el lenguaje L.");
   }
   System.out.print(" ");
}

public void G4_Automata03(Scanner scanner) {
        System.out.println("Automata 3");
        System.out.println("Ingresa la cadena a validar (debe seguir el patrón a+/b+/c+):");
        String entrada = scanner.nextLine();

        ValidadorAutomata automata = new ValidadorAutomata();
        if (automata.esValidaABC(entrada)) {
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena es inválida.");
        }
    }

    public void G4_Automata_3(Scanner scanner) {
        System.out.println("Automata 3.1");
        System.out.println("Ingresa la cadena a validar (debe seguir el patrón 1/0+/1*):");
        String entrada = scanner.nextLine();

        ValidadorAutomata automata = new ValidadorAutomata();
        if (automata.esValida101(entrada)) { 
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena es inválida.");
        }
    }
}

class ValidadorAutomata {
   
    int Q0 = 0;
    int Q1 = 1;
    int Q2 = 2;
    int Q3 = 3;
    int ERROR = -1;
    
    
    int[][] matrizTransicionABC = {
       // a     b     c
       { 1,   -1,   -1 },  // q0
       { 1,    2,   -1 },  // q1
       { -1,   2,    3 },  // q2
       { -1,  -1,    3 }   // q3
    };

    public boolean esValidaABC(String entrada) {
        int estadoActual = Q0;

        for (char ch : entrada.toCharArray()) {
            int columna = obtenerColumnaABC(ch);
            if (columna == ERROR) {
                return false;
            }
            estadoActual = matrizTransicionABC[estadoActual][columna];
            if (estadoActual == ERROR) {
                return false;
            }
        }

        return estadoActual == Q3;
    }

    public int obtenerColumnaABC(char ch) {
        switch (ch) {
            case 'a': return 0;
            case 'b': return 1;
            case 'c': return 2;
            default: return ERROR;
        }
    }

    
    int Q0_ = 0;
    int Q1_ = 1;
    int Q2_ = 2;
    int Q3_ = 3;
    int ERROR_ = -1;

    
    int[][] matrizTransicion101 = {
        // 1     0
        {  1,   -1 },  // q0: 
        { -1,    2 },  // q1: 
        {  3,    2 },  // q2: 
        {  3,   -1 }   // q3: 
    };
    

    public boolean esValida101(String entrada) {
        int estadoActual = Q0_;

        for (char ch : entrada.toCharArray()) {
            int columna = obtenerColumna101(ch);
            if (columna == ERROR_) {
                return false;
            }
            estadoActual = matrizTransicion101[estadoActual][columna];
            if (estadoActual == ERROR_) {
                return false;
            }
        }

        return (estadoActual == Q2_ || estadoActual == Q3_);
    }

    public int obtenerColumna101(char ch) {
        switch (ch) {
            case '1': return 0;
            case '0': return 1;
            default: return ERROR_;
        }
    }
}
