package misc;

import java.util.Scanner;

public class day_2_2 {

    public static void main(String[] args) {

        int[] arr = {5, 32, 10, 91, 25};
        int max = arr[0];


        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max: " + max);
        int s = findMin();

        int[] x = arr.clone();

    }

    public static int findMin() {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter %d whole numbers: %n", arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(">> ");
            arr[i] = in.nextInt();
            System.out.println();
        }

        int min = arr[0];

        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        in.close();
        System.out.println(min);
        return min;
    }


}
