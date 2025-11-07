# AF3---T1---Patr-n-de-Dise-o-Decorador
Patrón de Diseño Decorador

Explicación del problema: Se requiere un sistema de envíos que permita añadir servicios adicionales como seguro, rastreo, entrega exprés o embalaje especial. Estos servicios deben poder agregarse sin modificar la clase base del envío, manteniendo el código flexible y extensible.

Explicación de la solución: Se aplica el patrón de diseño Decorador. Este patrón permite envolver un objeto base con múltiples capas de decoradores, cada uno añadiendo una funcionalidad específica. Así, se pueden combinar servicios dinámicamente sin alterar la estructura original del envío.
