public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  SISTEMA DE ENVIOS - PATRON DECORATOR");
        System.out.println("========================================\n");
        
        // Costo base del envío
        double costoBase = 50.000;
        
        // Crear envío estándar
        System.out.println(">>> Creando envío estándar...");
        Envio miEnvio = new EnvioEstandar(costoBase);
        System.out.println("Envío inicial creado.");
        System.out.println("Costo base: $" + miEnvio.calcularCosto());
        System.out.println("Descripción: " + miEnvio.obtenerDescripcion());
        System.out.println();
        
        // Agregar servicios adicionales según las necesidades del cliente
        System.out.println(">>> Agregando servicios adicionales...\n");
        
        // Agregar seguro
        System.out.println("1. Añadiendo seguro al envío...");
        miEnvio = new SeguroDecorador(miEnvio);
        System.out.println("   Costo actual: $" + miEnvio.calcularCosto());
        System.out.println("   Descripción: " + miEnvio.obtenerDescripcion());
        System.out.println();
        
        // Agregar rastreo
        System.out.println("2. Añadiendo rastreo al envío...");
        miEnvio = new RastreoDecorador(miEnvio);
        System.out.println("   Costo actual: $" + miEnvio.calcularCosto());
        System.out.println("   Descripción: " + miEnvio.obtenerDescripcion());
        System.out.println();
        
        // Agregar entrega exprés
        System.out.println("3. Añadiendo entrega exprés al envío...");
        miEnvio = new EntregaExpresDecorador(miEnvio);
        System.out.println("   Costo actual: $" + miEnvio.calcularCosto());
        System.out.println("   Descripción: " + miEnvio.obtenerDescripcion());
        System.out.println();
        
        // Agregar embalaje especial
        System.out.println("4. Añadiendo embalaje especial al envío...");
        miEnvio = new EmbalajeEspecialDecorador(miEnvio);
        System.out.println("   Costo actual: $" + miEnvio.calcularCosto());
        System.out.println("   Descripción: " + miEnvio.obtenerDescripcion());
        System.out.println();
        
        // Resumen final
        System.out.println("========================================");
        System.out.println("           RESUMEN DEL ENVIO");
        System.out.println("========================================");
        System.out.println("Descripción completa:");
        System.out.println(miEnvio.obtenerDescripcion());
        System.out.println();
        System.out.println("Desglose de costos:");
        System.out.println("  - Envío base:        $50.000");
        System.out.println("  - Seguro:            $15.000");
        System.out.println("  - Rastreo:           $ 5.000");
        System.out.println("  - Entrega exprés:    $25.000");
        System.out.println("  - Embalaje especial: $10.000");
        System.out.println("                       -------");
        System.out.println("  TOTAL A PAGAR:       $" + miEnvio.calcularCosto());
        System.out.println("========================================");
    }
}