package misc;

import java.util.Arrays;

public class day_2_7 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }

        System.out.println("Pre-Shuffle");
        System.out.println(Arrays.toString(arr));

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

        System.out.println("Post-Shuffle");
        System.out.println(Arrays.toString(arr));
    }


    public static int[] add(int[] nums) {

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + 3;
        }
        return result;
    }

    public static String[] $sort(String[] names) {
        Arrays.sort(names);
        return names;
    }
}
