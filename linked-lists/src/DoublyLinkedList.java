// A class representing a doubly linked list

import java.util.Random;

public class DoublyLinkedList<T> {

	// A class representing a node in the doubly linked list
	public static class Node<T> {
		public T key; // The value stored in the node (generic type)
		public Node<T> next; // Pointer to the next node in the list
		public Node<T> prev; // Pointer to the previous node in the list

		// Constructor: initializes a node with data of generic type T
		public Node(T key) {
			this.key = key;
			this.next = null;
			this.prev = null;
		}
	}

	// The head node of the list (the first element)
	private Node<T> head;

	// Constructor: initializes an empty list
	public DoublyLinkedList() {
		this.head = null;
	}

	/**
	 * Adds a new node to the front of the list (equivalent to LIST-PREPEND).
	 * 
	 * @param newNode the node to insert at the beginning
	 */
	public void prepend(Node<T> newNode) {
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
	public Node<T> search(T key) {
		Node<T> current = head;

		// Traverse the list until we find the key or reach the end
		while (current != null && !current.key.equals(key)) {
			current = current.next;
		}

		return current; // May return null if not found
	}

	/**
	 * Prints the list from head to tail.
	 */
	public void printList() {
		Node<T> current = head;

		// Traverse the list and print each node's key
		while (current != null) {
			System.out.print(current.key + " ");
			current = current.next;
		}

		System.out.println(); // New line at the end
	}

	/**
	 * Inserts node x immediately after node y in the list.
	 */
	public void insert(Node<T> x, Node<T> y) {
		// Set x.next to y.next (x points to y's next node)
		x.next = y.next;

		// Set x.prev to y (x's previous node is y)
		x.prev = y;

		// If y.next is not null, update its prev pointer to point to x
		if (y.next != null) {
			y.next.prev = x;
		}

		// Finally, link y to x
		y.next = x;
	}

	public void delete(Node<T> x) {
		if (x.prev != null) // if X is not the first node
			x.prev.next = x.next; // we point the first node to the next node of X
		else
			head = x.next; // if X is the first node we now, point the head to the next node of X
		if (x.next != null) // if X is not the last node
			x.next.prev = x.prev; // we point the next node of X prev to the previous node of X
	}

	// The main class to test the DoublyLinkedList
	public static void main(String[] args) {
		// Create a new empty doubly linked list
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		int RANGE = 20;
		// Create nodes manually and link them to form a list
		Node<Integer> n1 = new Node<>(3);
		Node<Integer> n2 = new Node<>(27);
		Node<Integer> n3 = new Node<>(new Random().nextInt(RANGE));

		list.head = n1;
		n1.next = n2;
		n2.next = n3;
		n2.prev = n1;
		n3.prev = n2;

		System.out.print("Doubly Linked List created manually: ");
		list.printList();

		// Prepend nodes to the list
		for (int i = 0; i < 10; i++) {
			list.prepend(new Node<>(new Random().nextInt(RANGE)));
		}

		System.out.print("\nList after using the prepend method: ");
		list.printList();

		// search method
		int nToSearch = new Random().nextInt(RANGE);

		System.out.print("Searching node: " + nToSearch + " in --> list: ");
		list.printList();
		Node<Integer> found = list.search(nToSearch);
		System.out.println(found != null ? "\nFound node with key: " + found.key : "\nKey not found");

		// Inserting a new node with key 5 after node n2
		Node<Integer> newNode = new Node<>(28);
		list.insert(newNode, n2); // Insert 5 after node n2

		System.out.print("\nList after insert operation: ");
		list.printList();

		// delete the node n2
		System.out.println("\nDeleting the node: " + n2.key);
		list.printList();
		list.delete(n2);
		System.out.println("list after deleting: ");
		list.printList();
	}
}
