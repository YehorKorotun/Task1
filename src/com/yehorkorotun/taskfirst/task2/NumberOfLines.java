package com.yehorkorotun.taskfirst.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOfLines {
    private int numberOfLines;
    private int valuesOfLines;
    private int [] numbersArray;
    private int sumOfValues;
    private Scanner scanner;

    public void NumberOfLines (){
         this.scanner = new Scanner(System.in);
    }

    public void enterDataAndPerformCalculations() {
        try {
            System.out.println("Enter the number of lines: ");
            numberOfLines = scanner.nextInt();
            numbersArray = new int[numberOfLines];
            System.out.println("Enter the values of lines: ");
            for (int i = 0; i < numberOfLines; i++) {
                valuesOfLines = scanner.nextInt();
                numbersArray[i] = valuesOfLines;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error! Try one more time!");
        } catch (NullPointerException e) {
            System.out.println("Error! The string cannot be empty!");
        }
        for (int i = 0; i < numbersArray.length; i++) {
            sumOfValues += numbersArray[i];
        }
        System.out.println("Average length of lines is: " + sumOfValues / numberOfLines);
    }
}
