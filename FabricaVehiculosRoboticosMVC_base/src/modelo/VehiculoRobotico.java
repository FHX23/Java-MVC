package modelo;

public abstract class VehiculoRobotico {
    private String nombre;
    private String fechaActivacion;

    public VehiculoRobotico(String nombre, String fechaActivacion) {
        this.setFechaActivacion(fechaActivacion);
        this.setNombre(nombre);
    }

    public VehiculoRobotico() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaActivacion(String fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaActivacion() {
        return fechaActivacion;
    }

    public abstract double calcularIncidencia();
    public abstract void imprimirDetalles();
}
