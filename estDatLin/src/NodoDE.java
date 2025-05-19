public class NodoDE<T> {
  private NodoDE<T> ant; // nodo antecesor (prev)
  private T dato;
  private NodoDE<T> suc; // nodo sucesor (next)

  // construimos el nodo siempre con un dato, no gastamos memoria en vano
  public NodoDE(T dato) {
    this.dato = dato;
    ant = suc = null; // empezamos con los nodos apuntando a null (a nada)
  }

  // set el dato
  public void setDato(T dato) {
    this.dato = dato;
  }

  // get dato
  public T getDato() {
    return dato;
  }

  // set sucesor
  public void setSuc(NodoDE<T> nodo) {
    this.suc = nodo;
  }

  // pasar sucesor
  public NodoDE<T> getSuc() {
    return suc;
  }

  public void setAnt(NodoDE<T> nodo) {
    ant = nodo;
  }

  public NodoDE<T> getAnt() {
    return ant;
  }
  // set prev
  // get prev
  // set next
  // get next
}
