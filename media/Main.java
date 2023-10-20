package media;

public class Main {

  public static void main(String[] args) {
    Libro libro = new Libro("Lamy", "Pluma");
    Pelicula peli = new Pelicula("Alien", "Ridley Scott");
    Musica mus = new Musica("Laaaaa", "El intérprete");

    Medio[] media = { libro, peli, mus };
    for (Medio item : media) {
      item.reproducir();
    }
  }

}
