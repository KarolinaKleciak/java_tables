package LAB4_P;

public class Zad_3 {
    public static void main(String[] args) {

        boolean[] numbers = new boolean[40];

        for(int i = 0; i < numbers.length; i++){
            if( i % 2 == 0) numbers[i] = false;
            else numbers[i] = true;
            System.out.println("The next cell is:  " + numbers[i]);
        }
    }
}
