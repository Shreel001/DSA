package DSA.Stack;

import java.util.Objects;
import java.util.Stack;

public class ValidParentheses {
    Stack<Character> s1 = new Stack<>();
    Stack<Character> s2 = new Stack<>();
    Stack<Character> s3 = new Stack<>();
    char top;

    public void copy(){
        while(!s1.empty()){
            top = s1.pop();
            s1.push(top);
            s3.push(top);
        }
    }

    public static void main(String[] args) {

    }
}
