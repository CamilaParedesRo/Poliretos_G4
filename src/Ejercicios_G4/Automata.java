package Ejercicios_G4;

import java.util.Scanner;

public class Automata {
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
