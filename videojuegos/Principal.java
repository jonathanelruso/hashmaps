package videojuegos;

import java.util.Scanner;

public class Principal extends juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1. Jugar nueva partida");
            switch (opcion = sc.nextInt()) {
                case 1:
                    jugarPartida();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 4);
        sc.close();
    }
}
