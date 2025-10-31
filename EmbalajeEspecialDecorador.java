// Añade el servicio de embalaje especial al envío
class EmbalajeEspecialDecorador extends DecoradorEnvio {
    // Constante: define el costo adicional del embalaje especial
    private static final double COSTO_EMBALAJE = 10.000;
    
    // Constructor: recibe el envío a decorar
    public EmbalajeEspecialDecorador(Envio envio) {
        super(envio);
    }
    
    // Añade el costo del embalaje especial al costo total
    @Override
    public double calcularCosto() {
        return super.calcularCosto() + COSTO_EMBALAJE;
    }
    
    // Añade el embalaje especial a la descripción
    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + " + Embalaje especial";
    }
}

