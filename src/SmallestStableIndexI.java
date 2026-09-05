public class SmallestStableIndexI {

    public static void main(String[] args) {

        int[] nums = {5, 0, 1, 4};
        int k = 3;

        int maxLeft = nums[0];
        int result = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > maxLeft) {
                maxLeft = nums[i];
            }

            int minRight = nums[nums.length - 1];

            for (int j = i; j < nums.length; j++) {
                if (nums[j] < minRight) {
                    minRight = nums[j];
                }
            }

            int instability = maxLeft - minRight;

            if (instability <= k) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}