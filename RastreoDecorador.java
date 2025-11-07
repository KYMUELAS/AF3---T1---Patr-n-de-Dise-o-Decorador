// Decorador que añade el servicio de rastreo al envío.
class RastreoDecorador extends DecoradorEnvio {
    // Costo adicional por rastreo.
    private static final double COSTO_RASTREO = 5.000;

    // Inicializa el decorador con el envío base.
    public RastreoDecorador(Envio envio) {
        super(envio);
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + COSTO_RASTREO;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " + Rastreo";
    }
}
