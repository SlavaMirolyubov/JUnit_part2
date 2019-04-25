package com.mirolyubov;

public class Main {

    public static void main(String[] args) {

        String expression = "2 + (9 *(17,3 - 8*3.7)-19*(18-7))";
        System.out.println("Выражение : " + expression);
        System.out.println(calc(expression));

        // 2.3-8/(35,9+2*7/(-2))-9*2
        // 5 * (10 + 81 / (5 + 4) * 9) + (8 / (9 - 5) - 11.5)
        // 2 + 9 *(17,3 - 8*3.7)-19*(18-7)
        // 0+0-5*(0+10+81)
        // скобки ошибка 2.3-8/((35,9+2*7/(-2))-9*2
        //-65*9-9+6
        //36*(25-69*98/(21-9)-17*2)+32*7-9
    }

    public static String calc(String expression) {
        Calculator calculator = new Calculator();
        return calculator.calculate(expression);
    }
}
