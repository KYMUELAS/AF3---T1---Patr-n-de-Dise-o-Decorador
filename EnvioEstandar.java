// Clase base que representa un envío sin servicios adicionales.
// Es el objeto que será decorado con servicios extras.
class EnvioEstandar implements Envio {
    // Costo base del envío (sin servicios adicionales).
    private double costoBase;

    // Inicializa el envío con un costo base.
    public EnvioEstandar(double costoBase) {
        this.costoBase = costoBase;
    }

    @Override
    public double calcularCosto() {
        return costoBase;
    }

    @Override
    public String descripcion() {
        return "Envío estándar";
    }
}