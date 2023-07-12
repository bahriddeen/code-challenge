package CCIV;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedString {
    private static final Map<Character, Character> TOKENS = new HashMap<>();

    static {
        TOKENS.put('{', '}');
        TOKENS.put('[', ']');
        TOKENS.put('(', ')');
    }

    public static boolean isOpenTerm(char c) {
        return TOKENS.containsKey(c);
    }

    public static boolean matches(char openTerm, char closeTerm) {
        Character expectedCloseTerm = TOKENS.get(openTerm);
        return expectedCloseTerm != null && expectedCloseTerm == closeTerm;
    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (isOpenTerm(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !matches(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        boolean isInputBalanced = BalancedString.isBalanced(input);
        System.out.println("Input: " + input);
        System.out.println("Is Balanced? " + isInputBalanced);
    }

}
