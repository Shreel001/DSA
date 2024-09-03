package DSA.Stack;

import java.util.Stack;

public class Calculator {

    public static int Calculator(String str){
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        str = str.replaceAll("\\s", "");

        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);

            if(Character.isDigit(currentChar)){
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }

            if(!Character.isDigit(currentChar) || i == str.length() - 1){
                if(operation == '+'){
                    stack.push(currentNumber);
                }else if (operation == '-') {
                    stack.push(-currentNumber);
                }else if (operation == '*') {
                    stack.push(stack.pop() * currentNumber);
                }else if (operation == '/') {
                    stack.push(stack.pop()/currentNumber);
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }

        int result = 0;
        while(!stack.empty()){
            result+=stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "-5/5*9-6";
        int result = Calculator(str);
        System.out.println(result);
    }

}