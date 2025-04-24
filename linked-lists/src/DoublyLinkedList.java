// A class representing a doubly linked list
public class DoublyLinkedList {

    // The head node of the list (the first element)
    private Node head;

    // Constructor: initializes an empty list
    public DoublyLinkedList() {
        this.head = null;
    }

    /**
     * Adds a new node to the front of the list.
     * This is equivalent to LIST-PREPEND.
     * 
     * @param newNode the node to insert at the beginning
     */
    public void prepend(Node newNode) {
        // Set the new node's next pointer to the current head
        newNode.next = head;

        // It's going to be the first node, so its previous is null
        newNode.prev = null;

        // If the list isn't empty, update the previous head's prev pointer
        if (head != null) {
            head.prev = newNode;
        }

        // Update the list's head to point to the new node
        head = newNode;
    }

    /**
     * Searches for the first node with the given key.
     * Equivalent to LIST-SEARCH.
     * 
     * @param key the value to search for
     * @return the node with that key, or null if not found
     */
    public Node search(int key) {
        Node current = head;

        // Traverse the list until we find the key or reach the end
        while (current != null && current.key != key) {
            current = current.next;
        }

        return current; // May return null if not found
    }

    /**
     * Prints the list from head to tail.
     */
    public void printList() {
        Node current = head;

        // Traverse the list and print each node's key
        while (current != null) {
            System.out.print(current.key + " ");
            current = current.next;
        }

        System.out.println(); // New line at the end
    }

    // The main class to test the DoublyLinkedList
    public static void main(String[] args) {
        // Create a new empty doubly linked list
        DoublyLinkedList list = new DoublyLinkedList();
        DoublyLinkedList list2 = new DoublyLinkedList();
        // ----------------------------------------------------------//
        // we can create manually a DlinkedList like this:
        Node n1 = new Node(35);
        Node n2 = new Node(4);
        Node n3 = new Node(11);
        // unimos los nodos de nuestra LinkedList
        list2.head = n1;
        n1.next = n2;
        n2.next = n3;
        n2.prev = n1;
        n3.prev = n2;
        System.out.println("Doubly Linked List2 created manually: ");
        list2.printList();
        // ----------------------------------------------------------//
        // Prepend nodes to the list (in reverse order to make 1 → 2 → 3)
        list.prepend(new Node(3));
        list.prepend(new Node(2));
        list.prepend(new Node(1));

        System.out.print("List1 after using the prepend method: ");
        list.printList(); // Expected output: 1 2 3
        // ----------------------------------------------------------//
        // Search for a node with key = 2
        Node found = list.search(2);
        System.out.println(found != null ? "Found node with key: " + found.key : "Key not found");
        // Try to search for a node that doesn’t exist (key = 7)
        Node missing = list.search(7);
        System.out.println(missing != null ? "Found: " + missing.key : "Key not found");
        // ----------------------------------------------------------//
    }
}
