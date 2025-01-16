import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class mapas {
    public static void main(String[] args) {
        // HashMap<String, String> capitalPais = new HashMap<String, String>();
        // capitalPais.put("Spain", "Madrid");
        // capitalPais.put("Italia", "Roma");
        // capitalPais.put("Francia", "Paris");
        // capitalPais.put("Noruega", "Oslo");
        // System.out.println(capitalPais);

        // // Acceder al elementito
        // System.out.println(capitalPais.get("Spain"));

        // // Eliminar un element

        // capitalPais.remove("Spain");
        // System.out.println(capitalPais);

        // HashMap<String, String> mihashMap = new HashMap<>();
        // mihashMap.put("Nombre", "Suzuki");
        // mihashMap.put("Potencia", "220");
        // mihashMap.put("Tipo", "2-wheeler");
        // mihashMap.put("Precio", "85000");
        // System.out.println("Elementos del mapa:" + mihashMap);

        // TreeMap<String, String> mihashMap = new TreeMap<>();
        // mihashMap.put("Nombre", "Suzuki");
        // mihashMap.put("Potencia", "220");
        // mihashMap.put("Tipo", "2-wheeler");
        // mihashMap.put("Precio", "85000");
        // System.out.println("Elementos del mapa:" + mihashMap);

        // TreeMap<Integer, String> football = new TreeMap<>();

        // football.put(1, "Casillas");
        // football.put(15, "Ramos");
        // football.put(6, "Iniesta");
        // football.put(8, "Xavi");

        LinkedHashMap<Integer, String> football = new LinkedHashMap<>();

        football.put(1, "Casillas");
        football.put(15, "Ramos");
        football.put(6, "Iniesta");
        football.put(8, "Xavi");

        System.out.println(football.values());

    }

}