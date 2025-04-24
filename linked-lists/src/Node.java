// A class representing a node in a doubly linked list
public class Node {
    public int key;       // The value stored in the node
    public Node next;     // Pointer to the next node in the list
    public Node prev;     // Pointer to the previous node in the list

    // Constructor: initializes a node with a key
    public Node(int key) {
        this.key = key;
        this.next = null;
        this.prev = null;
    }
}
