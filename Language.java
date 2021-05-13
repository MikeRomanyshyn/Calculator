package com.company.calculator;

import java.util.Scanner;

public class Language extends Calculator {

    // Ukrainian version of Calculator
    public static void ukrainianVersion() {
        boolean isCalculatorUsing = true;

        System.out.println("----- КАЛЬКУЛЯТОР -----");
        System.out.println("-- Українська версія --");
        System.out.println();

        while (isCalculatorUsing == true) {
            System.out.println("Оберіть функцію:");
            Functions.printFunctions();

            double value, x, y;
            Scanner console = new Scanner(System.in);
            String functionsCase = console.nextLine();

            switch (functionsCase) {
                case "sin":
                    System.out.println("Введіть градус кута, щоб отримати значення його синуса...");
                    value = console.nextDouble();
                    Functions.sin(value);
                    isCalculatorUsing = false;
                    break;
                case "cos":
                    System.out.println("Введіть градус кута, щоб отримати значення його косинуса...");
                    value = console.nextDouble();
                    Functions.cos(value);
                    isCalculatorUsing = false;
                    break;
                case "tan":
                    System.out.println("Введіть градус кута, щоб отримати значення його тангенса...");
                    value = console.nextDouble();
                    Functions.tan(value);
                    isCalculatorUsing = false;
                    break;
                case "cotan":
                    System.out.println("Введіть градус кута, щоб отримати значення його котангенса...");
                    value = console.nextDouble();
                    Functions.cotan(value);
                    isCalculatorUsing = false;
                    break;
                case "abs":
                    System.out.println("Введіть число, щоб отримати його абсолютне значення...");
                    value = console.nextDouble();
                    Functions.abs(value);
                    isCalculatorUsing = false;
                    break;
                case "log":
                    System.out.println("Введіть число, щоб отримати значення його натурального логарифма...");
                    value = console.nextDouble();
                    Functions.log(value);
                    isCalculatorUsing = false;
                    break;
                case "square":
                    System.out.println("Введіть число, щоб отримати значення його кореня...");
                    value = console.nextDouble();
                    Functions.square(value);
                    isCalculatorUsing = false;
                    break;
                case "power":
                    System.out.println("Введіть основу (число X)...");
                    System.out.println("X = " + (x = console.nextDouble()));
                    System.out.println("Введіть степінь (число Y) до якої потрібно підняти число " + x + "...");
                    System.out.println("Y = " + (y = console.nextDouble()));
                    Functions.power(x, y);
                    isCalculatorUsing = false;
                    break;
                case "/":
                    System.out.println("Введіть число X та Y, щоб отримати їхню частку...");
                    System.out.println("X = " + (x = console.nextDouble()));
                    System.out.println("Y = " + (y = console.nextDouble()));
                    while (y == 0) {
                        System.out.println("Ділити на 0 не можна. Змініть значення Y...");
                        System.out.println("Y = " + (y = console.nextDouble()));
                    }
                    Functions.division(x, y);
                    isCalculatorUsing = false;
                    break;
                case "*":
                    System.out.println("Введіть число X та Y, щоб отримати їхній добуток...");
                    System.out.println("X = " + (x = console.nextDouble()));
                    System.out.println("Y = " + (y = console.nextDouble()));
                    Functions.addition(x, y);
                    isCalculatorUsing = false;
                    break;
                case "-":
                    System.out.println("Введіть число X та Y, щоб отримати їхню різницю...");
                    System.out.println("X = " + (x = console.nextDouble()));
                    System.out.println("Y = " + (y = console.nextDouble()));
                    Functions.subtraction(x, y);
                    isCalculatorUsing = false;
                    break;
                case "+":
                    System.out.println("Введіть число X та Y, щоб отримати їхню суму...");
                    System.out.println("X = " + (x = console.nextDouble()));
                    System.out.println("Y = " + (y = console.nextDouble()));
                    Functions.addition(x, y);
                    isCalculatorUsing = false;
                    break;
                default:
                    System.out.println("Перевірте правильність написання функції і зробіть свій вибір.");
                    System.out.println();
                    continue;
            }

            System.out.println("Чи бажаєте Ви зробити наступне обчислення?");
            System.out.println("0 - Ні");
            System.out.println("1 - Так");
            System.out.println();


            Scanner key = new Scanner(System.in);
            String calculationCase = key.nextLine();
            System.out.println();

            if (calculationCase.equals("0") || (calculationCase.equalsIgnoreCase("ні"))) {
                isCalculatorUsing = false;
                System.out.println("Дякую за користування програмою КАЛЬКУЛЯТОР.");
                System.out.println("До зустрічі!");
            } else if (calculationCase.equals("1") || (calculationCase.equalsIgnoreCase("так"))) {
                isCalculatorUsing = true;
            } else {
                System.out.println("Помилка!");
                System.out.println("Зробіть свій вибір...");
                System.out.println("Введіть \"0\",\"1\" або \"Ні\", \"Так\" (можете ігнорувати великі літери)");
            }
        }
    }

