package temperatura;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float entrada;
    String unit;
    Temperatura temp;
    System.out.println("Ingrese la Temperatura: ");
    entrada = input.nextFloat();
    input.nextLine(); // me como el \n (sino el proximo nextLine no anda)
    System.out.println("Ingrese la unidad de temperatura: ");
    unit = input.nextLine();
    input.close();

    switch (unit.toLowerCase()) {
      case "c":
        temp = new Temperatura(entrada, true);
        System.out.println(temp.getFarenheit());
        break;
      case "f":
        temp = new Temperatura(entrada, false);
        System.out.println(temp.getCelcius());
        break;
      default:
        System.err.println("No es una conversión válida");
        System.exit(1);
    }

  }
}
