package com.example.viverodv;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

/**
 * Activity principal / HOME de la aplicación.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los botones de navegación
        Button btnCatalogo = findViewById(R.id.btn_catalogo);
        Button btnCarrito = findViewById(R.id.btn_carrito);

        // Botón para navegar al catálogo de productos
        btnCatalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CatalogoActivity.class);
                startActivity(intent);
            }
        });

        // Botón para navegar al carrito de compras
        btnCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CarritoActivity.class);
                startActivity(intent);
            }
        });
    }
}