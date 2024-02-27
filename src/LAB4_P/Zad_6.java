package LAB4_P;

import java.util.ArrayList;

public class Zad_6 {
    public static void main(String[] args) {

        ArrayList<Character> alphabet = new ArrayList<Character>();

        for(int i = (char)65; i <= (char)90; i++) alphabet.add((char) i);

        System.out.print(alphabet.toString() + "\nThe length of the table is: " + alphabet.size());
    }
}
