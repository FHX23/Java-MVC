package Modelo;
import java.util.ArrayList;

public class BibliotecaModelo {
    private ArrayList<Libro> libros;

    public BibliotecaModelo() {
        this.libros = new ArrayList<>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public void addBook(Libro libro){
        libros.add(libro);
    }
    
    
    
}
