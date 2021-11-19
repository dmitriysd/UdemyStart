package section08;

public class ArrayElementSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        var sum = 0;
        for (int i = 0; i <= arr.length; i++) { // или for(int i : arr)
            sum += i;
        }
        System.out.println(sum);
    }
}
