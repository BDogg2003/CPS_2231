package master;

import java.util.ArrayList;
import java.util.Scanner;

public class safetyDepositBox {

    private ArrayList<String> box;

    public safetyDepositBox(ArrayList<String> box) {
        this.box = box;
    }

    public ArrayList<String> getBox() {
        return box;
    }

    public void setBox(ArrayList<String> box) {
        this.box = box;
    }

    public ArrayList<String> addItem(String newString) {

        if(this.box.size() == 10) {
            System.err.println("Error: Box is full. Please remove one or more items to insert a new one.");
            return this.box;
        }

        this.box.add(newString);
        return this.box;
    }

    public ArrayList<String> removeItem() {

        Scanner in = new Scanner(System.in);

        int width = 0;
        for(String item : this.box) {
            if(item.length() > width)
                width = item.length();
        }

        for(int i = 0; i < this.box.size(); i++) {
            System.out.printf("%d) %s%n", i, this.box.get(i));
        }

        System.out.println("Please enter the number item you wish to remove");
        int item = in.nextInt();

        this.box.remove(item);

        in.close();
        return this.box;
    }

    public void displayBox(){
        this.box.forEach(System.out::println);
    }
}
