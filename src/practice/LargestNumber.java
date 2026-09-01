package practice;

public class LargestNumber {

    public static void main(String[] args) {

        int[] num = {4, 8, 2, 15, 7};

        int maiorNum = num[0];

        for(int i = 1; i < num.length; i++) {
            if(num[i] > maiorNum) {
                maiorNum = num[i];
            }
        }

        System.out.println(maiorNum);

    }

}
