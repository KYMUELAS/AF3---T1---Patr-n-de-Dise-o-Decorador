// Interfaz que define el contrato común para todos los tipos de envío.
interface Envio {
    // Retorna el costo total del envío.
    double calcularCosto();

    // Retorna la descripción del envío.
    String descripcion();
}