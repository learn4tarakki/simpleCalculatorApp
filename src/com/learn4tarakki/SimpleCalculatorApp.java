package com.learn4tarakki;

public class SimpleCalculatorApp {

    public static int add(int num1, int num2) {
        return (num1 + num2);
    }
    
    public static int sub(int num1, int num2) {
        return (num1 - num2);
    }
    

    public static void main(String[] args) {
        int result = sub(2, 4);
        
        System.out.println("Result is: " + result);
    }

}
