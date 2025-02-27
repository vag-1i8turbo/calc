package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение. Например(3_+_5)");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Неправильно введено выражение.");
            return;
        }
        try {
            int num1 = Integer.parseInt(parts[0]);
            String operation = parts[1];
            int num2 = Integer.parseInt(parts[2]);
            Calculator calculator = new Calculator();
            int result = calculator.calc(num1, num2, operation);
            if (result == Integer.MIN_VALUE) {
                return;
            }
            System.out.println("Ответ:" + result);
        } catch(NumberFormatException e) {
            System.out.println("Введите числа!");
        }
    }
}