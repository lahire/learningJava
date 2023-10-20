package matriz;

import java.util.ArrayList;
import java.util.List;

public class Matriz<T> {
  List<List<T>> columnas;

  public Matriz(int cantidadColumnas) {
    columnas = new ArrayList<>();
    for (int i = 0; i < cantidadColumnas; i++) {
      columnas.add(new ArrayList<>());
    }
  }

  public Matriz(T[][] matriz) {
    this(matriz[0].length);
  }

  public T getCelda(int fila, int columna) {
    return columnas.get(columna).get(fila);
  }

  public void setCelda(int fila, int columna, T valor) {
    columnas.get(columna).set(fila, valor);
  }

  public static void main(String[] args) {
    Integer[][] m1 = { { 1, 2, 3, 4 }, { 4, 5, 3, 2 } };
    System.out.println(m1);

  }
}
