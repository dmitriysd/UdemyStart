package section08;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5};
        var query = 60;

//----------------поиск значения------------
        var index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == query) {
                index = i;
                break;
            }
        }
//-------------вывод результата поиска---------
           System.out.println(index);


    }
}
