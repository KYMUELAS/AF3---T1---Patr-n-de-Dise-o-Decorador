public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Envíos con Servicios Adicionales ===\n");
        
        // Ejemplo 1: Envío estándar sin servicios adicionales
        Envio envio1 = new EnvioEstandar(50.000);
        System.out.println("Ejemplo 1:");
        System.out.println("Descripción: " + envio1.obtenerDescripcion());
        System.out.println("Costo total: $" + envio1.calcularCosto());
        System.out.println();
        
        // Ejemplo 2: Envío con seguro y rastreo
        Envio envio2 = new EnvioEstandar(50.000);
        envio2 = new SeguroDecorador(envio2);
        envio2 = new RastreoDecorador(envio2);
        System.out.println("Ejemplo 2:");
        System.out.println("Descripción: " + envio2.obtenerDescripcion());
        System.out.println("Costo total: $" + envio2.calcularCosto());
        System.out.println();
        
        // Ejemplo 3: Envío con todos los servicios
        Envio envio3 = new EnvioEstandar(50.000);
        envio3 = new SeguroDecorador(envio3);
        envio3 = new RastreoDecorador(envio3);
        envio3 = new EntregaExpresDecorador(envio3);
        envio3 = new EmbalajeEspecialDecorador(envio3);
        System.out.println("Ejemplo 3:");
        System.out.println("Descripción: " + envio3.obtenerDescripcion());
        System.out.println("Costo total: $" + envio3.calcularCosto());
        System.out.println();
        
        // Ejemplo 4: Solo entrega exprés
        Envio envio4 = new EnvioEstandar(50.000);
        envio4 = new EntregaExpresDecorador(envio4);
        System.out.println("Ejemplo 4:");
        System.out.println("Descripción: " + envio4.obtenerDescripcion());
        System.out.println("Costo total: $" + envio4.calcularCosto());
    }
}

