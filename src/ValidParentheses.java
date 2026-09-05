import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public static void main(String[] args) {

        Deque<Character> stack = new ArrayDeque<>();

        String s = "()[]{}";
        boolean result = true;

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);

            } else if (stack.isEmpty()) {
                result = false;
                break;

            } else if ((c == ')' && stack.peek() != '(')
                    || (c == '}' && stack.peek() != '{')
                    || (c == ']' && stack.peek() != '[')) {

                result = false;
                break;

            } else {
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            result = false;
        }

        System.out.println(result);
    }
}