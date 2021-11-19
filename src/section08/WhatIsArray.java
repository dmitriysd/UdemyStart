package section08;

import java.util.Arrays;

public class WhatIsArray {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        boolean[] bool = new boolean[10];

        System.out.println(Arrays.toString(bool));
        System.out.println(array[0]);
        array[0] = 99;
        System.out.println(array[0]);
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
//------------Вывод всех элементов массива-------------------------------
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
//-----------------------------------------------------------------------
        for (int i = 0; i < array.length; i++) {
           
        }
//----------------Вывод всех элементов массива в обратном порядке---------
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
//-----------------------конструкция foreach------------------------------
        System.out.println(" ");
        for (int i : array) {
            System.out.print(i +" ");
        }
    }

}
