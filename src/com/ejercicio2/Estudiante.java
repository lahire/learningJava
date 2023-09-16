package src.com.ejercicio2;

import java.util.Arrays;

public class Estudiante {
  private String nombre;
  private String carrera;
  private int edad;
  private String[] materias;

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setCarrera(String carrera) {
    this.carrera = carrera;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setMaterias(String materias) {
    this.materias = materias.split(",");
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getCarrera() {
    return this.carrera;
  }

  public int getEdad() {
    return this.edad;
  }

  public String[] getMaterias() {
    return this.materias;
  }

  public void showDetails() {
    String lines = "Nombre: " + this.getNombre() + "\n" +
        "Carrera: " + this.getCarrera() + "\n" +
        "Edad: " + this.getEdad() + "\n" +
        "Materias: " + Arrays.toString(this.getMaterias()).replaceAll("[\\[\\](){}]", "") + "\n";
    System.out.println(lines);
  }

  public Estudiante(String nombre, String carrera, int edad, String materias) {
    this.setCarrera(carrera);
    this.setNombre(nombre);
    this.setEdad(edad);
    this.setMaterias(materias);
  }

  public static void main(String[] args) {
    Estudiante est1 = new Estudiante("Nicolas", "LCD", 35, "Algoritmos,Infra,Pato");
    Estudiante est2 = new Estudiante("Ivana", "LCD", 34, "Algoritmos 1");
    est1.showDetails();
    est2.showDetails();
  }
}
