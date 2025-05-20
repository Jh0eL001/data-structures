public class Cola<T> {
  private NodoDE<T> frente, fin;
  public Cola() {
    frente = fin = null;
  }

  public boolean esVacia() {
    return frente == null;
  }

  public void encolar(T dato) {
    NodoDE<T> n;
    n = new NodoDE<T>(dato);
    if (esVacia()) {
      frente = fin = n;      
    } else {
      fin.setSuc(n);
      n.setAnt(fin);
      fin = fin.getSuc();
    }
  }

  public T decolar() {
    T dato;
    if (esVacia()) {
      dato = null;
    } else {
      dato = frente.getDato();
      frente = frente.getSuc();
      if (frente == null) {
        fin = null;
      } else {
        frente.setAnt(null);
      }
    }
    return dato;
  }

  public T ver() {
    T dato;
    if (esVacia()) {
      dato = null;
    } else {
      dato = frente.getDato();
    }
    return dato;
  }
}
