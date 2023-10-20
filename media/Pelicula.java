package media;

public class Pelicula extends Medio {
  private String title;
  private String director;

  public Pelicula(String title, String director) {
    this.title = title;
    this.director = director;
  }

  @Override
  public void reproducir() {
    String line = "Reproduciendo Película: '" + this.title + "'. Director: " + this.director;
    System.out.println(line);
  }

}
