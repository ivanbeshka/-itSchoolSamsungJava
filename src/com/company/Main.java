package com.company;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        calculate();
    }

    static void calculate() {
        int result = 0;
        int number1;
        int number2;
        String action;
        boolean repeat;

        do {
            repeat = false;
            System.out.println("Введите два числа");
            number1 = in.nextInt();
            number2 = in.nextInt();

            System.out.println("Какое действие совершить?");
            action = in.next();

            switch (action) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    result = number1 / number2;
                    break;
            }
            System.out.println("Результат : " + result);
            result = 0;

            System.out.println("Начать заново?");
            if (in.next().equals("Yes")) {
                repeat = true;
            }

        } while (repeat);
    }
}
