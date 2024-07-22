package homework;

public class ArrayHomework {
    public static void main(String[] args) {
        int nums[] = {2, 5, 8, 7, 4, 6, 1, 9, 3, 6};
        int n = 6;
        int a = 0;
        for (int x : nums) {
            if (x == n) {
                a = a + 1;
            }
        }
        System.out.println(a);


        int[] num = {6, 2, 8, 3, 9, 5, 7, 4, 1, 10};


        for (int i = 0; i < num.length / 2; i++) {
            int element = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = element;
        }
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] numss = {11, 4, 8, 2, 6, 7, 4, 1, 9, 4};
        int b = 0;
        int aa;
        for (int i = 0; i < numss.length; i++) {
            for (int j = 0; j < i; j++) {
                aa = numss[j];
                if (aa == numss[i]){
                    b= b+1;
                }
            }
        }
        System.out.println(b);


        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int c = 0;

        char k = 'ա';
        char z = 'է';
        char d = 'ը';
        char e = 'ի';
        char f = 'օ';
        for (char y : chars) {
            if (y == k) {
                c = c + 1;
            } else if (y == z) {
                c = c + 1;
            } else if (y == d) {
                c = c + 1;
            } else if (y == e) {
                c = c + 1;
            } else if (y == f) {
                c = c + 1;
            }
        }
        System.out.println(c);


    }

}


