package originals;

/* 

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying 
the values in the list's nodes (i.e., only nodes themselves may be changed.)

 */

public class swapNodes {

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

    public void display(Node node){
        Node current = node;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    Node swap(){
        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        while(prev.next!=null && prev.next.next!=null){

            Node curr = prev.next;
            Node nxt = curr.next;

            curr.next = nxt.next;
            nxt.next = curr;
            prev.next = nxt;

            prev = curr;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        swapNodes list = new swapNodes();
        list.add(10);
        list.add(20);
        Node head = list.swap();
        list.display(head);
    }
    
}


