package section08;

public class CheckIfAllNumbersArePositive {
    public static void main(String[] args) {
        int[] arr = {1, 2, -8, 0, 5};

       var allPositive = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                allPositive = false;
                break;
            }
        }
            if (allPositive == true) {
                System.out.println("Все числа положительные");
            } else if (allPositive == false) {
                System.out.println("Есть отрицательные значения");
            }

        }
    }

