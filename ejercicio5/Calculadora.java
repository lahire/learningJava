package ejercicio5;

import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el primer número:");
    int primero = Integer.parseInt(sc.nextLine());
    System.out.println("Ingrese el operador (+, -, *, /):");
    String operador = sc.nextLine();
    System.out.println("Ingrese el segundo número:");
    int segundo = Integer.parseInt(sc.nextLine());
    sc.close();
    int resultado = 0;
    switch (operador) {
      case "+":
        resultado = primero + segundo;
        break;
      case "-":
        resultado = primero - segundo;
        break;
      case "*":
        resultado = primero * segundo;
        break;
      case "/":
        resultado = primero / segundo;
        break;
      default:
        System.out.println("dsadads");
        break;
    }
    // if (operador.equals("+")) {
    // resultado = primero + segundo;
    // } else if (operador.equals("-")) {
    // resultado = primero - segundo;
    // } else if (operador.equals("*")) {
    // resultado = primero * segundo;
    // } else if (operador.equals("/")) {
    // resultado = primero / segundo;
    // }
    System.out.println("Resultado: " + resultado);
  }
}

/*
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Ingrese el primer número:");
 * int primero = sc.nextInt();
 * System.out.println("Ingrese el operador (+, -, *, /):");
 * String operador = sc.nextLine();
 * System.out.println("Ingrese el segundo número:");
 * int segundo = sc.nextInt();
 * sc.close();
 */