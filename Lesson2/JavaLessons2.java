/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalessons2;

import java.util.Arrays;

/**
 *
 * @author nikif
 */
public class JavaLessons2 {

       public static void main(String[] args) {
        
        
        System.out.println("Задание№1");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr1) + "");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] == 1 ? 0 : 1;
            System.out.print(arr1[i] + " ");
        }

        
        System.out.println("\n"+"Задание№2");
        int[] arr2 = new int[8];
        System.out.println(Arrays.toString(arr2) + "");
        for (int i = 1, j = 0; i < arr2.length; i++) arr2[i] = j += 3;
        for (int x : arr2) System.out.print(x + " ");

        
        System.out.println("\n"+"Задание№3");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3) + "");
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
            System.out.print(arr3[i] + " ");
        }
             System.out.println("\n"+"Задание№4");
        int[][] arr4 = new int[10][10];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\r\n");
        }
       System.out.println("Задание№5"); 
       int[] arr5 = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
               System.out.println(Arrays.toString(arr5) + "");
        int min = arr5[0], max = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
                   }
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
          System.out.println("Максимальный элемент  " +  " со значением  = " + max);
        System.out.println("Минимальный элемент  " + " со значением  = " + min);
        
        int[] arr6 = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 7};
        System.out.println("\n"+"Задание№6");
        System.out.println("\n"+"Результат ="+checkBalance(arr6));
       }
         public static boolean checkBalance(int[] arrParam) {
        int lSum, rSum;

        for (int i = 0; i < arrParam.length + 1; i++) {
            lSum = 0;
            rSum = 0;

            for (int j = 0; j < i; j++) {
                lSum += arrParam[j];
            }

            for (int j = i; j < arrParam.length; j++) {
                rSum += arrParam[j];
            }

            if (lSum == rSum) return true;
        }
        return false;
    } 
}
       
