package Ejercicios_G4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CadenaDeCaracteres {
public void G4_CadenadeCaracteres_3( Scanner scanner) {
      System.out.println("Cadena de caracteres 3"); 
      String frase;
        System.out.println("Ingrese una frase: ");
       frase = scanner.nextLine();
       String sinVocales = frase.replaceAll("[a,e,i,o,u,A,E,I,O,U]", " ");
       System.out.println(sinVocales);
       System.out.println(" "); 

   } 

   
       public void G4_CadenadeCaracteres_8(Scanner scanner) {
         System.out.println("Cadena de caracteres 8"); 
        int maxIntentos = 3;
        Map<String, String> palabraConSuAnagrama = new HashMap<>();
        palabraConSuAnagrama.put("delira", "lidera");
        palabraConSuAnagrama.put("ballena", "llenaba");
        palabraConSuAnagrama.put("alondra", "ladrona");
        palabraConSuAnagrama.put("españa", "apanes");
        palabraConSuAnagrama.put("enrique", "quieren");

        System.out.println("Las palabras son: " + palabraConSuAnagrama.keySet());
        System.out.println("Ingresa una palabra y su anagrama correspondiente:");
        boolean acierto = false;

        for (int intentos = 1; intentos <= maxIntentos; intentos++) {
            System.out.print("Ingrese la palabra: ");
            String palabra = scanner.nextLine().toLowerCase();
            System.out.print("Ingrese el anagrama: ");
            String anagramaIntento = scanner.nextLine().toLowerCase();

            if (palabraConSuAnagrama.containsKey(palabra) && 
                anagramaIntento.equalsIgnoreCase(palabraConSuAnagrama.get(palabra))) {
                acierto = true;
                System.out.println("¡Correcto! El anagrama de " + palabra + " es " + anagramaIntento);
                break;
            } else {
                System.out.println("Incorrecto.");
            }
        }

        if (!acierto) {
            System.out.println("Lo siento, has fallado tres veces. Aquí están los anagramas correctos:");
            for (Map.Entry<String, String> entrada : palabraConSuAnagrama.entrySet()) {
                System.out.println("Palabra: " + entrada.getKey() + " -> Anagrama: " + entrada.getValue());
            }
        }
       System.out.println(" "); 

    }
    
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
