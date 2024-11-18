package modelo;

public class Ensamblador extends VehiculoRobotico implements FactoresIncidencia{
    private int ensamblajesCompletados;
    private double precision;

    public Ensamblador(String nombre, String fechaActivacion, int ensamblajesCompletados, double precision) {
        super(nombre, fechaActivacion);
        this.setEnsamblajesCompletados(ensamblajesCompletados);
        this.setPrecision(precision);
    }

    public int getEnsamblajesCompletados() {
        return ensamblajesCompletados;
    }

    public void setEnsamblajesCompletados(int ensamblajesCompletados) {
        this.ensamblajesCompletados = ensamblajesCompletados;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    @Override
    public double calcularIncidencia() {
        return ensamblajesCompletados * FACTOR_ENSAMBLADO + precision * FACTOR_PRECISION;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Ensamblador: " + getNombre());
        System.out.println("Fecha de Activación: " + getFechaActivacion());
        System.out.println("Ensamblajes Completados: " + ensamblajesCompletados);
        System.out.println("Precisión: " + precision);
        System.out.println("Incidencia: " + calcularIncidencia());
    }
}
