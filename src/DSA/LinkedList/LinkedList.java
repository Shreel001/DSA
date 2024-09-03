package DSA.LinkedList;

public class LinkedList {

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

    public void insert(int data, int targetData){
        Node currentNode = head;
        Node newNode = new Node(data);
        Node tempNode = null;

        // Handle edge case where the target node is the head
        if(currentNode != null && currentNode.data == targetData){
            newNode.next = currentNode;
            head = newNode;
            return;
        }

        // Traverse the list to find the node with targetData
        while(currentNode != null && currentNode.next != null && currentNode.next.data != targetData){
            tempNode = currentNode.next.next;
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.next = tempNode;
    }

    public void deleteNode(int targetData){
        Node currentNode = head;
        Node preNode = null;

        // Handle edge case where the target node is the head
        if (currentNode != null && currentNode.data == targetData) {
            head = currentNode.next;
            return;
        }

        // Traverse the list to find the node with targetData
        while (currentNode != null && currentNode.data != targetData) {
            preNode = currentNode;
            currentNode = currentNode.next;
        }

        // Check if the target node exists
        if (currentNode != null) {
            preNode.next = currentNode.next;
        }
    }

    public void reverse(Node head){
        Node prevNode = null;
        Node nextNode = null;
        Node currentNode = head;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        this.head = prevNode;
    }

    public Node middle(Node head){
        Node endNode = head;
        Node startNode = head;
        Node midNode = null;

        while(endNode.next != null && endNode!=null && endNode.next.next!=null){
            startNode = startNode.next;
            endNode = endNode.next.next;
        }
        midNode = startNode;
        return midNode;
    }

    public Node mergeSort(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = middle(head);
        Node midNext = mid.next;

        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(midNext);

        return merge(left, right);
    }

    public Node merge(Node left, Node right) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {  // Changed comparison to `<=` for correct order
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        // Append any remaining nodes
        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
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
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Original List:");
        list.printList(list.head);
        System.out.println();
        System.out.println(list.length(list.head));
        System.out.println();
        System.out.println(list.middle(list.head).data);

        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(2);
        list2.add(1);
        System.out.println("Original List:");
        list2.printList(list2.head);
        System.out.println();
        System.out.println(list2.length(list2.head));
        System.out.println();
        System.out.println(list2.middle(list2.head).data);
        }
    }