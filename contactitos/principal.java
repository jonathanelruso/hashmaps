package contactitos;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int respuesta;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Elige la operacion a realizar: ");
            System.out.println("1.Agregar contactos");
            System.out.println("2.Mostrar contactos");
            System.out.println("3.Buscar contactos");
            System.out.println("4.Salir");
            respuesta = scanner.nextInt();
            switch (respuesta) {
                case 1:
                    contactos.agregarContactos();
                    break;
                case 2:
                    contactos.mostrarContactos();
                    break;
                case 3:
                    contactos.buscarContactos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (respuesta != 4);
        scanner.close();
    }
}
