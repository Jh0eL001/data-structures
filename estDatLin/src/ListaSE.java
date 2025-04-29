public class ListaSE<T> implements Lista<T> {
  private T ini;
  private ListaSE<T> sig;

  public ListaSE() {
    this.ini = null;
    this.sig = null;
  }

  @Override
  public boolean esVacia() {
    return this.ini == null;
  }

  @Override
  public void insertar(T dato) {
    if (this.ini == null) {
      this.ini = dato;
      this.sig = new ListaSE<T>();
    } else {
      this.sig.insertar(dato);
    }
  }

  public void mostrar() {
    if (this.ini != null) {
      System.out.print(this.ini + " --> ");
      if (this.sig != null) {
        this.sig.mostrar(); // Seguimos mostrando los siguientes nodos
      }
    }
  }

  @Override
  public void eliminar(int pos) {
    if (pos < 0 || this.ini == null) { 
      return; // pos invalida o lista vacia
    }

    if (pos == 0) { // estamos en el nodo que queremos eliminar
      if (this.sig != null) {
        this.ini = this.sig.ini;
        this.sig = this.sig.sig;
      } else {
        this.ini = null;
        this.sig = null;
      }
    }
    else if (this.sig != null)
      this.sig.eliminar(pos - 1);

  }

  @Override
  public T acceder(int pos) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'acceder'");
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
