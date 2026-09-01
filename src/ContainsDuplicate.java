import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        Set<Integer> duplicate = new HashSet<>();

        boolean result = false;

        for (int num : nums) {

            if (duplicate.contains(num)) {
                result = true;
                break;
            }

            duplicate.add(num);
        }

        System.out.println(result);
    }
}