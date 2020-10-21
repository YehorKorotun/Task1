package com.yehorkorotun.taskfirst.task3;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MathOperations {
    private int firstNumber;
    private int secondNumber;
    private char operation;
    private int resultOfCalculation;

    private Scanner scanner = new Scanner(System.in);

    public void MathOperations (char operation, int resultOfCalculation, Scanner scanner) {
        this.operation = operation;
        this.resultOfCalculation = resultOfCalculation;
        this.scanner = scanner;
    }

    public void enterNumbers (){
        try {
            System.out.println("Enter first number: ");
            firstNumber = scanner.nextInt();
            System.out.println("Enter second number: ");
            secondNumber = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Error, incorrect format! Try again!");
        }
        try {
            System.out.println("Enter the operation: ");
            operation = scanner.next().charAt(0);
        } catch (Exception e){
            System.out.println("CHAR");
        }
    }

    public void calculation(){
        switch(operation){
            case '+':
                resultOfCalculation = firstNumber + secondNumber;
                break;
            case '-':
                resultOfCalculation = firstNumber - secondNumber;
                break;
            case '*':
                resultOfCalculation = firstNumber * secondNumber;
                break;
            case '/':
                resultOfCalculation = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Error, try one more time!");
                enterNumbers();
        }
        System.out.print("Your result is: " + resultOfCalculation);
    }
}
