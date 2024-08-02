package homework.homework3;

public class ArrayUtil {
    int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
    void one(){

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println(numbers[0]);

        System.out.println(numbers.length - 1);

        System.out.println(numbers.length);
    }

    void two(){
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];

            }
        }
        System.out.println(min);
    }

    void three(){
        if (numbers.length > 2) {
            int midvalue = (0 + (numbers.length - 1)) / 2;

            System.out.println(numbers[midvalue]);
        } else {
            System.out.println("Can't print middle values");
        }

    }

    void four(){
        int x = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                x = x + 1;
            }

        }
        System.out.println(x);

    }
    void five (){
        int y = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                y = y + 1;
            }
        }
        System.out.println(y);

    }

    void six(){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    void seven (){
        int a = 0;
        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            a = sum / numbers.length;
        }
        System.out.println(a);
    }
    }


