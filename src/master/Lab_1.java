/*******************************************************************************

 * Kean University
 * Fall 2023
 * Course: CPS*2231 - Computer Programming*
 * Author: Hayden Michael Brower, CPS2231, 07

 * Lab Assignment: 1
 *************************************************************************/

package master;

import java.util.Scanner;

public class Lab_1 {

    public static void main(String[] args) {



        String $s1, $s2, $s3, $s4;
        $s1 = "New";
        $s2 = "Jersey";
        $s3 = $s1 + " " + $s2;
        System.out.println($s3);
        $s4 = $s3.replace($s2, "York");
        System.out.println($s4);

        System.out.println(findChar(97));

        Scanner in = new Scanner(System.in);
        int i1, i2, i3, i4;

        System.out.println("Enter 4 integer values: ");
        System.out.print(">> ");
        System.out.println();
        i1 = in.nextInt();
        System.out.print(">> ");
        System.out.println();
        i2 = in.nextInt();
        System.out.print(">> ");
        System.out.println();
        i3 = in.nextInt();
        System.out.print(">> ");
        System.out.println();
        i4 = in.nextInt();

        System.out.println(findMinimum(i1, i2, i3));
        System.out.println(findMinimum(i1, i2, i3, i4));
        in.close();


    }

    public static char findChar(int index) {
        return (char) index;
    }

    public static int findMinimum(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    public static int findMinimum(int num1, int num2, int num3, int num4) {
        return Math.min(Math.min(num1, num2), Math.min(num3, num4));
    }


}
