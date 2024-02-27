package LAB4_P;

import java.util.Random;

public class Zad_8 {
    public static void main(String[] args) {

        int[][] table = new int[12][12];
        int[][] table_2 = new int[12][12];
        int[][] table_result = new int[12][12];
        Random rand = new Random();
        int lower_bound = 0;
        int upperbound = 20;
        int lower_bound2 = 0;
        int upperbound2 = 20;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {

                if (i == j) table[i][j] = i;
                else if (i == 0) table[i][j] = j;
                else if (j == 0) table[i][j] = i;
                else table[i][j] = (int) (rand.nextInt(upperbound - lower_bound) + lower_bound);

                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < table_2.length; i++) {
            for (int j = 0; j < table_2.length; j++) {
                table_2[i][j] = (int) (rand.nextInt(upperbound2 - lower_bound2) + lower_bound2);
                System.out.print(table_2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table_result[i][j] = table[i][j] + table_2[i][j];
                System.out.print(table_result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


