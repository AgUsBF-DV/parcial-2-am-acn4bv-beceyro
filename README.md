# 🌿 Vivero Da Vinci - Sistema de Ventas Online

## 💡 Motivación

Este desarrollo es un proyecto académico dentro de la materia **Aplicaciones Móviles** de la carrera **Analista de Sistemas** de la **Escuela Da Vinci**.

## 🎯 Objetivo

Desarrollar una aplicación Android para la venta de productos de vivero. La aplicación permite a los usuarios navegar por el catálogo de plantas, ver detalles de productos, agregar items al carrito de compras y gestionar sus compras.

Para más detalles sobre el diseño y flujo de la aplicación, ver el [informe técnico](./docs/informe.md).

## 🛠️ Tecnologías

- **Lenguaje:** Java 11
- **Framework:** Android SDK
- **Build System:** Gradle 8.13
- **Versión mínima de Android:** 7.1 (API 25)
- **Versión objetivo:** Android 14 (API 36)
- **Librerías:**
  - Glide 4.16.0 (carga de imágenes)
  - Material Components
  - AndroidX ConstraintLayout
  - CardView
- **Entorno de desarrollo:** Android Studio
- **Emulado:** Pixel XL / Samsung S7 (pantalla: 2560 x 1440)

## 📂 Estructura del Proyecto

```bash
app/src/main/
├── java/com/example/viverodv/
│   ├── MainActivity.java
│   ├── CatalogoActivity.java
│   ├── DetalleProductoActivity.java
│   ├── CarritoActivity.java
│   ├── PagoActivity.java
│   ├── model/
│   │   └── Producto.java
│   └── utils/
│       └── GestorCarrito.java
├── res/
│   ├── layout/
│   │   ├── activity_main.xml
│   │   ├── activity_catalogo.xml
│   │   ├── activity_detalle_producto.xml
│   │   ├── activity_carrito.xml
│   │   ├── activity_pago.xml
│   │   ├── layout_base_header.xml (template reutilizable)
│   │   ├── card_producto.xml
│   │   └── card_carrito.xml
│   ├── values/
│   │   ├── strings.xml
│   │   ├── colors.xml
│   │   └── dimens.xml
│   └── mipmap/
└── AndroidManifest.xml
```

## 📄 Licencia

Este proyecto es parte del trabajo académico de la Escuela Da Vinci y se comparte bajo **GNU-GPL V3**.
