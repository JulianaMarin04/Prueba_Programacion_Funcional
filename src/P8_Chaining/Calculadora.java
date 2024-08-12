package P8_Chaining;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese valor a sumar: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese valor a restar: ");
        int num3 = scanner.nextInt();

        System.out.print("Ingrese valor a multiplicar: ");
        int num4 = scanner.nextInt();

        Chainer chainer = new Chainer(num1);
        chainer.suma(num2).resta(num3).multiplicacion(num4);
    }

    public static class Chainer {
        int result;

        public Chainer(int result) {
            this.result = result;
        }

        public Chainer suma(int num){
            result += num;
            System.out.println("Acumulado despues de sumar " + result);
            return this;
        }
        public Chainer resta(int num){
            result -= num;
            System.out.println("Acumulado despues de restar "+ result);
            return this;
        }
        public Chainer multiplicacion(int num){
            result *= num;
            System.out.println("Acumulado despues de multiplicar " + result);
            return this;
        }
    }
}
