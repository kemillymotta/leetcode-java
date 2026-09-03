public class ConstructUniformParityArrayII {

    public static void main(String[] args) {
        int[] nums1 = {4,6};

        int menor = nums1[0];
        boolean hasOdd = false;

        for (int i = 0; i < nums1.length; i++) {
            menor = Math.min(menor, nums1[i]);

            if (nums1[i] % 2 != 0) {
                hasOdd = true;
            }
        }

        boolean result = true;

        if(menor % 2 == 0 && hasOdd) {
            result = false;
        }

        System.out.println(result);

    }
}
