package DSA.LinkedList;

public class TwoSum {

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

    public void printList(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public Node TwoSum(Node head1, Node head2) {
        int carry = 0;
        Node dummy = new Node(0);
        Node currentNode = dummy;

        while (head1 != null || head2 != null) {
            int x = (head1 != null) ? head1.data : 0;
            int y = (head2 != null) ? head2.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            currentNode.next = new Node(sum % 10);
            currentNode = currentNode.next;

            if (head1 != null) head1 = head1.next;
            if (head2 != null) head2 = head2.next;
        }

        if (carry > 0) {
            currentNode.next = new Node(carry);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        TwoSum l1 = new TwoSum();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        TwoSum l2 = new TwoSum();
        l2.add(5);
        l2.add(6);
        l2.add(7);
        Node head1 = l1.head;
        Node head2 = l2.head;

        TwoSum result = new TwoSum();
        Node resultHead = result.TwoSum(head1, head2);
        result.printList(resultHead);
    }
}
