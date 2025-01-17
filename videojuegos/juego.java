package videojuegos;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class juego {
    static TreeMap<Integer, String> jueguito = new TreeMap<>();

    public static void jugarPartida() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int opcion;

        String jugadas[] = { "Piedra", "Papel", "Tijeras" };

        do {
            System.out.println("Que deseas sacar?");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            System.out.println("4. Volver al menu");
            int jugadorCPU = random.nextInt(3) + 1;
            switch (opcion = sc.nextInt()) {

                case 1:
                    if (opcion == jugadorCPU) {
                        System.out.println(
                                "Empate. Tu sacaste " + jugadas[opcion - 1] + " y la CPU " + jugadas[jugadorCPU - 1]);
                    }

                    if (jugadorCPU == 3) {
                        System.out.println(
                                "Felicidades, sacaste " + jugadas[opcion - 1] + " y la CPU " + jugadas[jugadorCPU - 1]);
                    }

                    if (jugadorCPU == 2) {
                        System.out.println(
                                "Perdiste, sacaste " + jugadas[opcion - 1] + " y la CPU " + jugadas[jugadorCPU - 1]);
                    }
                    return;
                case 2:
                    if (opcion == jugadorCPU) {
                        System.out.println(
                                "Empate. Tu sacaste " + jugadas[opcion - 1] + " y la CPU " + jugadas[jugadorCPU - 1]);
                    }
                    return;
                case 3:
                    if (opcion == jugadorCPU) {
                        System.out.println(
                                "Empate. Tu sacaste " + jugadas[opcion - 1] + " y la CPU " + jugadas[jugadorCPU - 1]);
                    }
                    return;
                case 4:
                    System.out.println("Volviendo al menu...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 4);

    }
}
