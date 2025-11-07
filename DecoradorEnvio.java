// Clase abstracta base para decoradores de Envio.
// Implementa la interfaz Envio y delega comportamiento al objeto decorado.
abstract class DecoradorEnvio implements Envio {
    // Objeto Envio decorado (encapsulado).
    private Envio envioDecorado;

    // Inicializa el decorador con el envío base.
    public DecoradorEnvio(Envio envio) {
        this.envioDecorado = envio;
    }

    // Acceso controlado al objeto decorado (sin prefijo "get").
    protected Envio envioDecorado() {
        return envioDecorado;
    }

    @Override
    public double calcularCosto() {
        return envioDecorado.calcularCosto();
    }

    @Override
    public String descripcion() {
        return envioDecorado.descripcion();
    }
}