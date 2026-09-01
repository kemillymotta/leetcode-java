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
                if (anagram.containsKey(c)) {
                    int current = anagram.get(c);
                    anagram.put(c, current + 1);
                } else {
                    anagram.put(c, 1);
                }
            }

            for (char c : t.toCharArray()) {
                if (!anagram.containsKey(c)) {
                    result = false;
                    break;
                }

                int current = anagram.get(c);

                if (current == 0) {
                    result = false;
                    break;
                }

                anagram.put(c, current - 1);
            }
        }

        System.out.println(result);
    }
}