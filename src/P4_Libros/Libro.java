package P4_Libros;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Libro {
    private String nombre;
    private String autor;
    private Double puntaje;

    public Libro(String nombre, String autor, Double puntaje) {
        this.nombre = nombre;
        this.autor = autor;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", puntaje=" + puntaje +
                '}';
    }
}
