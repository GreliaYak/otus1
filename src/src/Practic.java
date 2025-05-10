public class Practic {
    public static void main(String[] args) {
        //константы
        final int a = 13;
        System.out.println(a);

        // массивы

        int[] a1;
        int a2[];
        a2 = new int[23];

        a2 = new int[22];
        a2[1] = 1;
        a2[0] = 323;
        a2[4] = 123;
        a2[2] = 153;
        a2[8] = 124;
        System.out.println(a2[0]);

        a1 = new int[]{1, 5, 6, 12, 5, 31, 51, 312, 412, 123, 412, 41, 78};
        System.out.println(a1[12]);
        System.out.println(a1[6]);

        int b = a1.length;
        System.out.println(b);

        //if else условные переменные

        int b1 = 10;
        if (b1 > 11) {
            System.out.println("Больше 11");
        } else {
            System.out.println("Не больше 11");
        }


        //тернарный оператор ? :

        int b2 = 10;
        boolean x = b2 < 5;
        String message = x ? "Меньше 5" : "Больше 5";
        System.out.println(message);

        // циклы for

        int[] b3;
        b3 = new int[5];
        b3[1] = 1;
        b3[0] = 323;
        b3[4] = 123;
        b3[2] = 153;
        b3[3] = 124;

        int y = b3.length;

        for (int i = 0; i == y; i++) {
            System.out.println(b3[i]);

        }
    }
}
