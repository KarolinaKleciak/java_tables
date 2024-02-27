package LAB4_P;

import java.util.Random;

public class Zad_9 {
    static int counter = 0;
    public static void main(String[] args) {

        int[] rand_numbers = new int[30];

        System.out.println("\nFirst Table is: ");

        randomTable(rand_numbers);
        printTable(rand_numbers);

        System.out.println("Quick sorting...");
        quickSort(rand_numbers, 0, rand_numbers.length-1);
        printTable(rand_numbers);

        counter = 0;

        System.out.println("\nSecond table is:");
        randomTable(rand_numbers);
        printTable(rand_numbers);

        System.out.println("Bubble sorting...");
        bubbleSort(rand_numbers);
        printTable(rand_numbers);

    }

    public static void quickSort(int table[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(table, begin, end);

            if (counter < 2)
            {
                counter ++;
                System.out.println("Table after " + counter + " iteration:");
                printTable(table);
            }

            quickSort(table, begin, partitionIndex-1);
            quickSort(table, partitionIndex+1, end);
        }
    }

    private static int partition(int table[], int begin, int end) {
        int pivot = table[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (table[j] <= pivot) {
                i++;

                int tmp = table[i];
                table[i] = table[j];
                table[j] = tmp;
            }
        }

        int tmp = table[i+1];
        table[i+1] = table[end];
        table[end] = tmp;

        return i+1;
    }

    private static void bubbleSort(int[] table) {
        int tmp;
        for (int i = 0; i < table.length - 1; i++) {
            for (int j = 0; j < table.length - i - 1; j++) {
                if (table[j] > table[j + 1]) {
                    tmp = table[j];
                    table[j] = table[j + 1];
                    table[j + 1] = tmp;
                    if (counter < 2)
                    {
                        counter ++;
                        System.out.println("Table after " + counter + " iteration:");
                        printTable(table);
                    }
                }
            }
        }
    }

    private static void printTable(int[] table)
    {
        for(int i=0; i<table.length; i++)System.out.print(table[i] + "\t"); System.out.println();
    }

    private static void randomTable(int[] rand_numbers) {

        int upperbound = 150;
        int lower_bound = 99;

        Random rand = new Random();
        for (int i = 0; i < rand_numbers.length; i++)
            rand_numbers[i] = (int) (rand.nextInt(upperbound - lower_bound) + lower_bound);
    }
}

