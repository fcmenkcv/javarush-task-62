package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/*
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        if (n > 0) {
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = console.nextInt();
            }
            if (n % 2 == 0) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.println(array[j]);
                }
            } else {
                for (int k = 0; k < n; k++) {
                    System.out.println(array[k]);
                }
            }
        }
    }
}
