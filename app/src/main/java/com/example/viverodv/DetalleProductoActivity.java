package com.example.viverodv;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import com.example.viverodv.model.Producto;

public class DetalleProductoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_producto);

        // TODO : Revisar el medoto deprecado
        @SuppressWarnings("deprecation")
        Producto producto = (Producto) getIntent().getSerializableExtra("producto");
        
        ImageView img = findViewById(R.id.img);
        TextView nombre = findViewById(R.id.nombre);
        TextView precio = findViewById(R.id.precio);
        TextView descripcion = findViewById(R.id.descripcion);
        Button btnAgregar = findViewById(R.id.btn_agregar);

        if (producto != null) {
            nombre.setText(producto.getNombre());
            precio.setText("$" + producto.getPrecio());
            descripcion.setText(producto.getDescripcion());

            Glide.with(this)
                    .load(producto.getUrlImagen())
                    .centerCrop()
                    .into(img);

        }
    }
}
