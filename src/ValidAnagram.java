import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        HashMap<Character, Integer> anagram = new HashMap<>();

        boolean result = true;

        if (s.length() != t.length()) {
            result = false;
        } else {

            for (char c : s.toCharArray()) {
                anagram.compute(c, (key, current) -> {
                    if (current == null) {
                        return 1;
                    } else {
                        return current + 1;
                    }
                });
            }

            for (char c : t.toCharArray()) {

                Integer current = anagram.compute(c, (key, value) -> {

                    if (value == null || value == 0) {
                        return null;
                    }

                    return value - 1;
                });

                if (current == null) {
                    result = false;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}