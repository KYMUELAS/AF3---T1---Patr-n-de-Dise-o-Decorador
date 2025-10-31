//Añade el servicio de rastreo al envío
class RastreoDecorador extends DecoradorEnvio {
    // Constante: define el costo adicional del rastreo
    private static final double COSTO_RASTREO = 5.000;

    // Constructor: recibe el envío a decorar
    public RastreoDecorador(Envio envio) {
        super(envio);
    }

    // Añade el costo del rastreo al costo total
    @Override
    public double calcularCosto() {
        return super.calcularCosto() + COSTO_RASTREO;
    }

    // Añade el rastreo a la descripción
    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + " + Rastreo";
    }
}
