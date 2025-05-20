public class BinaryTree<T> {
	private BinaryTree<T> izq;
	private T raiz;
	private BinaryTree<T> der;

	// Constructor
	public BinaryTree() {
		raiz = null;
		izq = der = null;
	}

	// Metodo para ver si el arbol es vacio
	public boolean esVacia() {
		return raiz == null;
	}

	// Metodo para insertar un nodo en el arbol
	// Metodo para eliminar un nodo en el arbol
	// Metodo para buscar un nodo en el arbol
}
