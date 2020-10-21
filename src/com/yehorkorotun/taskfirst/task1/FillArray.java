package com.yehorkorotun.taskfirst.task1;

import java.util.Arrays;
import java.util.Random;

public class FillArray {
    public void randomArray() {
        Random random = new Random();
        int[] randomArray = new int[10];
        System.out.println("Original numbers:");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(randomArray));

        System.out.println("Replaced numbers:");
        for (int j = 0; j < randomArray.length; j++) {
            if (randomArray[j] < 0){
                randomArray[j] = 0;
            }
        }
        System.out.println(Arrays.toString(randomArray));
    }
}
