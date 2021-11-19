package section08;

public class FindMinElement {
    public static void main(String[] args) {
        int[] arr = {1, -2, -8, 0, 5};

        var min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){ min = arr[i];}
        }
        System.out.println(min);
    }
}