package Ejercicios_G4;

import java.util.Random;

public class Loading {
    public void G4_Loading_1() {
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

}
