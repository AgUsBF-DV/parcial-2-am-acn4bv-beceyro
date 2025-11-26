package com.example.viverodv.utils;

import com.example.viverodv.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * Singleton que gestiona el carrito de compras de la aplicación.
 */
public class GestorCarrito {

    // Instancia única del singleton
    private static final GestorCarrito instance = new GestorCarrito();
    private List<Producto> carrito;

    private GestorCarrito() {
        carrito = new ArrayList<>();
    }

    public static GestorCarrito getInstance() {
        return instance;
    }

    public void agregarProducto(Producto producto) {
        carrito.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        carrito.remove(producto);
    }

    public void limpiarCarrito() {
        carrito.clear();
    }

    public List<Producto> getCarrito() {
        return new ArrayList<>(carrito);
    }

    public double getPrecioTotal() {
        double total = 0;
        for (Producto producto : carrito) {
            total += producto.getPrecio();
        }
        return total;
    }
}
