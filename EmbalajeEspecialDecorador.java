// Decorador que añade el servicio de embalaje especial al envío.
class EmbalajeEspecialDecorador extends DecoradorEnvio {
    // Costo adicional por embalaje especial.
    private static final double COSTO_EMBALAJE = 10.000;

    // Inicializa el decorador con el envío base.
    public EmbalajeEspecialDecorador(Envio envio) {
        super(envio);
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + COSTO_EMBALAJE;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " + Embalaje especial";
    }
}
