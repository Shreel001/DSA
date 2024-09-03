package DSA.Stack;

public class Stacks {
    private int maxSize;
    private int top;
    public int[] stackArray;
    public static int minElement;
    public static int prevMinElement;

    public Stacks(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Method to push element to the top of stack
    public void push(int value){
        if(isFull()){
            System.out.println("Stack size exceeded");
        }
        if(minElement > value || top == -1){
            prevMinElement = minElement;
            minElement = value;
        }
        stackArray[++top] = value;
        System.out.println(value + " added to the stack");
    }

    // Method to pop top element
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty!");
        }
        int poppedElement = stackArray[top];
        if(poppedElement == minElement){
            minElement = prevMinElement;
        }
        top--;
        System.out.println("Popped Element: " + poppedElement);
        return poppedElement;
    }

    // Method to get value of top element
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty!");
        }
        int peekedElement = stackArray[top];
        System.out.println("Peeked Element: " + peekedElement);
        return peekedElement;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize);
    }

    public int getMin() {
        System.out.println("Min element : "+ minElement);
        return minElement;
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks(5);
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        stack.getMin(); // return -3
        stack.pop();
        stack.peek();    // return 0
        stack.getMin(); // return -2
        String str = "3+5 /2";
        str = str.replaceAll("\\s","");
        int number = Integer.parseInt(str);
        System.out.println(number);
        System.out.println(number);
    }
}
