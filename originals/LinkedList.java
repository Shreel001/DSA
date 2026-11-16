package originals;

public class LinkedList {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public int length(){

        Node current = head;
        int length = 0;
        while(current != null){
            current = current.next;
            length++;
        }

        return length;
    }

    public void addAtBeginning(int data){

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

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

    public void addAtIndex(int data, int index){

        if(index < 0 || index > length()){
            System.out.println("Index out of bound");
            return;
        }

        Node newNode = new Node(data);

        if(index ==0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        Node subsequentNode;

        while(index != 1){
            current = current.next;
            index--;
        }
        subsequentNode = current.next;
        current.next = newNode;
        newNode.next = subsequentNode;
    }

    public void delete(int data){
        if(head == null){
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }
        Node current = head;

        while(current.next != null && current.next.data != data ){
            current = current.next;
        }

        if (current.next != null){
            current.next = current.next.next;
        }

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

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addAtBeginning(5);

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.display();
        linkedList.delete(50);
        linkedList.display();
        linkedList.addAtIndex(50,0);
        linkedList.display();
    }
}
