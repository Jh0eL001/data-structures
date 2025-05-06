public class ListaSE<T> implements Lista<T> {
  private T ini;
  private ListaSE<T> sig;

  public ListaSE() {
    ini = null;
    sig = null;
  }

  @Override
  public boolean esVacia() {
    return ini == null;
  }

  @Override
  public void insertar(T dato) {
    if (esVacia()) {
      ini = dato;
      sig = new ListaSE<T>();
    } else {
      sig.insertar(dato);
    }
  }

  public void mostrar() {
    if (!esVacia()) {
      System.out.print(this.ini + " --> ");
      if (!sig.esVacia()) {
        this.sig.mostrar(); // Seguimos mostrando los siguientes nodos
      }
    }
  }

  @Override
  public void eliminar(int pos) {
    if (!esVacia()) {
      if (pos == 0) {
        ini = sig.ini;
        sig = sig.sig;
      } else {
        sig.eliminar(pos - 1);
      }
    }
  }

  @Override
  public T acceder(int pos) {
    T dato = null;
    if (esVacia()) {
      dato = null;
    } else {
      if (pos == 0)
        dato = ini;
      else
        dato = sig.acceder(pos - 1);
    }
    return dato;
  }

  @Override
  public void eliminarDato(T dato) {
    if (!esVacia()) {
      if (dato == ini) {
        ini = sig.ini;
        sig = sig.sig;
      } else
        sig.eliminarDato(dato);
    }
  }

  @Override
  public void eliminarTodas(T dato) {
    if (!esVacia()) {
      if (dato.equals(ini)) {
        ini = sig.ini;
        sig = sig.sig;
        eliminarTodas(dato); // Sigue buscando mas ocurrencias del dato
      } else {
        sig.eliminarTodas(dato);
      }
    }
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
