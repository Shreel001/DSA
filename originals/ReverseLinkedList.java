package originals;

/*

Given the head of a singly linked list, reverse the list, and return the reversed list.

10 --> 20 --> 30 --> 40 --> null
40 --> 30 --> 20 --> 10 --> null

*/

public class ReverseLinkedList {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void add(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;

    }

//  10 --> 20 --> 30 --> 40 --> null
//  40 --> 30 --> 20 --> 10 --> null
    Node reverse(){

        Node prev = null;
        Node current = head;

        while(current != null){
            Node next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }
        display(prev);
        return prev;
    }

    public void display(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.add(10);
        reverseLinkedList.add(20);
        reverseLinkedList.add(30);
        reverseLinkedList.add(40);
        reverseLinkedList.reverse();
    }

}
