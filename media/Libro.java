package media;

public class Libro extends Medio {
  private String title;
  private String author;

  public Libro(String title, String author) {
    this.title = title;
    this.author = author;
  }

  @Override
  public void reproducir() {
    String line = "Reproduciendo Libro: '" + this.title + "', de " + this.author;
    System.out.println(line);
  }

}
