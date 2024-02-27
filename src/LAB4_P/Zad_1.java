package LAB4_P;

import java.util.Random;

public class Zad_1 {
    public static void main(String[] args) {

        int[] rand_numbers = new int[30];
        int[] copy_rand_numbers = new int[30];

        randomTable(rand_numbers);
        System.out.println("Table is: ");
        printTable(rand_numbers);

        System.arraycopy(rand_numbers, 0, copy_rand_numbers, 0, rand_numbers.length);
        System.out.println("\nCopied table is: ");
        printTable(copy_rand_numbers);
    }
    private static void printTable(int[]table) {

        for(int i=0; i<table.length; i++) System.out.print(table[i] + "\t");
        System.out.println();
    }
    private static void randomTable(int[] rand_numbers) {

        Random rand = new Random();
        for(int i = 0; i < rand_numbers.length; i++)rand_numbers [i] = rand.nextInt(51) + 99;
    }
}
