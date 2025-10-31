// Este decorador añade el servicio de seguro al envío
class SeguroDecorador extends DecoradorEnvio {
    // Constante: define el costo adicional del seguro
    private static final double COSTO_SEGURO = 15.000;
    
    // Constructor: recibe el envío a decorar y lo pasa al constructor padre
    public SeguroDecorador(Envio envio) {
        super(envio); // Llama al constructor de DecoradorEnvio
    }
    
    // Sobrescribe calcularCosto() para añadir el costo del seguro
    // Primero obtiene el costo del envío decorado y luego suma el costo del seguro
    @Override
    public double calcularCosto() {
        return super.calcularCosto() + COSTO_SEGURO;
    }
    
    // Sobrescribe obtenerDescripcion() para añadir el seguro a la descripción
    // Primero obtiene la descripción del envío decorado y luego añade el seguro
    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + " + Seguro";
    }
}