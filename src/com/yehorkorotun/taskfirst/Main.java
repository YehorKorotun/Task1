package com.yehorkorotun.taskfirst;

import com.yehorkorotun.taskfirst.task1.FillArray;
import com.yehorkorotun.taskfirst.task2.NumberOfLines;
import com.yehorkorotun.taskfirst.task3.MathOperations;


public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Task 1: ");
        new FillArray().randomArray();

        System.out.println("Task 2: ");
        new NumberOfLines().enterNumbersAndValuesOfLines();

        System.out.println("Task 3: ");
        new MathOperations().enterNumbersAndCalculation();

    }
}
