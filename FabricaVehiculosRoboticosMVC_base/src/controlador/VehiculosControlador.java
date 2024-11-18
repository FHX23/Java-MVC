package controlador;
import vista.*;
import modelo.*;

public class VehiculosControlador {
    private GestorVehiculos gestorVehiculos;
    private ConsolaVista vista;

    public VehiculosControlador(GestorVehiculos gestorVehiculos, ConsolaVista vista) {
        this.gestorVehiculos = gestorVehiculos;
        this.vista = vista;
    }
    
    public void agregarVehiculo(String tipo, String nombre, String fechaActivacion, int rendimiento, int capacidad){
        VehiculoRobotico vehiculo;
        
        if(tipo.equalsIgnoreCase("Transbordador")){
            vehiculo = new Transbordador(nombre, fechaActivacion, rendimiento, capacidad);
        }
        else if(tipo.equalsIgnoreCase("Ensamblador")){
            vehiculo = new Ensamblador(nombre, fechaActivacion, rendimiento, capacidad);
        }
        else{
            //este print debiera estar manejado por la vista
            //con un metodo que muestre el error
            System.out.println("Tipo de vehiculo desconocido");
            return;
        }
        gestorVehiculos.agregarVehiculo(vehiculo);
        vista.mostrarDetallesVehiculo(vehiculo);            
    }
    
    public void calculaYMostrarIncidenciaPromedioTransbordadores(){
        double promedio = gestorVehiculos.calcularIncidenciaPromedioTransbordadores();
        vista.mostrarIncidenciaPromedio(promedio);
    }
    
    public void mostrarTotalVehiculos(){
        int total = gestorVehiculos.totalVehiculos();
        vista.mostrarTotalVehiculos(total);
    }
    
}
