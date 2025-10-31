// Esta es la interface que define el "contrato" que deben cumplir
// todos los envíos (tanto el estándar como los decorados)
interface Envio {
    // Método para calcular el costo total del envío
    double calcularCosto();
    
    // Método para obtener la descripción completa del envío
    String obtenerDescripcion();
}

