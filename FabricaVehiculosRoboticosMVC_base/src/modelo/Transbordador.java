package modelo;

public class Transbordador extends VehiculoRobotico implements FactoresIncidencia{
    private int entregasRealizadas;
    private double capacidadCarga;

    public Transbordador() {
    }

    public Transbordador(String nombre, String fechaActivacion, int entregasRealizadas, double capacidadCarga) {
        super(nombre, fechaActivacion);
        this.setCapacidadCarga(capacidadCarga);
        this.setEntregasRealizadas(entregasRealizadas);
    }

    public int getEntregasRealizadas() {
        return entregasRealizadas;
    }

    public void setEntregasRealizadas(int entregasRealizadas) {
        this.entregasRealizadas = entregasRealizadas;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularIncidencia() {
        return entregasRealizadas * FACTOR_ENTREGAS + capacidadCarga * FACTOR_CARGA;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Transbordador: " + getNombre());
        System.out.println("Fecha de Activación: " + getFechaActivacion());
        System.out.println("Entregas Realizadas: " + entregasRealizadas);
        System.out.println("Capacidad de Carga: " + capacidadCarga);
        System.out.println("Incidencia: " + calcularIncidencia());
    }
}