    // English version of Calculator
    public static void englishVersion() {
        boolean isCalculatorUsing = true;

        System.out.println("----- CALCULATOR -----");
        System.out.println("-- English version --");
        System.out.println();

        while (isCalculatorUsing == true) {
            System.out.println("Choose function:");
            Functions.printFunctions();

            double value, x, y;
            Scanner console = new Scanner(System.in);
            String functionsCase = console.nextLine();

            switch (functionsCase) {
                case "sin":
                    System.out.println("Enter the value in degrees to calculate the sine of an angle...");
                    value = console.nextDouble();
                    Functions.sin(value);
                    isCalculatorUsing = false;
                    break;
                case "cos":
                    System.out.println("Enter the value in degrees to calculate the cosine of an angle...");
                    value = console.nextDouble();
                    Functions.cos(value);
                    isCalculatorUsing = false;
                    break;
                case "tan":
                    System.out.println("Enter the value in degrees to calculate the tangent of an angle...");
                    value = console.nextDouble();
                    Functions.tan(value);
                    isCalculatorUsing = false;
                    break;
                case "cotan":
                    System.out.println("Enter the value in degrees to calculate the cotangent of an angle...");
                    value = console.nextDouble();
                    Functions.cotan(value);
                    isCalculatorUsing = false;
                    break;
                case "abs":
                    System.out.println("Enter the value to get it absolute value...");
                    value = console.nextDouble();
                    Functions.abs(value);
                    isCalculatorUsing = false;
                    break;
                case "log":
                    System.out.println("Enter the value to calculate it natural logarithm...");
                    value = console.nextDouble();
                    Functions.log(value);
                    isCalculatorUsing = false;
                    break;
                case "square":
                    System.out.println("Enter the value to calculate it rounded positive square root...");
                    value = console.nextDouble();
                    Functions.square(value);
                    isCalculatorUsing = false;
                    break;
                case "power":
                    System.out.println("Enter the base (value X)...");
                    System.out.println("X = " + (x = console.nextDouble()));
                    System.out.println("Enter the exponent (value Y) to which" + x + " will be raised to...");
                    System.out.println("Y = " + (y = console.nextDouble()));
                    Functions.power(x, y);
                    isCalculatorUsing = false;
                    break;
                case "/":
                    System.out.println("Enter X and Y to calculate the result of their division...");
                    System.out.println("X = " + (x = console.nextDouble()));
                    System.out.println("Y = " + (y = console.nextDouble()));
                    while (y == 0) {
                        System.out.println("You can't divide into 0. Change the value of Y...");
                        System.out.println("Y = " + (y = console.nextDouble()));
                    }
                    Functions.division(x, y);
                    isCalculatorUsing = false;
                    break;
                case "*":
                    System.out.println("Enter X and Y to calculate the result of their multiplication...");
                    System.out.println("X = " + (x = console.nextDouble()));
                    System.out.println("Y = " + (y = console.nextDouble()));
                    Functions.addition(x, y);
                    isCalculatorUsing = false;
                    break;
                case "-":
                    System.out.println("Enter X and Y to calculate the result of their substraction...");
                    System.out.println("X = " + (x = console.nextDouble()));
                    System.out.println("Y = " + (y = console.nextDouble()));
                    Functions.subtraction(x, y);
                    isCalculatorUsing = false;
                    break;
                case "+":
                    System.out.println("Enter X and Y to calculate the result of their addition...");
                    System.out.println("X = " + (x = console.nextDouble()));
                    System.out.println("Y = " + (y = console.nextDouble()));
                    Functions.addition(x, y);
                    isCalculatorUsing = false;
                    break;
                default:
                    System.out.println("Check the function spelling and make your choice.");
                    System.out.println();
                    continue;
            }

            System.out.println("Do you want to make another calculation?");
            System.out.println("0 - No");
            System.out.println("1 - Yes");
            System.out.println();


            Scanner key = new Scanner(System.in);
            String calculationCase = key.nextLine();
            System.out.println();

            if (calculationCase.equals("0") || (calculationCase.equalsIgnoreCase("no")) || (calculationCase.equalsIgnoreCase("n"))) {
                isCalculatorUsing = false;
                System.out.println("Thank you for using CALCULATOR.");
                System.out.println("Let's keep in touch!");
            } else if (calculationCase.equals("1") || (calculationCase.equalsIgnoreCase("yes")) || (calculationCase.equalsIgnoreCase("y"))) {
                isCalculatorUsing = true;
            } else {
                System.out.println("Error!");
                System.out.println("Make your choice...");
                System.out.println("Enter only \"0\",\"1\" or \"N\", \"Y\" or \"No\", \"Yes\" (ignore case)");
            }
        }
    }
}