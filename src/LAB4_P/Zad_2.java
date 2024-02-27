package LAB4_P;

import java.util.Random;

public class Zad_2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[][] rand_numbers = new int[7][7];
        int[][] copy_rand_numbers = new int[7][7];
        int[][] min_max_table = new int[2][7];

        int minimum_number, maximum_number, minimum_value, maximum_value;
        double average = 0;

        System.out.println("Tab:");


        for (int i = 0; i < rand_numbers.length; i++) {
            for (int j = 0; j < rand_numbers[i].length; j++) {
                rand_numbers[i][j] = rand.nextInt(90) + 10;
                System.out.print(rand_numbers[i][j] + "\t");
            }
            System.out.println();
        }

        minimum_value = rand_numbers[0][0];
        maximum_value = rand_numbers[0][0];

        for (int i = 0; i < rand_numbers.length; i++) {

            minimum_number = rand_numbers[0][0];
            maximum_number = rand_numbers[0][0];
            for (int j = 0; j < rand_numbers[i].length; j++) {

                if (rand_numbers[j][i] < minimum_number) minimum_number = rand_numbers[j][i];
                if (rand_numbers[j][i] > maximum_number) maximum_number = rand_numbers[j][i];
                if (rand_numbers[i][j] < minimum_value) minimum_value = rand_numbers[i][j];
                if (rand_numbers[i][j] > maximum_value) maximum_value = rand_numbers[i][j];

                average = average + rand_numbers[i][j];
            }
            min_max_table[0][i] = minimum_number;
            min_max_table[1][i] = maximum_number;
        }
        System.out.println();
        for (int i = 0; i < min_max_table.length; i++) {
            if (i == 0) System.out.print("Mins: ");
            else System.out.print("Maxs: ");

            for (int j = 0; j < min_max_table[i].length; j++)
                System.out.print("[" + j + "]" + min_max_table[i][j] + " ");
            System.out.println();
        }


        double counter_lower = 0;
        double counter_bigger = 0;
        for (int i = 0; i < rand_numbers.length; i++) {
            for (int j = 0; j < rand_numbers[i].length; j++) {

                if (rand_numbers[i][j] > average) counter_bigger++;
                if (rand_numbers[i][j] < average) counter_lower++;
            }
        }
        System.out.println("\nGlobal maximum is: " + maximum_value + "\nGlobal minimum is: " + minimum_value + "\nAverage of the table is: " + average + "\nElements smaller than average is: " + counter_lower + "\nElements bigger than average is: " + counter_bigger + "\n");

        System.arraycopy(rand_numbers, 0, copy_rand_numbers, 0, rand_numbers.length);
        for (int i = rand_numbers.length - 1; i >= 0; i--) {
            for (int j = rand_numbers.length - 1; j >= 0; j--) {
                System.out.print(copy_rand_numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
