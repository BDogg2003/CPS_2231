package misc;

import java.util.Scanner;

public class day_1_24 {

    public static void main(String[] args) {

//       int score = 100 + (int)(Math.random() * 101);
//       System.out.println(score);

        for(int i = 0; i < 100; i ++)
            System.out.println(rand(100, 201));

        int score = rand(0, 101);
        char letter;
        if(score >= 90)
            letter = 'A';
        else if(score >= 80)
            letter = 'B';
        else if(score >= 70)
            letter = 'C';
        else if(score >= 60)
            letter = 'D';
        else
            letter = 'F';


        System.out.printf("Your %s is a(n) %s %n", score, letter);

        int dayN = rand(1, 8);
        String day$;
        switch (dayN) {
            case 1 -> day$ = "Sunday";
            case 2 -> day$ = "Monday";
            case 3 -> day$ = "Tuesday";
            case 4 -> day$ = "Wednesday";
            case 5 -> day$ = "Thursday";
            case 6 -> day$ = "Friday";
            case 7 -> day$ = "Saturday";
            default -> day$ = "Not applicable";
        }
        System.out.println("Day is " + day$ + " (" + dayN + ")");


//        Scanner in = new Scanner(System.in);
//        int num = 1;
//        while (num != 0) {
//            try {
//                System.out.print("Please enter an integer: \n>>");
//                num = in.nextInt();
//
//                if(num == 0){
//                    System.out.println("Stopping execution");
//                }
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//                System.err.println("Please enter a whole number");
//            }
//        }
//        System.out.println("You guessed the right number");

        int count = 0;
        do {
            System.out.println("welcome to java");
            count++;
        } while(count < 3);

        for(int i = 0; i < 3; i++)
            System.out.println("Welcome to Java");


        for(int i = 0; i < 4; i++) {
            System.out.print("da");
            for(int j = 0; j < 3; j++) {
                System.out.print("na");
            }
            System.out.println();
        }
        System.out.println("Batman!");
    }

    public static int rand(int lower_inclusive, int upper_exclusive) {
        return lower_inclusive + (int)(Math.random() * (upper_exclusive - lower_inclusive - 1));
    }
}
