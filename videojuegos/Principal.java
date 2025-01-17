package videojuegos;

import java.util.Scanner;

public class Principal extends juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1. Jugar nueva partida");
            System.out.println("2. Historial de partidas");
            System.out.println("4. Salir");
            switch (opcion = sc.nextInt()) {
                case 1:
                    jugarPartida();
                    break;
                case 2:
                    historialPartidas();
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 4);
        sc.close();
    }
}
