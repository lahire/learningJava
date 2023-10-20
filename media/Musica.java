package media;

public class Musica extends Medio {
  private String titulo;
  private String interprete;

  public Musica(String titulo, String interprete) {
    this.titulo = titulo;
    this.interprete = interprete;
  }

  @Override
  public void reproducir() {
    String line = "Reproduciendo Música: '" + this.titulo + "'. Interpretada por: " + this.interprete;
    System.out.println(line);
    ;
  }

}
