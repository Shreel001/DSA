package DSA.LinkedList;

public class Palindrome {

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void add(int data){
        Node newNode = new Node(data);
        Node lastNode = null;

        if(head==null){
            head = newNode;
            return;
        }
        lastNode = head;

        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList(Node head){
        Node currentNode = head;

        while(currentNode != null){
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
    }

    public Node middle(Node head){
        if(head==null){
            return head;
        }

        Node fast=head;
        Node slow=head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node reverse(Node head){
        if(head==null){
            return head;
        }

        Node currentNode = head;
        Node prevNode = null;
        Node nextNode = null;

        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        this.head = prevNode;
        return prevNode;
    }

    public boolean isPalindrome(Node head){
        if(head==null){
            return true;
        }

        Node mid = middle(head);
        Node midNext = mid.next;
        Node secondHalf = reverse(midNext);
        Node firstHalf = head;

        while(secondHalf != null){
            if(secondHalf.data != firstHalf.data){
                System.out.println("Given LinkedList is not a Palindrome");
                return false;
            }
            secondHalf = secondHalf.next;
            firstHalf = firstHalf.next;
        }
        System.out.println("Given LinkedList is a Palindrome");
        return true;
    }

    public static void main(String[] args) {
        Palindrome list = new Palindrome();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.printList(list.head);
        System.out.println();
        System.out.println(list.middle(list.head).data);
        System.out.println();
        list.reverse(list.head);
        list.printList(list.head);
        System.out.println();
        System.out.println();
        list.isPalindrome(list.head);
    }
}
