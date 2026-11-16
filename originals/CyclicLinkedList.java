package originals;

/*

Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

*/

import java.util.HashMap;

public class CyclicLinkedList {

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

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    void makeCyclic() {
        if (head == null) return;

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = head;
    }

    boolean ifCyclic(){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        CyclicLinkedList cyclicLinkedList = new CyclicLinkedList();
        cyclicLinkedList.add(10);
        cyclicLinkedList.add(20);
        cyclicLinkedList.add(30);
        cyclicLinkedList.add(40);
        boolean cycle = cyclicLinkedList.ifCyclic();
        System.out.println(cycle);
        
    }
    
}
