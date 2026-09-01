package practice;

import java.util.*;
public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word[] = new String[1];
        char letter[] = new char[1];

        System.out.print("A word: ");
        word[0] = sc.nextLine();

        System.out.print("A letter: ");
        letter[0] = sc.next().charAt(0);

        int count = 0;

        for(int i = 0; i < word[0].length(); i++) {
            if (word[0].charAt(i) == letter[0]) {
                count++;
            }
        }

        System.out.printf("%d %c", count, letter[0]);

    }

}
