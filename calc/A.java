package calc;

public class A {
  private char campo1;
  protected char campo2;

  public char getCampo1() {
    return this.campo1;
  }

  protected void metodo1() {
    System.out.println("Hola soy el metodo 1 de A");
    metodo2();
  }

  private void metodo2() {
    System.out.println("Hola soy metodo privado de A");
  }

}