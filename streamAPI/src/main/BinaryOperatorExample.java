package main;

import java.util.*;
//import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        /*BinaryOperator<Integer> somar = (num1, num2) -> num1+num2;*/

        int resultado = numeros.stream()
                .reduce(0, (n1, n2) -> n1+n2);

        System.out.println("A soma de todos os números é: " + resultado);
    }
}
