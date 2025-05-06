public interface Lista<T> {

  /**
   * Informa el estado de la lista
   * 
   * @param ninguno
   * @return el estado de la lista
   */
  boolean esVacia();

  /**
   * Inserta un dato al final de la lista
   * 
   * @param dato que se desea insertar de clase <T>
   * @return nada(void)
   */
  void insertar(T dato);

  /**
   * Elimina el dato de la posicion dada, si es que la posicion
   * existe, sino no hace nada.
   * 
   * @param pos entero positivo, incluido el cero 0.
   * @return nada(void)
   */
  void eliminar(int pos);

  /**
   * Accede al dato de la posicion dada en caso de existir, si la
   * posicion dada no existe la lista retorna null.
   * 
   * @param pos entero positivo, incluido el cero 0.
   * @return
   */
  T acceder(int pos);

  /**
   * Elimina el dato que es igual al dato que se da como entrada.
   * 
   * @param dato de clase T que referencia al dato que se desea
   *             eliminar
   * @return nada(void)
   */
  void eliminarDato(T dato);

  /**
   * Elimina todas las instancias del dato dado como referencia
   * de la lista, en caso de no existir el dato, no hace nada.
   * 
   * @param dato de clase <T> que referencia al dato que se desea
   *             eliminar.
   * @return nada(void)
   */
  void eliminarTodas(T dato);

  /**
   * Busca el dato de referencia en todos los datos almacenados
   * en la lista y responde true en caso de existir el dato, caso
   * contrario false.
   * 
   * @param dato de clase <T> que referencia al dato que se desea
   *             buscar.
   * @return True or False.
   */
  boolean buscar(T dato);

  /**
   * Busca la posicion en la que reside el dato de referencia en
   * la lista, y responde la posicion en caso de existir sino
   * responde -1.
   * 
   * @param dato de clase <T> que referencia al dato que se busca
   * @return una posicion que es un valor entero.
   */
  int indiceDe(T dato);

  /**
   * Devuelve el tamaño actual de la lista, que es equivalente a la
   * cantidad de datos que almacena.
   * 
   * @param ninguno.
   * @return el tamaño que es un entero positivo incluido el 0
   */
  int longitud();

  /**
   * Inserta a la lista todos los datos de la otra lista de referencia
   * 
   * @param otra que es una lista que contiene datos de clase <T>.
   * @return nada(void)
   */
  void insertarTodos(Lista<T> otra);

  /**
   * Reemplaza el dato de la posicion "pos" con el dato de referencia, en caso
   * de que la posicion "pos" no exista, no hace nada.
   * 
   * @param pos  es un entero positivo incluido el 0
   * @param dato es el nuevo dato que ocupara la posicion "pos"
   * @return nada(void)
   */
  void reemplazar(int pos, int dato);

  /**
   * Accede a la informacion almacenada en la lista que es igual al dato de
   * referencia.
   * 
   * @param dato que es de clase <T> que denota el dato a acceder.
   * @return dato
   */
  T acceder(T dato);
}