package com.example.sushiba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class mi_carrito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mi_carrito);




        // FOTO DE ICONO DE ELIMINAR PARTE DEL ACTIVITY DEL CARRITO- RECTANGULO 1
        ImageView imageView24 = findViewById(R.id.imageView24);
        String imageUrl24 = "https://live.staticflickr.com/65535/54165303875_404c5f5a54_q.jpg";
        Glide.with(this)
                .load(imageUrl24)
                .into(imageView24);

        // FOTO DE ICONO DE ELIMINAR PARTE DEL ACTIVITY DEL CARRITO- RECTANGULO 2
        ImageView imageView25 = findViewById(R.id.imageView25);
        String imageUrl25 = "https://live.staticflickr.com/65535/54165303875_404c5f5a54_q.jpg";
        Glide.with(this)
                .load(imageUrl25)
                .into(imageView25);


        //FOTO DE ICONO DE ELIMINAR PARTE DEL ACTIVITY DEL CARRITO- RECTANGULO 3
        ImageView imageView26 = findViewById(R.id.imageView26);
        String imageUrl26 = "https://live.staticflickr.com/65535/54165303875_404c5f5a54_q.jpg";
        Glide.with(this)
                .load(imageUrl26)
                .into(imageView26);

        // A CONTINUACION, LAS IMAGENES DE LOS PLATOS PEDIDOS- ACTIVITY ( MI CARRITO )

        //FOTO DE NIGIRI POLLO FLAMEADO
        ImageView imageView21 = findViewById(R.id.imageView21);
        String imageUrl21 = "https://live.staticflickr.com/65535/54155276830_68ea2c18fb_o.jpg";
        Glide.with(this)
                .load(imageUrl21)
                .into(imageView21);

        // FOTO DE GYOSAS DE VERDURAS
        ImageView imageView22 = findViewById(R.id.imageView22);
        String imageUrl22 = "https://live.staticflickr.com/65535/54154819606_c38255479d_o.jpg";
        Glide.with(this)
                .load(imageUrl22)
                .into(imageView22);

        //FOTO DE URAMAKI AYOCADO SURIMI
        ImageView imageView23 = findViewById(R.id.imageView23);
        String imageUrl23 = "https://live.staticflickr.com/65535/54155105453_979bb76b6d_o.jpg";
        Glide.with(this)
                .load(imageUrl23)
                .into(imageView23);

        // Vincula el botón
        Button btnPagarTotal = findViewById(R.id.btn_pagar_total);

        // Establece el listener para el botón
        btnPagarTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia la actividad PantallaPago
                Intent intent = new Intent(mi_carrito.this, activity_Pantalla_Pago.class);
                startActivity(intent);
            }
        });






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}