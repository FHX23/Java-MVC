package modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorVehiculos {
    private List<VehiculoRobotico> vehiculos;

    public GestorVehiculos(){
        vehiculos = new ArrayList<>();
    }
    public void agregarVehiculo(VehiculoRobotico vehiculo) {
        for (VehiculoRobotico v : vehiculos) {
            if (v.getNombre().equals(vehiculo.getNombre())) {
                throw new IllegalArgumentException("Error: Ya existe un vehículo con el nombre " + vehiculo.getNombre());
                //System.out.println("Error: Ya existe un vehículo con el nombre " + vehiculo.getNombre());
            }
        }
        vehiculos.add(vehiculo);
    }

    public double calcularIncidenciaPromedioTransbordadores() {
        double totalIncidencia = 0;
        int count = 0;

        for (VehiculoRobotico vehiculo : vehiculos) {
            if (vehiculo instanceof Transbordador) {
                totalIncidencia += vehiculo.calcularIncidencia();
                count++;
            }
        }
        if(count > 0)
            return (totalIncidencia / count);
        else
            return 0;
        //return count > 0 ? totalIncidencia / count : 0;
    }

    public int totalVehiculos() {
        return vehiculos.size();
    }
}
