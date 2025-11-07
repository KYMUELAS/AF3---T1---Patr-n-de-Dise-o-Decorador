// Este decorador añade el servicio de seguro al envío
// Decorador que añade el servicio de seguro al envío.
class SeguroDecorador extends DecoradorEnvio {
    // Costo adicional por seguro.
    private static final double COSTO_SEGURO = 15.000;

    // Inicializa el decorador con el envío base.
    public SeguroDecorador(Envio envio) {
        super(envio);
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + COSTO_SEGURO;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " + Seguro";
    }
}