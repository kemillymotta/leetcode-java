import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] numbers = {100,4,200,1,3,2};

        if (numbers.length == 0) {
            System.out.println(0);
            return;
        }

        Arrays.sort(numbers);

        int streak = 1;
        int longestStreak = 1;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == numbers[i-1]) {
                continue;
            }

            if (numbers[i] == numbers[i-1]+1) {
                streak++;
            } else {
                streak = 1;
            }

            if (streak >longestStreak) {
                longestStreak = streak;
            }
        }

        System.out.println(longestStreak);
    }
}
