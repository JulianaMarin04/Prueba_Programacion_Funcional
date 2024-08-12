package P4_Libros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class GestionLibros {

    public static void main(String[] args) {
        Supplier<List<Libro>> listaLibrosSupplier = () -> {
            List<Libro> libros = new ArrayList<>();
            libros.add(new Libro("El principito","Antoine de Saint", 8.1));
            libros.add(new Libro("Harry potter", "J.K. Rowling", 8.2));
            libros.add(new Libro("Maze runner: correr o morir", "James Dashner", 8.5));
            libros.add(new Libro("Maze runner: aprueba de fuego", "James Dashner", 9.1));
            libros.add(new Libro("Maze runner: virus letal", "James Dashner", 6.1));
            libros.add(new Libro("Los juegos del hambre", "Suzanne Collins", 6.5));
            libros.add(new Libro("Los juegos del hambre: En llamas", "Suzanne Collins", 6.6));
            libros.add(new Libro("Los juegos del hambre: Sinsajo","Suzanne Collins", 6.0));
            libros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien", 8.9));
            libros.add(new Libro("El hobbit","J.R.R. Tolkien", 9.1));
            libros.add(new Libro("Millennium", "Stieg Larsson", 9.2));
            return libros;
        };

        List<Libro> listaLibros = listaLibrosSupplier.get();

        Predicate<Libro> esRecomendado  = libro -> libro.getPuntaje() >=7;

        UnaryOperator <Libro> recomendado = libro -> {
            if(esRecomendado.test(libro)){
                System.out.println("El libro: " + libro.getNombre() + " es recomendado con un puntaje de " + libro.getPuntaje());
            }
            return libro;
        };

        Consumer<List<Libro>> consumerRecomendado = libros -> {
          for (Libro libro : libros){
              recomendado.apply(libro);
          }
        };
        consumerRecomendado.accept(listaLibros);
    }
}
