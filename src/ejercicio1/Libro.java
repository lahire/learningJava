package src.ejercicio1;
// Ejercicio: Constructores de Libro

// Crear una clase llamada Libro con los atributos titulo,
// autor y añoPublicacion. Definir un constructor que acepte solo el 
//título y el autor, y establezca el añoPublicacion en el año actual
// (ver LocalDate.now().getYear()). Luego crear otro constructor 
//que acepte todos los atributos (titulo, autor y añoPublicacion). 
//Utilizar la sobrecarga de constructores para crear dos objetos Libro,
// uno con el año de publicación especificado y otro sin especificarlo. 
//Mostrar los detalles de ambos libros.

import java.time.LocalDate;

public class Libro {
  private String titulo;
  private String autor;
  private int publishYear;

  public Libro(String titulo, String autor, int year) {
    this.setAutor(autor);
    this.setTitle(titulo);
    this.setPublishYear(year);

  }

  public Libro(String titulo, String autor) {
    /**
     * Un libro
     * 
     * @titulo Título del Libro
     * @autor Autor del Libro
     * 
     *        PublishYear Fecha de publicación, va a estar en hoy
     */

    this.setAutor(autor);
    this.setTitle(titulo);
    this.setPublishYear(LocalDate.now().getYear());
  }

  public void setTitle(String titulo) {
    this.titulo = titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setPublishYear(int year) {
    this.publishYear = year;
  }

  public String getTitle() {
    return this.titulo;
  }

  public String getAutor() {
    return this.autor;
  }

  public int getPublishYear() {
    return this.publishYear;
  }

  public void showDetails() {
    String line = "Autor: " + this.getAutor() +
        "\nTitle: " + this.getTitle() +
        "\nPublicado en el año: " + this.getPublishYear() + "\n";
    System.out.println(line);
  }

  public static void main(String[] args) {
    Libro lib1 = new Libro("set un pato", "pato donald");
    Libro lib2 = new Libro("Ser un pato 2 la venganza", "pato donal", 2024);
    lib1.showDetails();
    lib2.showDetails();
  }
}
