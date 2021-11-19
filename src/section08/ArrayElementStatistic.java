package section08;

public class ArrayElementStatistic {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};

        int[] unique = new int[arr.length];
        int[] counts = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            var element = arr[i];

            var exists = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == element) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                var number = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (element == arr[j]) {
                        number++;
                    }
                }
                unique[count] = element;
                counts[count] = number;
                count++;
            }
        }
        for (int i = 0; i < count; i++){
                System.out.println(unique[i] + " = " + ((double)counts[i] * 100/ arr.length + "%"));
            }
        }

    }

