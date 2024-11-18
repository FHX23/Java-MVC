package Modelo;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anio) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnio(anio);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + '}';
    }
    
    
}
