package originals;

/*

You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

*/

import java.util.HashMap;

public class reorderList {

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

        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
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

    // 1-->2-->3-->4-->null
    // 8-->7-->6-->5-->null

    void reorder(){

        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node curr = slow.next;
        slow.next = null;

        Node firstHead = head;
        Node secondHead;

        while(curr!=null){
            secondHead = curr.next;

            curr.next = prev;
            prev = curr;
            curr = secondHead;
        }

        secondHead = prev;

        System.out.println(prev.data);

        Node temp1;
        Node temp2;

        while(firstHead != null && secondHead!=null){
            temp1 = firstHead.next; // 2
            temp2 = secondHead.next; // 7
            firstHead.next = secondHead; //
            secondHead.next = temp1;
            secondHead = temp2;
            firstHead = temp1;
        }

    }

    public static void main(String[] args) {
        reorderList list = new reorderList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.display();
        list.reorder();
        list.display();
    }

}
