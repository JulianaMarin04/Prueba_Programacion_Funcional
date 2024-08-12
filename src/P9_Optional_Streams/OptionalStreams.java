package P9_Optional_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalStreams {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Berta S.");
        nombres.add("Roberto");
        nombres.add("Ricardo");
        nombres.add("Olga");
        nombres.add("Marta");
        nombres.add("Elena");
        nombres.add("Ricardo");

        String nombreFiltro = "Ricardo";
        List<String> filtrado= filtroNombre(nombres, nombreFiltro);
        imprimirListaNombres(filtrado);
    }

    public static List<String> filtroNombre(List<String> nombres, String nombre){
        return nombres.stream().filter(dato -> dato.equals(nombre)).collect(Collectors.toList());
    }

    public static void imprimirListaNombres(List<String> listaNombresFiltrados){
        Optional.ofNullable(listaNombresFiltrados).ifPresent(lista -> lista.forEach(nombre -> System.out.println("Nombre encontrado = " + nombre)));
    }
}
