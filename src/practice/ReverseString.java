package practice;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A word: ");
        String word = sc.nextLine();

        String reversed = "";
        for(int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        System.out.println(reversed);

    }
}
