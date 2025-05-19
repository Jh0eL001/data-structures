public class ListaDE<T> implements Lista<T> {
  // implementaremos una lista de doble enlace de forma recursiva
  private NodoDE<T> ini;

  @Override
  public boolean esVacia() {
    return ini == null;
  }

  @Override
  public void insertar(T dato) {
    if (esVacia()) {
      ini = new NodoDE<T>(dato);
    }
    // creamos una copia del puntero ini para avanzar por la lista
    NodoDE<T> actual = ini;
    while (actual.getSuc() != null) {
      actual = actual.getSuc();
    }
    // estamos al final de la lista, creamos el nuevo nodo
    NodoDE<T> nuevo = new NodoDE<T>(dato);
    // enlazamos el nodo, ya que nuestro nodo temporal(actual) esta apuntando al
    // ultimo nodo
    // entonces hacemos que nuestro nuevo nodo apunte al temporal(actual) asi estara
    // apuntando
    // al nodo anterior, y el sucesor del nuevo nodo estara apuntando a null;
    actual.setSuc(nuevo);
    nuevo.setAnt(actual);
  }

  @Override
  public void eliminar(int pos) {
    if (!esVacia()) {
      NodoDE<T> actual = ini;
      while (actual != null && pos != 0) {
        actual = actual.getSuc(); // vamos al nodo siguiente.
        pos -= 1;
      }
      // llegamos al nodo
      if (actual != null) {
        NodoDE<T> p = actual.getAnt();
        NodoDE<T> s = actual.getSuc();

        if (p != null)
          p.setSuc(s);
        else
          ini = s;

        if (s != null)
          s.setAnt(p);
      }
    }
  }

  @Override
  public T acceder(int pos) {
    T dato = null;
    if (!esVacia()) {
      NodoDE<T> actual = ini;
      while (actual != null && pos != 0) {
        actual = actual.getSuc(); // vamos al nodo siguiente.
        pos -= 1;
      }
      // llegamos al nodo
      if (actual != null)
        dato = actual.getDato();
    }
    return dato;
  }

  @Override
  public void eliminarDato(T dato) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eliminarDato'");
  }

  @Override
  public void eliminarTodas(T dato) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eliminarTodas'");
  }

  @Override
  public boolean buscar(T dato) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscar'");
  }

  @Override
  public int indiceDe(T dato) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'indiceDe'");
  }

  @Override
  public int longitud() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'longitud'");
  }

  @Override
  public void insertarTodos(Lista<T> otra) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'insertarTodos'");
  }

  @Override
  public void reemplazar(int pos, int dato) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'reemplazar'");
  }

  @Override
  public T acceder(T dato) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'acceder'");
  }

}
