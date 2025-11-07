public class Main {
    public static void main(String[] args) {
        System.out.println("=== CONFIGURACIÓN DE ENVÍO ===");

        // Paso 1: Crear envío base.
        Envio envio = new EnvioEstandar(50.000);
        System.out.println("Envío base creado.");
        System.out.println("Costo inicial: $" + envio.calcularCosto());
        System.out.println("Descripción: " + envio.descripcion());
        System.out.println();

        // Paso 2: Aplicar decoradores.
        envio = new SeguroDecorador(envio);
        System.out.println("Seguro añadido.");
        System.out.println("Costo actual: $" + envio.calcularCosto());
        System.out.println("Descripción: " + envio.descripcion());
        System.out.println();

        envio = new RastreoDecorador(envio);
        System.out.println("Rastreo añadido.");
        System.out.println("Costo actual: $" + envio.calcularCosto());
        System.out.println("Descripción: " + envio.descripcion());
        System.out.println();

        envio = new EntregaExpresDecorador(envio);
        System.out.println("Entrega exprés añadida.");
        System.out.println("Costo actual: $" + envio.calcularCosto());
        System.out.println("Descripción: " + envio.descripcion());
        System.out.println();

        envio = new EmbalajeEspecialDecorador(envio);
        System.out.println("Embalaje especial añadido.");
        System.out.println("Costo actual: $" + envio.calcularCosto());
        System.out.println("Descripción: " + envio.descripcion());
        System.out.println();

        // Paso 3: Mostrar resumen final.
        System.out.println("=== RESUMEN FINAL ===");
        System.out.println("Descripción completa: " + envio.descripcion());
        System.out.println("Costo total: $" + envio.calcularCosto());
    }
}