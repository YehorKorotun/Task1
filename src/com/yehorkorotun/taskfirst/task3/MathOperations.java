package com.yehorkorotun.taskfirst.task3;

import java.util.Scanner;

public class MathOperations {
    private int firstNumber;
    private int secondNumber;
    private char operation;
    private int resultOfCalculation;

    private Scanner scanner = new Scanner(System.in);

    public void enterNumbers(){
        System.out.println("Enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = scanner.nextInt();
        System.out.println("Enter the operation: ");
        operation = scanner.next().charAt(0);
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
