public class Pila<T> {
  // LIFO - last in first out
  private NodoSE<T> tope;
  // constructor
  public Pila() {
    tope = null;
  }

  public boolean esVacia() {
    return tope == null;
  }

  // Insertar
  public void push (T dato) {
    NodoSE<T> t;
    t = new NodoSE<T>(dato);
    if (esVacia()) {
      tope = t;
    } else {
      t.setSuc(tope);
      tope = t;
    }
  }

  // Eliminar
  public T pop() {
    T dato;
    if (esVacia()) {
      dato = null;
    } else {
      dato = tope.getDato();
      tope = tope.getSuc();
    }
    return dato;
  }

  public T top() {
    T dato;
    if (esVacia()) {
      dato = null;
    } else {
      dato = tope.getDato();
    }
    return dato;
  }
}
