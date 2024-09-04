package DSA.Stack;

import java.util.Stack;

public class SimpleCalculator {

    public static int Calculator(String string){
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        string = string.replaceAll("\\s", "");

        for(int i = 0; i < string.length(); i++){
            char currentChar = string.charAt(i);

            if(Character.isDigit(currentChar)){
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }

            if(!Character.isDigit(string.charAt(i)) || i == string.length() - 1){
                if(operation == '+'){
                    stack.push(currentNumber);
                }else if(operation == '-'){
                    stack.push(-currentNumber);
                }else if(operation == '*'){
                    stack.push(stack.pop()*currentNumber);
                }else if(operation == '/'){
                    stack.push(stack.pop()/currentNumber);
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }

        int result = 0;
        while(!stack.isEmpty()){
            result += stack.pop();
        }

        return result;
    }


    public static void main(String[] args) {
        String str = "9*5/4-6";
        int result = Calculator(str);
        System.out.println(result);
        System.out.println(9*5/4-6);
    }
}
