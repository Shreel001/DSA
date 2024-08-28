package DSA;

public class OddEven {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        // Handle edge case where the linked list has no nodes
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the tail of the list to add node at tail
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printListNode(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public Node OddEven(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node currentNode = head;
        Node nextNode = head.next;
        Node evenHead = nextNode;

        while(nextNode != null && nextNode.next != null ){
            currentNode.next = nextNode.next;
            currentNode = currentNode.next;

            nextNode.next = currentNode.next;
            nextNode = nextNode.next;
        }
        currentNode.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        OddEven list = new OddEven();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.OddEven(list.head);
        list.printListNode(list.head);
    }
}
