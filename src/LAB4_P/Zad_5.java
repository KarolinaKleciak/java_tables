package LAB4_P;

import java.util.Random;

public class Zad_5 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] table_number = new int[40];

        fill_table(table_number, 0, 10, 1, 5);
        fill_table(table_number, 10, 20, 6, 10);
        fill_table(table_number, 20, 30, 11, 55);
        fill_table(table_number, 30, 40, 60, 75);
        print_table(table_number);
    }
    static void fill_table(int[] table, int start_index, int end_index, int lower_bound, int upperbound) {
        Random rand = new Random();
        for (int i = start_index; i < end_index; i++)
            table[i] = (int) (rand.nextInt(upperbound - lower_bound) + lower_bound);
    }
    static void print_table(int[] table) {
        for (int i = 0; i < table.length; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print(table[i] + "\t");
        }
    }
}
