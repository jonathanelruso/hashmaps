package contactitos;

import java.util.Scanner;
import java.util.TreeMap;

public class contactos {
    static TreeMap<String, Integer> agendaContactos = new TreeMap<>();

    public static void agregarContactos() {
        int cantidad;
        String nombre;
        Integer numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos contactos quieres agregar?");
        cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            sc.nextLine();
            System.out.println("Nombre:");
            nombre = sc.nextLine();
            System.out.println("Numero");
            numero = sc.nextInt();
            agendaContactos.put(nombre, numero);
        }

        sc.close();
    }

    public static void mostrarContactos() {
        if (agendaContactos.isEmpty()) {
            System.out.println("No hay contactos registrados");
            return;
        } else {
            System.out.println("Estos son tus contactos: ");
            System.out.println(agendaContactos);
        }

    }

    public static void buscarContactos() {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        System.out.println("Ingrese el nombre del contacto para buscar su numero");
        respuesta = scanner.nextLine();
        if (agendaContactos.containsKey(respuesta)) {
            System.out.println(agendaContactos.get(respuesta));
        } else {
            System.out.println("Ese contacto no existe");
            return;
        }
        scanner.close();
    }
}
