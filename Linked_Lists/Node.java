class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }
    
    Node deleteNode(Node head, int d) {
        Node n = head;
        
        if (head.data == d) {
            return head.next;
        }

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
            }
            n = n.next;
        }
        return head;
    }
    
    public static void displayLinkedList(Node head) {
        Node current = head;
        do {
            System.out.print(" " + current.data + " ");
            current = current.next;
        } while (current != null);
    }
}