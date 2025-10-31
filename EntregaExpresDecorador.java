// Este decorador añade el servicio de entrega exprés al envío
class EntregaExpresDecorador extends DecoradorEnvio {
    // Constante: define el costo adicional de la entrega exprés
    private static final double COSTO_EXPRES = 25.000;
    
    // Constructor: recibe el envío a decorar
    public EntregaExpresDecorador(Envio envio) {
        super(envio);
    }
    
    // Añade el costo de la entrega exprés al costo total
    @Override
    public double calcularCosto() {
        return super.calcularCosto() + COSTO_EXPRES;
    }
    
    // Añade la entrega exprés a la descripción
    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + " + Entrega exprés";
    }
}
