import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};

        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {

            // if num-1 doesnt exist num is the beginning of a sequence
            if (!numSet.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                // keeps cheking if the next consecutive number exists
                while (numSet.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak +=1;
                }

                // keeps the largest sequence found so far
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        System.out.println(longestStreak);
    }
}
