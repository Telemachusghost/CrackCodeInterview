/*
This one was easy to figure out for me
the node would just take the data from the next node as its own and
then delete the next node.
*/

public class DeleteNode {
    public static void main(String args[]) {
        Node a = new Node(1);
        a.appendToTail('a');
        a.appendToTail('b');
        a.appendToTail('c');
        a.appendToTail('d');
        a.appendToTail('e');
        Node.displayLinkedList(a); // a b c d e
        deleteNode(a.next.next);   // Delete Node c
        System.out.println();
        Node.displayLinkedList(a); // a b d e

    }
    
    // A function that given a center node takes the data from the next
    // Node then deletes the next node. Which in effect deletes the given node
    public static void deleteNode(Node DelNode) {
        DelNode.data = DelNode.next.data; // Set nodes data to next nodes
        DelNode.next = DelNode.next.next; // Delete next node
    }
}