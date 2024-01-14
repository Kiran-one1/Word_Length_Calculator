package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();

        int wordLength = calculateWordLength(inputWord);

        System.out.println("Length of the entered word: " + wordLength);

        scanner.close();
    }

    private static int calculateWordLength(String word) {
        return word.length();
    }
}
