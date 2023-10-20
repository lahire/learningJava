package calc;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Operation operation = new Operation();
    Scanner input = new Scanner(System.in);
    double num1, num2;
    String operador;
    System.out.println("Ingrese primer número:");
    num1 = input.nextDouble();
    System.out.println("Ingrese segundo número:");
    num2 = input.nextDouble();
    input.nextLine(); // consumo los \n
    System.out.println("Ingrese un operador (+,-,/,*):");
    operador = input.nextLine();
    input.close();
    switch (operador) {
      case "+":
        operation.suma(num1, num2);
        break;
      case "-":
        operation.resta(num1, num2);
        break;
      case "/":
        operation.division(num1, num2);
        break;
      case "*":
        operation.multiplicacion(num1, num2);
        break;
      default:
        System.err.println("No hay operador válido");
        System.exit(1);
    }
  }
}
