package com.company.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("----- CALCULATOR -----");
        System.out.println("by Michael Romanyshyn");
        System.out.println();

        System.out.println("Please, choose your language:");
        System.out.println("0 - English;");
        System.out.println("1 - Ukrainian.");
        System.out.println();

        while (true) {
            Scanner console = new Scanner(System.in);
            String languageCase = console.nextLine();

            if ((languageCase.equals("0")) || (languageCase.equalsIgnoreCase("english"))) {
                Language.englishVersion();
                break;
            } else if ((languageCase.equals("1")) || (languageCase.equalsIgnoreCase("ukrainian"))) {
                Language.ukrainianVersion();
                break;
            } else {
                System.out.println("Something went wrong!");
                System.out.println("Please, choose your prefer language...");
                System.out.println("Enter \"0\",\"1\" or \"English\", \"Ukrainian\" (you may ignore case)");
            }
        }
    }
}
