package practice;

public class CountEvenNumbers {
    public static void main(String[] args) {

        int[] num = {1, 2, 4, 7, 8};

        int even = 0;

        for(int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even++;
            }
        }

        System.out.println(even);

    }
}
