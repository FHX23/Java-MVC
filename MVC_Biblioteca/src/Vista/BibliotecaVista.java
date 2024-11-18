package Vista;
import java.util.ArrayList;
import Modelo.Libro;
import java.util.Scanner;

public class BibliotecaVista {
    private Scanner scanner;
    
    public BibliotecaVista(){
        scanner = new Scanner(System.in);
    }
    
    public void displayBooks(ArrayList<Libro> books){
        if(books.isEmpty()){
            System.out.println("No hay libros");
        }
        else{
            System.out.println("Libros disponibles:");
            for(Libro libro : books){
                System.out.println(libro);
            }
        }
    }
    
    public Libro getBookInput(){
        System.out.println("Ingrese un titulo: ");
        String t = scanner.nextLine();
        System.out.println("Ingrese un autor: ");
        String a = scanner.nextLine();        
        System.out.println("Ingrese un año: ");
        int y = Integer.parseInt(scanner.nextLine());        
        Libro libro = new Libro(t,a,y);
        return libro;
    }
    
    public int getMenuOption(){
        System.out.println("Opciones:");
        System.out.println("1. Agregar Libro: ");
        System.out.println("2. Mostrar Libros: ");
        System.out.println("3. Salir: ");
        
        return Integer.parseInt(scanner.nextLine());
    }
    
}
