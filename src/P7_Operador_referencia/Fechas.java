package P7_Operador_referencia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Fechas {
    public static void main(String[] args) {
        List<LocalDate> fechas = getList(
                LocalDate.parse("2000-04-22"),
                LocalDate.parse("1950-12-03"),
                LocalDate.parse("1870-04-15"),
                LocalDate.parse("1700-07-07")
        );
        fechas.forEach(Fechas::formatoFecha);

    }
    public static void formatoFecha (LocalDate date){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd 'de' MMMM 'del año' yyyy");
        String fechaString = date.format(dateFormat);
        System.out.println("La fecha es " + fechaString);
    }
    static <T> List <T> getList (T... elements){
        return Arrays.asList(elements);
    }
}
