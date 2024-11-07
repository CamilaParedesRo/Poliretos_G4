package Ejercicios_G4;

import java.util.Scanner;

public class CadenaDeCaracteres {
 public void G4_Cadena_5(Scanner scanner) {
        System.out.println("Cadena 5");
        System.out.print("Ingresa una palabra: ");
    
        if (scanner.hasNextLine()) {  
            scanner.nextLine();
        }
    
        String palabra = scanner.nextLine();
    
    
        String resultado = invertirYConvertirVocales(palabra);
        System.out.println("Salida: " + resultado);
    }

    public  String invertirYConvertirVocales(String palabra) {
        StringBuilder invertida = new StringBuilder(palabra).reverse();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < invertida.length(); i++) {
            char letra = invertida.charAt(i);
            if ("aeiouAEIOU".indexOf(letra) != -1) { 
                resultado.append(Character.toUpperCase(letra));
            } else {
                resultado.append(Character.toLowerCase(letra));
            }
        }

        return resultado.toString();
    }
}
