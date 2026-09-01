package practice;

import java.util.*;
public class ReverseStringII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A word: ");
        String word = sc.nextLine();

        char[] s = word.toCharArray();

        reverseString(s);

        System.out.println(s);

        sc.close();
    }

    public static void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }


    }
}
