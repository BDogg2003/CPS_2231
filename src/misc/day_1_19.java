package misc;

import java.util.Scanner;

public class day_1_19 {

    public static void main(String[] args) {

        radiusStuff();
        System.out.println("\n");
        stringEx();
        System.out.println("\n");
        scanMethods();
        System.out.println("\n");
    }

    private static void radiusStuff() {
        double radius = 15;
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("%.2f", perimeter);
    }

    public static void stringEx() {
        String message = "Welcome to Java";
        System.out.println("The 1st character of the message is " + message.charAt(0));
        System.out.println("The length of the message is " + message.length());

        System.out.println(message.substring(0,7));

        System.out.println(message.concat(" Course"));
        String $s3 = "Mean";
        $s3 = $s3.replace("M", "K");
        System.out.println($s3);

        char ch = 97;
        System.out.println(++ch);

        System.out.println('2' + '3');
    }

    public static void scanMethods() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a double value: \n>>");
        try {
            System.out.println(in.nextDouble());
        } catch (Exception e) {
            System.err.println("You did not enter a valid data type");
        }
    }
}
