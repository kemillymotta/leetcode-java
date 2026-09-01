import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] numbers = {1,0,1,2};

        Arrays.sort(numbers);

        int sequence = 1;
        int longestSequence = 1;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == numbers[i-1]) {
                continue;
            }

            if (numbers[i] == numbers[i-1]+1) {
                sequence++;
            } else {
                sequence = 1;
            }

            if (sequence>longestSequence) {
                longestSequence = sequence;
            }
        }

        System.out.println(longestSequence);
    }
}
