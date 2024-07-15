package homework.homework1;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println(numbers[0]);

        System.out.println(numbers.length - 1);

        System.out.println(numbers.length);
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];

            }
        }
        System.out.println(min);
        if (numbers.length > 2) {
            int midvalue = (0 + (numbers.length - 1)) / 2;

            System.out.println(numbers[midvalue]);
        } else {
            System.out.println("Can't print middle values");
        }
        int x = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                x = x + 1;
            }

        }
        System.out.println(x);


        int y = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                y = y + 1;
            }
        }
        System.out.println(y);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            a = sum / numbers.length;
        }
        System.out.println(a);
    }

}
