/*******************************************************************************

 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming*
 * Author: Hayden Brower, CPS*2231

 * HW Assignment: 1
 *************************************************************************/

package master;

import java.util.Scanner;

public class hw_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students: \n>> ");
        int students = in.nextInt();

        String[] names = new String[students];
        String[] ids = new String[students];
        String[] majors = new String[students];

        System.out.println("Enter the data prompted for eat student");

        for(int i = 0; i < students; i++) {
            System.out.println("Student " + i);
            System.out.print("\tFull Name:  ");
            names[i] = in.nextLine();
            System.out.print("\tID Number:  ");
            ids[i] = in.next();
            System.out.print("\tMajor:  ");
            majors[i] = in.nextLine();
            System.out.println();
        }

        int choice;
        int exit = 0;
        String input;
        StringBuilder $names = new StringBuilder();
        while (exit == 0) {

            System.out.println("Options: \n\t1) ID Search\n\t2)Major Enrollment\n\t3)Exit");
            System.out.print("Please enter the number for your desired option: \n>>");
            choice = in.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter an id to search for");
                    input = in.next();
                    for (int i = 0; i < ids.length; i++) {
                        if (ids[i].equals(input)) {
                            System.out.printf("Student data:%n" +
                                              "    Name: %s%n" +
                                              "    id: %s%n" +
                                              "    Major: %s%n", names[i], ids[i], majors[i]);
                            break;
                        }
                    }
                    System.err.println("Error: Student Out Found");
                }
                case 2 -> {
                    System.out.println("Enter a major");
                    input = in.nextLine();
                    for (int i = 0; i < majors.length; i++) {
                        if (majors[i].equals(input))
                            $names.append(names[i]).append(", ");
                    }
                    System.out.println($names.isEmpty() ? "Students with queried major: " + $names : "Error: No Students are Enrolled in this Major");
                }
                case 3 -> {System.out.println("Have a nice day!"); exit = -1;}
                default -> System.err.println("Error: Invalid option provided");
            }
        }
    }
}
