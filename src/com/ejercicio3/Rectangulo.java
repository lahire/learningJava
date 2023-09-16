package src.com.ejercicio3;

public class Rectangulo {
  double largo;
  double ancho;

  public void setLargo(double largo) {
    this.largo = largo;
  }

  public double getLargo() {
    return this.largo;
  }

  public void setAncho(double ancho) {
    this.ancho = ancho;
  }

  public double getAncho() {
    return this.ancho;
  }

  public double getArea() {
    return ancho * largo;
  }

  public double getPerimeter() {
    return (2 * ancho) + (2 * largo);
  }

  public Rectangulo(double largo, double ancho) {
    this.setLargo(largo);
    this.setAncho(ancho);
  }

  public static void main(String[] args) {
    Rectangulo rec1 = new Rectangulo(1, 2);
    System.out.println("Area: " + rec1.getArea());
    System.out.println("Perimetro: " + rec1.getPerimeter());
    Rectangulo cuadrado = new Rectangulo(1, 1);
    System.out.println("Area: " + cuadrado.getArea());
    System.out.println("Perimetro: " + cuadrado.getPerimeter());

  }

}
