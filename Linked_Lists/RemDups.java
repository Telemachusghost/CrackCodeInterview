/*
This is the follow up where we do not use a temporary buffer
*/

public class RemDups {
    
    public static void main(String[] args) {
        Node a = new Node(1);
        

        a.appendToTail(1);
        a.appendToTail(2);        
        a.appendToTail(3);
        a.appendToTail(3);
        a.appendToTail(4);
        
        // 1 1 2 3 3 4
        displayLinkedList(a);
        System.out.println();
        remDups(a);
        
        // 1 2 3  4
        displayLinkedList(a);

    }

    public static void remDups(Node head) {
        Node current = head;
        while (current.next != null) {
            Node runner = current.next;
            if (runner.data == current.data) {
                current.next = current.next.next;
                runner = runner.next;
            }
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
    


    public static void displayLinkedList(Node head) {
        Node current = head;
        do {
            System.out.print(" " + current.data + " ");
            current = current.next;
        } while (current != null);
    }
}

    
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
}