package calc;

public class Operation {
  private double resultado;

  public void suma(double num1, double num2) {
    resultado = num1 + num2;
    System.out.println(resultado);
  }

  public void resta(double num1, double num2) {
    resultado = num1 - num2;
    System.out.println(resultado);
  }

  public void multiplicacion(double num1, double num2) {
    resultado = num1 * num2;
    System.out.println(resultado);
  }

  public void division(double num1, double num2) {
    resultado = num1 / num2;
    System.out.println(resultado);
  }

}
