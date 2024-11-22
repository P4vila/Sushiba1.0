package com.example.sushiba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView2 = findViewById(R.id.imageView2);

        // URL directa de la imagen que quieras usar
        String imageUrl = "https://live.staticflickr.com/65535/54156304544_65b4df6fbe_w.jpg";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl) // URL de la imagen
                .into(imageView2); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        // Encuentro el botón en el xml de LoginActivity
        Button btnEntrar = findViewById(R.id.btnEntrar);

        // Configuro un listener para el botón
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para abrir la nueva actividad PantallaHomeUramaki
                Intent intent = new Intent(LoginActivity.this, PantallaHomeUramaki.class);
                startActivity(intent);
            }
        });
    }
}
