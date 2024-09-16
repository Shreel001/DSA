package DSA.Stack;

public class StackUsingArray {

    public static class Stack {
        int[] arr = new int[5];
        int idx = 0;

        public void push(int data) {
            if (idx == arr.length) {
                System.out.println("Stack is full!");
                return;
            }
            arr[idx] = data;
            idx++;
        }

        public int peek() {
            if (idx == 0) {
                throw new RuntimeException("Stack is empty!");
            }
            return arr[idx - 1];
        }

        public int pop() {
            if (idx == 0) {
                throw new RuntimeException("Stack is empty!");
            }
            int poppedElement = arr[idx - 1];
            idx--;
            return poppedElement;
        }

        public void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public boolean isEmpty(){
            boolean flag;
            if (idx == 0) flag = true;
            else flag = false;
            return flag;
        }

        public boolean isFull(){
            boolean flag = false;
            if(idx==arr.length){
                flag = true;
            }
            return flag;
        }
    }

    public static void main(String[] args) {
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        System.out.println("Popped: " + newStack.pop());
        System.out.println("Top element: " + newStack.peek());
        newStack.display();
    }
}