package misc;

public class day_1_26 {

    public static void main(String[] args) {

        System.out.println();

    }

    public static void printGrade(double score) {
        if (score >= 90)
            System.out.println("A");
        else if (score >= 80)
            System.out.println('B');
        else if (score >= 70)
            System.out.println('C');
        else if (score >= 60)
            System.out.println('D');
        else
            System.out.println('F');
    }

    public static char returnGrade(double score){

        if(score >= 90)
            return 'A';
        if(score >= 80)
            return 'B';
        if(score >= 70)
            return 'C';
        if(score >= 60)
            return 'D';
        return 'F';
    }

    public static int max(int num1, int num2) throws Exception {
        if(num1 == num2)
            throw new Exception("Numbers are equal");
        if(num1 > num2)
            return num1;
        return num2;
    }

    public static int max(int num1, int num2, int num3) throws Exception {
        if(num1 > num2 && num1 > num3)
            return num1;
        if(num2 > num1 && num2 > num3)
            return num2;
        if(num3 > num1 && num3 > num2)
            return num3;

        throw new Exception("All numbers are equal");
    }


}
