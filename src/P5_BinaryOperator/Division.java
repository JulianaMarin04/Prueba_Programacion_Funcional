package P5_BinaryOperator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese primer numero:" );
        BigDecimal num1 = scanner.nextBigDecimal();

        System.out.print("Ingrese segundo numero:");
        BigDecimal num2 = scanner.nextBigDecimal();

        BinaryOperator<BigDecimal> division = (x, y) -> x.divide(y, BigDecimal.ROUND_HALF_UP);
        System.out.println("El resultado de la division es: " + division.apply(num1, num2));
    }
}
