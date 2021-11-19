package section08;

public class ArrayElementCount {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2, 2};
        int element = 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                count ++;};
        }
        System.out.println(count);
    }
}