package pojo;

/*
  Clase Band
*/

public class Biblioteca {
  // Propiedades
  private String titulo;
  private String autor;
  private String anio;
  private String estante_numero;
  private String estante_seccion;
  private String piso;
  private String edificio;
  private String sede;

  // Métodos getter y setter
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  //
  public String getAutor() {
    return autor;
  }
  public void setAutor(String autor) {
    this.autor = autor;
  }
  //
  public String getAnio() {
    return anio;
  }
  public void setAnio(String anio) {
    this.anio = anio;
  }
  //
  public String getEstante_numero() {
    return estante_numero;
  }
  public void setEstante_numero(String estante_numero) {
    this.estante_numero = estante_numero;
  }
  //
  public String getEstante_seccion() {
    return estante_seccion;
  }
  public void setEstante_seccion(String estante_seccion) {
    this.estante_seccion = estante_seccion;
  }
  //
  public String getPiso() {
    return piso;
  }
  public void setPiso(String piso) {
    this.piso = piso;
  }
  //
  public String getEdificio() {
    return edificio;
  }
  public void setEdificio(String edificio) {
    this.edificio = edificio;
  }
  //
  public String getSede() {
    return sede;
  }
  public void setSede(String sede) {
    this.sede = sede;
  }
}