package com.example.viverodv;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.LayoutInflater;
import com.example.viverodv.model.Producto;
import com.example.viverodv.utils.GestorCarrito;
import java.util.List;

public class CarritoActivity extends AppCompatActivity {

    private LinearLayout contenedor;
    private TextView precioText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        contenedor = findViewById(R.id.contenedor_carrito);
        precioText = findViewById(R.id.precio_total);
        Button btnVaciarCarrito = findViewById(R.id.btn_vaciar_carrito);
        Button btnIrAPago = findViewById(R.id.btn_ir_a_pago);

        actualizarCarrito();

        btnIrAPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarritoActivity.this, PagoActivity.class);
                startActivity(intent);
            }
        });

        btnVaciarCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GestorCarrito.getInstance().limpiarCarrito();
                actualizarCarrito();
                Toast.makeText(CarritoActivity.this, R.string.mje_carrito_vaciado, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void actualizarCarrito() {

        contenedor.removeAllViews();

        List<Producto> carrito = GestorCarrito.getInstance().getCarrito();
        double total = GestorCarrito.getInstance().getPrecioTotal();

        precioText.setText(getString(R.string.total) + " $" + total);

        for (final Producto producto : carrito) {
            View view = LayoutInflater.from(this).inflate(R.layout.card_carrito, contenedor, false);

            ImageView img = view.findViewById(R.id.img);
            TextView nombre = view.findViewById(R.id.nombre);
            TextView precio = view.findViewById(R.id.precio);
            Button btnEliminarItem = view.findViewById(R.id.btn_eliminar_item);

            nombre.setText(producto.getNombre());
            precio.setText("$" + producto.getPrecio());

            Glide.with(this)
                    .load(producto.getUrlImagen())
                    .fitCenter()
                    .into(img);

            btnEliminarItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    GestorCarrito.getInstance().eliminarProducto(producto);
                    actualizarCarrito();
                    Toast.makeText(CarritoActivity.this, R.string.mje_producto_eliminado, Toast.LENGTH_SHORT).show();
                }
            });

            contenedor.addView(view);
        }
    }
}