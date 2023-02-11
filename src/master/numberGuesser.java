package master;

import java.util.Scanner;

public class numberGuesser {

    public static void main(String[] args) {

        System.out.println("Guess the right number from 0-100!");
        int num = (int)(Math.random() * 101);
        Scanner in = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Enter a whole number, or enter -1 to quit: \n>>");
            guess = in.nextInt();
            if(guess == -1) {
                System.out.println("Quitting");
            } else if(guess < num ) {
                System.out.println("Too Low, try again");
            } else if(guess > num) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Correct! Enter -1 next time to exit");
            }
        } while( guess != -1);
    }
}
