// Esta clase abstracta es la base para todos los decoradores
// Implementa la interface Envio y contiene una referencia al objeto decorado
// IMPORTANTE: Esta clase "envuelve" a otro objeto Envio
abstract class DecoradorEnvio implements Envio {
    // Atributo protegido: referencia al envío que estamos decorando
    // Es "protected" para que las clases hijas puedan acceder a él
    protected Envio envioDecorado;
    
    // Constructor: recibe el envío que vamos a decorar
    public DecoradorEnvio(Envio envio) {
        this.envioDecorado = envio;
    }
    
    // Implementación por defecto de calcularCosto()
    // Simplemente delega la llamada al objeto decorado
    // Las clases hijas pueden sobrescribir este método para añadir costos
    @Override
    public double calcularCosto() {
        return envioDecorado.calcularCosto();
    }
    
    // Implementación por defecto de obtenerDescripcion()
    // Simplemente delega la llamada al objeto decorado
    // Las clases hijas pueden sobrescribir este método para añadir descripciones
    @Override
    public String obtenerDescripcion() {
        return envioDecorado.obtenerDescripcion();
    }
}

