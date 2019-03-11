/*
I learned doing this one to not try too hard to focus on having one 
loop or having some arbitrary limit on myself. My first try at this I
tried to just do everything in one loop and that proved to make
my code a lot like spaghetti.
*/

public class LastToKth {
    public static void main(String[] args) {
        Node a = new Node(1);
        a.appendToTail(2);
        a.appendToTail(3);
        a.appendToTail(4);
        a.appendToTail(5);
        System.out.println(kthToLast(a,5).data); // 1
        System.out.println(kthToLast(a,4).data); // 2
        System.out.println(kthToLast(a,3).data); // 3
        System.out.println(kthToLast(a,2).data); // 4
        System.out.println(kthToLast(a,1).data); // 5
    }

    // Returns the kth node (starting from zero) from the last node
    public static Node kthToLast(Node head, int k) {
        Node fastRunner = head; // Fast runner
        Node slowRunner = head; // Slow runner
        boolean paceSet = false;
        int count = 0;
        
        for (int i = 0; i < k - 1; i++) {
            if (fastRunner == null) {
                return null;
            }
            fastRunner = fastRunner.next;
        }

        while (fastRunner.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next;
        }
        return slowRunner;
    }

    

}