package DSA.Queue;

public class QueueUsingLinkedList {

    public static class Queue{

        public static class Node {
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        Node head;

        public void Enqueue(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            Node currentNode = head;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

        public int Deque(){
            int poppedElement = head.data;
            head = head.next;
            return poppedElement;
        }

        public int peek(){
            return head.data;
        }

        public boolean isEmpty(){
            return head == null;
        }

        public void display(){
            Node currentNode = head;
            while(currentNode!=null){
                System.out.print(currentNode.data + "-->");
                currentNode = currentNode.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.Enqueue(4);
        System.out.println(queue.Deque());
        queue.display();
        System.out.println(queue.peek());
    }
}

// 1-->2-->3-->4-->null