package LAB4_P;

public class Zad_4 {
    public static void main(String[] args) {

        int[][] mother_country = new int[15][15];
        double[] mother_average = new double[15];
        double average = 0;


        for (int i = 0; i < mother_country.length; i++) {
            for (int j = 0; j < mother_country[i].length; j++) {
                if (i==0) mother_country[i][j] = j;
                else if (j==0) mother_country[i][j] = i;
                else mother_country[i][j] = i * j;
            }
        }

        for(int i = 0; i < mother_country.length; i++){
            for(int j = 0; j < mother_country.length; j++)
            {
                if (i==0 && j==0) System.out.print("X\t");
                else System.out.print(mother_country[j][i] + "\t");
            }
            System.out.println();
        }

        for(int i = 0; i < mother_country.length; i++) {
            average = 0;

            for (int j = 0; j < mother_country.length; j++) {

                average = average + mother_country[j][i];
            }
            mother_average[i] =  average / mother_average.length;
        }

        System.out.println();
        for(int i = 0; i < mother_average.length; i++) System.out.println("Average of column: " + i + " " + "is: " + mother_average[i]);
        System.out.println();
        for(int i = 0; i < mother_average.length; i++) System.out.print(mother_average[i] + "\t");
        System.out.println();
    }
}
