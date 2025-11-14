import java.util.Stack;

public class ValidParentheses {
    /**
     * Determines whether a given string containing only the characters
     * '(', ')', '{', '}', '[' and ']' is valid.
     * <p>
     * A string is considered valid if:
     * <ul>
     *   <li>Open brackets are closed by the same type of brackets.</li>
     *   <li>Open brackets are closed in the correct order.</li>
     *   <li>Every closing bracket has a corresponding opening bracket of the same type.</li>
     * </ul>
     * <p>
     * Examples:
     *
     * <p>Example 1:</p>
     * Input:  s = "()"<br>
     * Output: true
     *
     * <p>Example 2:</p>
     * Input:  s = "()[]{}"<br>
     * Output: true
     *
     * <p>Example 3:</p>
     * Input:  s = "(]"<br>
     * Output: false
     *
     * <p>Example 4:</p>
     * Input:  s = "([])"<br>
     * Output: true
     *
     * <p>Example 5:</p>
     * Input:  s = "([)]"<br>
     * Output: false
     */

    public static boolean isValid(String value) {

        Stack<Character> stack = new Stack<>();

        for (char v : value.toCharArray()) {

            if (v == '(' || v == '{' || v == '[') {

                stack.push(v);

            } else {
                if (stack.isEmpty()) return false;

                char pop = stack.pop();

                if (v == ')' && pop != '(') return false;
                if (v == '}' && pop != '{') return false;
                if (v == ']' && pop != '[') return false;
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));         // true
        System.out.println(isValid("()[]{}"));     // true
        System.out.println(isValid("(]"));         // false
        System.out.println(isValid("([)]"));       // false
        System.out.println(isValid("{[]}"));       // true
    }

}
