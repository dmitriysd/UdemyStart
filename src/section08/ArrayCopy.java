package section08;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args){
        int[] arr = {11, 72, 53, 94, 35};
        int[] arr2 = new int[arr.length];
        int[] arr3 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        System.arraycopy(arr, 0, arr3, 0, arr.length);

        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.print(Arrays.toString(arr2));
        System.out.println();
        System.out.print("Массив 3 " + "= " + Arrays.toString(arr3));
    }
}
