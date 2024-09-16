package DSA.Stack;

import java.util.Stack;

public class ReversePolishNotation {

    public static int Output(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        int temp;

        for (String i : tokens) {
            switch (i) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    temp = stack.pop();
                    stack.push(stack.pop() - temp);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    temp = stack.pop();
                    stack.push(stack.pop() / temp);
                    break;
                default:
                    stack.push(Integer.valueOf(i));
            }
        }
        return stack.peek();
    }


    public static void main(String[] args) {
        String[] tokens = new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(Output(tokens));
    }
}