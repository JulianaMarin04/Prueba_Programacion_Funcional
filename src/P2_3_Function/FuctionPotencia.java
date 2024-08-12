package P2_3_Function;

import java.util.function.Function;
import java.util.function.Predicate;

public class FuctionPotencia {
    public static void main(String[] args) {
        int base = 5;
        int exponente = 2;

        Function<Integer, Function<Integer, Integer>> potencia = b -> exp -> (int) Math.pow(b, exp);

        int result = potencia.apply(base).apply(exponente);
        Predicate<Integer> isEven  = x-> x % 2 == 0;
        String mensaje = isEven.test(result) ? "El resultado es par" : "El resultado es impar";

        System.out.println(base + "^" + exponente + " = " + result);
        System.out.println(mensaje);
    }
}


