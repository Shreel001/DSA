package DSA.Stack;

import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> dictionary = new HashMap<>();
        dictionary.put('(', ')');
        dictionary.put('[', ']');
        dictionary.put('{', '}');

        for(int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            if(dictionary.containsKey(currentChar)){
                stack.push(currentChar);
            } else if (!stack.isEmpty() && dictionary.get(stack.peek()) == currentChar){
                stack.pop();
            } else {
                return false; // Unbalanced parentheses
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(){}()";
        System.out.println(isValid(str));
    }
}
