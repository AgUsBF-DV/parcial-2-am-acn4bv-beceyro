package com.example.viverodv;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.LayoutInflater;
import com.bumptech.glide.Glide;
import com.example.viverodv.model.Producto;
import java.util.ArrayList;
import java.util.List;

public class CatalogoActivity extends AppCompatActivity {

    private LinearLayout contenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        contenedor = findViewById(R.id.contenedor_catalogo);

        List<Producto> catalogo = getCatalogo();
        for (Producto producto : catalogo) {
            addProductView(producto);
        }
    }

    private List<Producto> getCatalogo() {

        List<Producto> catalogo = new ArrayList<>();

        catalogo.add(
                new Producto(
                        "1",
                        "Planta Variedad 1",
                        4100.0,
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                        "https://images.unsplash.com/photo-1614594975525-e45190c55d0b?q=80&w=928&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));
        catalogo.add(
                new Producto(
                        "2",
                        "Planta Variedad 2",
                        5200.0,
                        "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                        "https://images.unsplash.com/photo-1614594895304-fe7116ac3b58?q=80&w=928&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));
        catalogo.add(
                new Producto(
                        "3",
                        "Planta Variedad 3",
                        5300.0,
                        "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                        "https://images.unsplash.com/photo-1693840402250-9f91e1163f62?q=80&w=774&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));
        catalogo.add(
                new Producto(
                        "4",
                        "Planta Variedad 4",
                        6400.0,
                        "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                        "https://images.unsplash.com/photo-1658017082967-174456018e7d?q=80&w=1740&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));
        catalogo.add(
                new Producto(
                        "5",
                        "Planta Variedad 5",
                        7500.0,
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                        "https://images.unsplash.com/photo-1509423350716-97f9360b4e09?q=80&w=870&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));
        catalogo.add(
                new Producto(
                        "6",
                        "Planta Variedad 6",
                        8600.0,
                        "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                        "https://images.unsplash.com/photo-1519336056116-bc0f1771dec8?q=80&w=774&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));

        return catalogo;
    }

    private void addProductView(final Producto producto) {

        View view = LayoutInflater.from(this).inflate(R.layout.card_producto, contenedor, false);

        ImageView img = view.findViewById(R.id.img_producto);
        TextView nombre = view.findViewById(R.id.nombre_producto);
        TextView precio = view.findViewById(R.id.precio_producto);
        Button btnVerMas = view.findViewById(R.id.btn_ver_mas);

        nombre.setText(producto.getNombre());
        precio.setText("$" + producto.getPrecio());

        Glide.with(this)
                .load(producto.getUrlImagen())
                .fitCenter()
                .into(img);

        btnVerMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatalogoActivity.this, DetalleProductoActivity.class);
                intent.putExtra("producto", producto);
                // intent.putExtra("producto_id", producto.getId());
                startActivity(intent);
            }
        });

        contenedor.addView(view);
    }
}