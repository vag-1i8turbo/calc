package com.example;

public class Calculator {
    public int calc(int num1, int num2, String operation) {
int result = 0;
switch (operation) {
                case "+":
                    result = plus(num1, num2);
                    break;
                case "-":
                result = minus(num1, num2);
                break;
                case "*":
                result = umn(num1, num2);
                break;
                case "/":
                result = del(num1, num2);
                break;
                default:
                System.out.println("Неправильная операция: " + operation);
                return Integer.MIN_VALUE;
    }
return result;
    }   
public int plus(int num1, int num2) {
    return num1 + num2;
}
public int minus(int num1, int num2) {
    return num1 - num2;
}
public int umn(int num1, int num2) {
    return num1 * num2;
}
public int del(int num1, int num2) {
    if (num2 == 0) {
        System.out.println("Деление на ноль невозможно");
        return 0;
    }
    return num1 / num2;
}

}
    