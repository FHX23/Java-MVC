package Controlador;
import Modelo.*;
import Vista.BibliotecaVista;

public class BibliotecaControlador {
    private BibliotecaModelo modelo;
    private BibliotecaVista vista;

    public BibliotecaControlador() {
    }

    public BibliotecaControlador(BibliotecaModelo modelo, BibliotecaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void addBook(){
        Libro libro = vista.getBookInput();
        modelo.addBook(libro);
        System.out.println("Listo Libro guardado");
    }
    
    public void listBooks(){
        vista.displayBooks(modelo.getLibros());
    }
}
