package com.company.calculator;

import java.util.Arrays;

public class Functions extends Calculator {
    public static void printFunctions (){
        String[][] functions = {{"sin   ", "cos   ", "tan   ", "cotan "}, {" abs    ", " log    ", " square ", " power  "}, {" /", " *", " -", " +"}};

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(functions[j][i]);
            }
        }

        System.out.println();
        System.out.println();
    }

    public static void sin(double value) {
        System.out.println("sin(" + value + ") = " + Math.sin(value));
        System.out.println();
    }

    public static void cos(double value) {
        System.out.println("cos(" + value + ") = " + Math.cos(value));
        System.out.println();
    }

    public static void tan(double value) {
        System.out.println("tan(" + value + ") = " + Math.tan(value));
        System.out.println();
    }

    public static void cotan(double value) {
        System.out.println("cotan(" + value + ") = " + (1.0 / Math.tan(value)));
        System.out.println();
    }

    public static void abs(double value) {
        System.out.println("abs(" + value + ") = " + Math.abs(value));
        System.out.println();
    }

    public static void log(double value) {
        System.out.println("log(" + value + ") = " + Math.log(value));
        System.out.println();
    }

    public static void square(double value) {
        System.out.println("sqrt(" + value + ") = " + Math.sqrt(value));
        System.out.println();
    }

    public static void power(double base, double exponent) {
        System.out.println(base + " power(" + exponent + ") = " + Math.pow(base, exponent));
        System.out.println();
    }

    public static void division(double x, double y) {
        if (y != 0) {
            System.out.println(x + " / " + y + " = " + (x / y));
        } else {
            System.out.println("NaN");

        }
        System.out.println();
    }

    public static void multiplication(double x, double y) {
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println();
    }

    public static void addition(double x, double y) {
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println();
    }

    public static void subtraction(double x, double y) {
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println();
    }
}
