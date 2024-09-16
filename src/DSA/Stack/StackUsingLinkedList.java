package DSA.Stack;

public class StackUsingLinkedList {

    public static class Stack{

        public static class Node{
            int data;
            Node next;

            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        Node head = null;

        public void push(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void display(){
            Node currentNode = head;
            while(currentNode != null){
                System.out.print(currentNode.data + "-->");
                currentNode = currentNode.next;
            }
            System.out.print("null");
            System.out.println();
        }

        public int pop(){
            int poppedElement = head.data;
            head = head.next;
            return poppedElement;
        }

        public int peek(){
            return head.data;
        }

        public int size(){
            Node currentNode = head;
            int size=0;
            while(currentNode!=null){
                currentNode = currentNode.next;
                size++;
            }
            return size;
        }

    }

    public static void main(String[] args) {
        Stack newStack = new Stack();
        newStack.push(23);
        newStack.push(2);
        newStack.push(35);
        newStack.push(8);
        newStack.push(99);
        System.out.println(newStack.size());
        newStack.display();
        System.out.println(newStack.pop());
        newStack.display();
        System.out.println(newStack.peek());
        newStack.display();
        System.out.println(newStack.size());
    }
}
