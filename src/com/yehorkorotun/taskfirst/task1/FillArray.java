package com.yehorkorotun.taskfirst.task1;

import java.util.Arrays;

public class FillArray {
    public void randomArray() {
        int[] randomArray = new int[10];
        System.out.println("Original numbers:");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) ((Math.random() * 30) - 15);
            System.out.println(randomArray[i] + " ");
        }

        System.out.println("Replaced numbers:");
        for (int j = 0; j < randomArray.length; j++) {
            if (randomArray[j] < 0){
                randomArray[j] = 0;
            }
        }
        System.out.println(Arrays.toString(randomArray));
    }
}
