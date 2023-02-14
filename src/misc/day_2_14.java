package misc;

public class day_2_14 {

    public static void main(String[] args) {

        int[][] matrix = new int[3][4];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%2s ",anInt);
            }
            System.out.println();
        }

    }

}
