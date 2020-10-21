package com.yehorkorotun.taskfirst;

import com.yehorkorotun.taskfirst.task1.FillArray;
import com.yehorkorotun.taskfirst.task2.NumberOfLines;
import com.yehorkorotun.taskfirst.task3.MathOperations;


public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Task 1: ");
        //new FillArray().randomArray();

        System.out.println("Task 2: ");
        NumberOfLines numberOfLines = new NumberOfLines();
        numberOfLines.enterNumbersAndValuesOfLines();
        numberOfLines.averageLength();

        System.out.println("Task 3: ");
        MathOperations mathOperations = new MathOperations();
//        mathOperations.enterNumbers();
//        mathOperations.calculation();

    }
}
