import java.util.Random;

public class Main {
  public static void main(String[] args) {
    ListaSE<Integer> lista = new ListaSE<>();
    int size = 10;
    for (int i = 0; i < size; i++) {
      lista.insertar(new Random().nextInt(6));
    }
    lista.mostrar();
    // eliminar un dato por posicion
    lista.eliminar(7);
    System.out.println();
    lista.mostrar();
    // acceder dato
    System.out.println();
    System.out.println("accediendo al dato en pos(5): " + lista.acceder(5));
    // eliminar dato por valor
    lista.eliminarDato(5);
    lista.mostrar();
    System.out.println();
    // eliminar todos los datos del mismo valor
    lista.eliminarTodas(5);
    lista.mostrar();
    System.out.println("ultima");
  }
}
