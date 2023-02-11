package misc;

import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args) {

        String $1 = """
int rate = 45;
int frequency = 2;
                               
for (int i = 7; i >= 1; i--) {
    rate -= 2;
    frequency = (rate*2)+1;
}
""";

        String $2 = """
int pay = 50;
double days = 0;
int hours = 5;
int totalHours = 0;
int totalPay = 0;

do {
    totalHours += hours;
    totalPay += pay * hours;
    days += 1.5;
} while(days < 6);
""";

        int rate = 45;
        int frequency = 2;
        int i = 0;
        int j = 1;
        System.out.println($1);
        System.out.printf("Iteration/Step | Value of i | i >= 1 | rate -= 2 | frequency = (rate*2) + 1 | i-- %n");
        for (i = 7; i >= 1; i--) {
            rate -= 2;
            frequency = (rate*2)+1;

            System.out.printf("%14s | %10s | %6s | %9s | %24s | %3s %n", j, i, true, rate, frequency, i - 1);
            j++;
        }
        System.out.printf("%14s | %10s | %6s | %9s | %24s | %3s %n", j, i, i >= 1, "-", "-", "-");


        int pay = 50;
        double days = 0;
        int hours = 5;
        int totalHours = 0;
        int totalPay = 0;
        j = 1;

        System.out.println("-------------------------");
        System.out.println($2);
        System.out.printf("Iteration/Step | totalHours += hours | totalPay += pay * hours | days += 1.5 | days < 6 %n");

        do {
            totalHours += hours;
            totalPay += pay * hours;
            days += 1.5;

            System.out.printf("%14s | %19s | %23s | %11s | %8s %n", j, totalHours, totalPay, days, days < 6);
            j++;
        } while(days < 6);










    }


}
