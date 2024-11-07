package Ejercicios_G4;
import java.util.Random;
import java.util.Scanner;

public class Loading {
    public void G4_Loading_1() {
        System.out.println("Loading 1");
        String[] rotacion = {"|", "/", "-", "\\"};
        int carga = 0;

        while (carga <= 100) {
            System.out.print("\r" + rotacion[carga % 4] + " " + carga + "%");
            carga += 5;

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("\nLa operación fue interrumpida.");
                Thread.currentThread().interrupt();
                break;
            }
        }

        System.out.println("\nCarga completa: 100%");
    }

    public void G4_Loading_6() {
        System.out.println("Loading 6");
        int longitudBarra = 20;
        int progreso = 0;

        while (progreso <= 100) {
            System.out.print("\r[");
            int posicion = (progreso * longitudBarra) / 100;

            for (int i = 0; i < longitudBarra; i++) {
                if (i == posicion) {
                    System.out.print("<=>");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("] " + progreso + "%");
            progreso += 5;

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("La carga fue interrumpida.");
                break;
            }
        }
        System.out.println("\nProgreso completado.");
    }

    public  void dibujarVariasSenales(int cantidad, Random random) {
        for (int i = 0; i < cantidad; i++) {
            G4_Loading_11(random);
        }
    }

    public void G4_Loading_11(Random random) {
        System.out.println("Loading 1");
        int nivel = random.nextInt(51);
        StringBuilder senal = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            senal.append("-");
        }
        senal.append("|");
        for (int i = 0; i < nivel; i++) {
            senal.append("-");
        }

        String colorAzul = "\u001B[34m";
        String resetColor = "\u001B[0m";
        System.out.println(colorAzul + senal + resetColor + "    Nivel: " + nivel);
    }

   public void G4_Loading_4() {
      System.out.print("Loading 4");
      try {
          for (int i = 0; i <= 100; i += 10) { 
              System.out.print("\r");
              if ( (i / 10) % 2 == 0 ){
                  System.out.print(  "o0o" + " " + i + "%");
              }else{
                  System.out.print(  "0o0" + " " + i + "%");
              }
              Thread.sleep(700); 
          }
          System.out.println("\r Cargando siguiente pantalla ... Espere ");
      } catch (InterruptedException e) {
          System.out.println("La señal esta siendo interrumpida");
      }
      System.out.print(" ");
  }

      public void G4_Loading_9 (Scanner scanner){
         System.out.print("Loading 9");
        System.out.print("Ingresa tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        int longitud = nombreCompleto.length();
        
        for (int i = 0; i < longitud; i++) {
            int porcentaje = (i * 100) / (longitud - 1);
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(nombreCompleto.charAt(i) + "\t " + porcentaje + "%");
        }
        System.out.print("");
    }
}
