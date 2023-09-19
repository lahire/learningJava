package src.com.ejercicio4.entrada;

import java.util.Scanner;
import static src.com.ejercicio4.salida.SalidaConsola.decir;

public class EntradaConsola {

  public static void main(String[] args) {
    int count = Integer.parseInt(args[0]);
    Scanner myScanner = new Scanner(System.in);
    // SalidaConsola salida = new SalidaConsola();
    for (int i = 0; i < count; i++) {
      decir("Ingrese algo. Iteración número " + i + "\n");
      decir("Escribiste: " + myScanner.nextLine() + "\n");
      ////
    }
    myScanner.close();
  }

}
