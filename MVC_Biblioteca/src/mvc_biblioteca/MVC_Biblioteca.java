package mvc_biblioteca;
import Modelo.BibliotecaModelo;
import Vista.BibliotecaVista;
import Controlador.BibliotecaControlador;

public class MVC_Biblioteca {

    public static void main(String[] args) {
        BibliotecaModelo modelo = new BibliotecaModelo();
        BibliotecaVista vista = new BibliotecaVista();
        BibliotecaControlador controlador = new BibliotecaControlador(modelo, vista);

        controlador.addBook();
        controlador.addBook();
        controlador.listBooks();

    }
    
}
