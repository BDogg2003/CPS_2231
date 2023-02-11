package misc;

import java.util.Arrays;
import java.util.Scanner;

public class day_1_31 {

    public static void main(String[] args) {

        int[] int1 = new int[3];
        char[] char1 = new char[4];
        double[] doub1 = new double[3];
        String[] $str1 = new String[4];

        System.out.println(int1[0]);
        System.out.println(char1[0]);
        System.out.println(doub1[0]);
        System.out.println($str1[0]);


        int[] values = new int[5];
        for(int i = 0; i < values.length; i++) {
            values[i] = i + 3;
        }

        System.out.println(Arrays.toString(values));


        Scanner in = new Scanner(System.in);
        for(int i = 0; i < $str1.length; i++) {
            System.out.println("Please enter a word");
            $str1[i] = in.next();
        }

        int sum = 0;
        for(int i = 0; i < doub1.length; i++) {
            doub1[i] = Math.random() * 100;
            sum += doub1[i];
        }

        System.out.println(Arrays.toString($str1));
        System.out.println(Arrays.toString(doub1));

        lab();

        in.close();
    }

    public static void lab() {

        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter a whole number");
            arr[i] = in.nextInt();
        }
        for(int num : arr){
            System.out.println(num % 2 == 0 ? "Number is even" : "Number is odd");
        }
        in.close();
    }
}
