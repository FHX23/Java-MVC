package fabricavehiculosroboticosmvc_base;
import controlador.*;
import vista.*;
import modelo.*;

public class FabricaVehiculosRoboticosMVC {

    public static void main(String[] args) {
        ConsolaVista vista = new ConsolaVista();
        GestorVehiculos gestor = new GestorVehiculos();
        VehiculosControlador controlador = new VehiculosControlador(gestor, vista);
    
        //agregar vehiculos
        controlador.agregarVehiculo("Transbordador", "T1", "2024-11-11", 30, 50);
        controlador.agregarVehiculo("Transbordador", "T2", "2023-11-11", 45, 600);
        controlador.agregarVehiculo("Ensamblador", "E1", "2022-11-11", 25, 95);
        controlador.agregarVehiculo("Transbordador", "T3", "2024-11-11", 10, 500);
        controlador.agregarVehiculo("Transbordador", "T4", "2023-11-11", 20, 60);
        controlador.agregarVehiculo("Ensamblador", "E2", "2022-11-11", 15, 950);        
    
    
        controlador.calculaYMostrarIncidenciaPromedioTransbordadores();
        controlador.mostrarTotalVehiculos();
    
    }
    
}
