// Decorador que añade el servicio de entrega exprés al envío.
class EntregaExpresDecorador extends DecoradorEnvio {
    // Costo adicional por entrega exprés.
    private static final double COSTO_EXPRES = 25.000;

    // Inicializa el decorador con el envío base.
    public EntregaExpresDecorador(Envio envio) {
        super(envio);
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + COSTO_EXPRES;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " + Entrega exprés";
    }
}