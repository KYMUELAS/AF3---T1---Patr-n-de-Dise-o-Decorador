// Esta es la clase base que representa un envío sin servicios adicionales
// Es el objeto que será "decorado" con servicios extras
class EnvioEstandar implements Envio {
    // Atributo privado que guarda el costo base del envío
    private double costoBase;
    
    // Constructor: inicializa el envío con un costo base
    public EnvioEstandar(double costoBase) {
        this.costoBase = costoBase;
    }
    
    // Implementación del método calcularCosto()
    // Simplemente retorna el costo base sin servicios adicionales
    @Override
    public double calcularCosto() {
        return costoBase;
    }
    
    // Implementación del método obtenerDescripcion()
    // Retorna la descripción básica del envío
    @Override
    public String obtenerDescripcion() {
        return "Envío estándar";
    }
}