package section08;

import java.util.Arrays;

public class ArrayCopyRange {

            public static void main(String[] args){
            int[] arr = {11, 72, 53, 94, 35};

            int startIndex = 1;
            int endIndex = 3;
            int[] arr2 = new int[endIndex - startIndex];


            System.arraycopy(arr, 0 + startIndex, arr2, 0, arr2.length);


            System.out.print("Массив 2 " + "= " + Arrays.toString(arr2));
        }
    }

