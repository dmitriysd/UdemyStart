package RecursIterativ11;
// поиск минимадльного элемента в массиве

public class FindMinElementUsingRecursion {
    public static void main(String[] args) {

        int[] array = {1, -2, 8, 0, -5};
        System.out.println(findMin(array));
        System.out.println(findMinR(array, 1, array[0]));
    }

    // Iterative
    private static int findMin(int[] array) {
        var min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
// Recursion
    private static int findMinR(int[] array, int i, int min) {
        if(i == array.length){
            return min;}
        else{
            if(array[i] < min) {
                return findMinR(array, i + 1, array[i]);
            }
            else{
                return findMinR(array, i + 1, min);
            }
        }

    }
}
