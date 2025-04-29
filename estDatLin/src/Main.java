import java.util.Random;

public class Main {
  public static void main(String[] args) {
    ListaSE<Integer> lista = new ListaSE<>();
    int size = 10;
    for (int i = 0; i < size; i++) {
      lista.insertar(new Random().nextInt(11));
    }
    lista.mostrar();
    lista.eliminar(5);
    System.out.println();
    lista.mostrar();

    lista.eliminar(0);
    System.out.println();
    lista.mostrar();
  }
}
