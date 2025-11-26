# Informe: Vivero Da Vinci - App de Ventas Online

## Resumen

En el **Parcial 1** se presentó una propuesta de sistema de gestión interna para el vivero. Para el **Parcial 2**, se decidió cambiar el enfoque hacia un **sistema de ventas online** orientado al cliente final.

**Motivación:** El sistema de gestión interno propuesto originalmente era limitado al no tener una base de datos para implementación de *CRUDs*. Un sistema de ventas online permite:

1. Implementar navegación entre múltiples activities con diferentes propósitos.
2. Enviar objetos **Producto** entre pantallas usando *Intents* y *Serializable*
3. Implementar un carrito de compras con patrón *Singleton*.
4. Cargar imágenes desde URLs y generar vistas dinámicamente.

## Objetivo

Desarrollar una aplicación Android para la venta de productos de vivero. La aplicación permite a los usuarios navegar por el catálogo de plantas, ver detalles de productos, agregar items al carrito de compras y gestionar sus compras.

## Pantallas de la Aplicación

La aplicación cuenta con las singuientes pantallasÑ

- **Pantalla de Inicio** (`MainActivity`): Es el punto de entrada de la aplicación. Direcciona el flujo a otras pantallas.
- **Catálogo de Productos** (`CatalogoActivity`): Muestra la lista de productos disponibles con imágenes desde URLs. Al acceder a "Ver más" se accede a otro activity con el detalle de cada producto.
- **Detalle del Producto** (`DetalleProductoActivity`): Muestra información completa del producto. Recibe el objeto `Producto` por Intent usando *Serializable*. Permite agregar el producto al carrito.
- **Carrito de Compras** (`CarritoActivity`): Visualiza productos agregados usando el singleton `GestorCarrito`. Permite eliminar items individuales, vaciar el carrito completo y proceder al pago. Actualiza la vista dinámicamente.
- **Sección de Pago** (`PagoActivity`): Mock para futura implementación del proceso de pago.

## Implementación

Entre otras cosas, se incorporó:

- El patrón *Singleton* para la gestión del carrito de compras (`GestorCarrito`).
- El modelo de `Producto` implementa `Serializable` para permitir el pasaje del objeto entre Activities.
- Múltiples pantallas con navegación funcional por medio de `Intent`.
- Comportamiento dinámico y reactivo usando contenido real como las imágenes cargadas desde *Unsplash*.
- Uso de `ConstraintLayout`, `LinearLayout` (vertical/horizontal) y `ScrollView` según la funcionalidad requerida en cada caso.
- Uso extensivo de `TextView`, `ImageView` y `Button` con eventos `onClick` en todos los elementos interactivos.
- Recursos organizados apropiadamente (`Model`, `Utils`, `res/layout`, parámetros en la carpeta `res/values`).
