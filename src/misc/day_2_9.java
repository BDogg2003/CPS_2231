package misc;

import java.util.Arrays;
import java.util.Scanner;

public class day_2_9 {

    public static void main(String[] args) {

        int[][] arr1 = new int[3][3];

        Scanner in = new Scanner(System.in);
        System.out.printf("The following matrix has %d rows and %d columns. Please enter %d numbers: %n", arr1.length, arr1[0].length, arr1.length * arr1[0].length);
        StringBuilder arrOut = new StringBuilder();
        var sum = 0;
        var sumr = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(">> ");
                arr1[i][j] = in.nextInt();
                sum += arr1[i][j];
                sumr += arr1[i][j];

            }
            arrOut.append(Arrays.toString(arr1[i])).append("\n");
            System.out.printf("Sum of the row: %s", sumr);
            sumr = 0;
        }

        System.out.println(arrOut);
        System.out.printf("sum: %s", sum);


    }

}
