public class MonotonicArray {

    public static void main(String[] args) {

        int[] nums = {1,3,2};

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            int right = nums[i + 1];

            if (nums[i] > nums[i + 1]) {
                increasing = false;
            }
            if (nums[i] < nums[i + 1]) {
                decreasing = false;
            }
        }

        boolean monotonic = increasing || decreasing;

        System.out.println(monotonic);

    }
}
