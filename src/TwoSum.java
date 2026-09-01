import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        // stores each number already visited and its index
        HashMap<Integer, Integer> numbers = new HashMap<>();

        // result of two indexes that form the target
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            // check if the complement was already seen before
            // if it exists in the hashmap, it found the pair
            if (numbers.containsKey(complement)) {
                //gets the index where the complement was found before
                int previous = numbers.get(complement);

                result[0] = previous;
                result[1] = i;

                break;
            }

            // stores the current number and its index so the current nummber
            // cant use itself as the pair (this happens after checking the complement
            numbers.put(nums[i], i);
        }

        System.out.println(Arrays.toString(result));
    }
}