package P6_Interface_SAM;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Datos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre: " );
        String nombre = scanner.nextLine();

        System.out.print("Ingrese edad: " );
        int edadIngresada = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese fecha nacimiento yyyy-MM-dd: ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());

        int año = fechaNacimiento.getYear();
        int mes = fechaNacimiento.getMonthValue();
        int dia = fechaNacimiento.getDayOfMonth();

        Function<Integer, String> addCeros = x -> x < 10 ? "0" + x : String.valueOf(x);

        TriFunction<Integer,Integer,Integer, LocalDate> parsearFecha = (day, month, year) -> LocalDate.parse(year + "-" + addCeros.apply(month) + "-" + addCeros.apply(day));

        TriFunction<Integer, Integer, Integer, Integer> calcularEdad = (day, month, year) -> Period.between( parsearFecha.apply(day, month,year), LocalDate.now()).getYears();

        int edadCalculada = calcularEdad.apply(dia, mes, año);

        BiFunction<Integer, Integer, Boolean> edadCoincide = (edadI, edadC) -> edadI.equals(edadC);


        Consumer<Boolean> resultadoCoincidencia = resultado -> {
            if(resultado){
                System.out.println("La fecha de nacimiento de "+ nombre +" corresponde a la edad ingresada");
            }else {
                System.out.println("La fecha de nacimiento de "+ nombre +" no corresponde a la edad ingresada");
            }
        };
        resultadoCoincidencia.accept(edadCoincide.apply(edadIngresada,edadCalculada));
    }
@FunctionalInterface
    interface TriFunction<T,U,V,R>{
        R apply(T t, U u, V v);
    }
}
