package videojuegos;

import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

public class juego {
    static LinkedHashMap<String, Integer> jueguito = new LinkedHashMap<>();
    static int victorias = 0;
    static int derrotas = 0;
    static int empates = 0;
    static int partidas = 0;

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
                        partidas++;
                        empates++;
                    }

                    if (jugadorCPU == 3) {
                        System.out.println(
                                "Felicidades, sacaste " + jugadas[opcion - 1] + " y la CPU " + jugadas[jugadorCPU - 1]);
                        partidas++;
                        victorias++;
                    }

                    if (jugadorCPU == 2) {
                        System.out.println(
                                "Perdiste, sacaste " + jugadas[opcion - 1] + " y la CPU " + jugadas[jugadorCPU - 1]);
                        partidas++;
                        derrotas++;
                    }
                    return;
                case 2:
                    if (opcion == jugadorCPU) {
                        System.out.println(
                                "Empate. Tu sacaste " + jugadas[opcion - 1] + " y la CPU " + jugadas[jugadorCPU - 1]);
                        partidas++;
                        empates++;
                    }

                    if (jugadorCPU == 3) {
                        System.out.println(
                                "Perdiste, sacaste " + jugadas[opcion - 1] + " y la CPU " + jugadas[jugadorCPU - 1]);
                        partidas++;
                        derrotas++;
                    }

                    if (jugadorCPU == 1) {
                        System.out.println(
                                "Felicidades, sacaste " + jugadas[opcion - 1] + " y la CPU " + jugadas[jugadorCPU - 1]);
                        partidas++;
                        victorias++;
                    }

                    return;
                case 3:
                    if (opcion == jugadorCPU) {
                        System.out.println(
                                "Empate. Tu sacaste " + jugadas[opcion - 1] + " y la CPU " + jugadas[jugadorCPU - 1]);
                        partidas++;
                        empates++;
                    }

                    if (jugadorCPU == 2) {
                        System.out.println(
                                "Felicidades, sacaste " + jugadas[opcion - 1] + " y la CPU " + jugadas[jugadorCPU - 1]);
                        partidas++;
                        victorias++;
                    }

                    if (jugadorCPU == 1) {
                        System.out.println(
                                "Perdiste, sacaste " + jugadas[opcion - 1] + " y la CPU " + jugadas[jugadorCPU - 1]);
                        partidas++;
                        derrotas++;
                    }

                    return;
                case 4:
                    System.out.println("Volviendo al menu...");
                    return;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 4);
        sc.close();
    }

    public static void historialPartidas() {
        jueguito.put("Partidas", partidas);
        jueguito.put("Victorias", victorias);
        jueguito.put("Empates", empates);
        jueguito.put("Derrotas", derrotas);
        

        System.out.println(jueguito.toString());

    }
}
