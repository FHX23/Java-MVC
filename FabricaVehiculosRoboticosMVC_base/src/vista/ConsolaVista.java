package vista;

import modelo.*;

public class ConsolaVista {
    public void mostrarDetallesVehiculo(VehiculoRobotico vehiculo){
        vehiculo.imprimirDetalles();
    }
    
    public void mostrarIncidenciaPromedio(double incidenciaPromedio){
        System.out.println("Incidencia Promedio de Transbordadores "+ incidenciaPromedio);
    }
    
    public void mostrarTotalVehiculos(int total){
        System.out.println("Total Vehiculos Registrados: " + total);
    }
}
