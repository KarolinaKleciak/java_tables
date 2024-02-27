package LAB4_P;

import java.util.Random;

public class Zad_7 {
    public static void main(String[] args) {

        int[][] table = new int[12][12];
        Random rand = new Random();
        int lower_bound = 0;
        int upperbound = 20;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {

                if( i == j )table[i][j] = i;
                else if( i == 0) table[i][j] = j;
                else if( j == 0) table[i][j] = i;
                else table[i][j] =(int)(rand.nextInt(upperbound - lower_bound) + lower_bound);

                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
