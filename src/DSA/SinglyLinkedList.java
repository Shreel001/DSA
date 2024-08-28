package DSA;

public class SinglyLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;

    public void add(int data){
        Node newNode = new Node(data);
        Node lastNode = null;

        // Handle edge case where the linkedList has no nodes
        if(head==null){
            head = newNode;
            return;
        }
        lastNode = head;

        // Traverse to the tail of the list to add node at tail
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void reverse(Node head){
        Node nextNode = null;
        Node prevNode = null;
        Node currentNode = head;

        while(currentNode != null ){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        this.head = prevNode;
    }

    public Node middle(Node head){
        Node slowPointer = head;
        Node fastPointer = head;

        while(fastPointer!=null && fastPointer.next != null && fastPointer.next.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        Node midNode = slowPointer;
        return midNode;
    }

    public Node mergeSort(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = middle(head);
        Node midNext = mid.next;

        mid.next = null;

        Node left = mergeSort(mid);
        Node right = mergeSort(midNext);

        return merge(left,right);
    }

    public Node merge(Node left, Node right){
        Node dummy = new Node(0);
        Node current = dummy;

        while (left.next!=null && right.next!=null){
            if(left.data <= right.data){
                current.next = left;
                left = left.next;
            }else{
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        return dummy.next;
    }

    public int length(Node head) {
        Node currentNode = head;
        int counter = 1;

        while (currentNode != null && currentNode.next != null) {
            currentNode = currentNode.next;
            counter++;
        }
        return counter;
    }

    public void printList(Node head){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(6);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
//        list.add(5);
        list.reverse(list.head);
        System.out.println();
        list.printList(list.head);
        System.out.println();
        System.out.println(list.length(list.head)%2);
    }
}
