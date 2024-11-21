package com.example.sushiba;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);


        //AQUI EMPIEZA LA CONFIGURACION DE GLIDE


        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView2 = findViewById(R.id.imageView2);

        // URL directa de la imagen que quieras usar
        String imageUrl = "https://live.staticflickr.com/65535/54156304544_65b4df6fbe_w.jpg";  // Reemplaza con la URL directa de la imagen

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this)  // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl) // URL de la imagen
                .into(imageView2); // El ImageView donde se cargará la imagen , osea el +@id de tu imageView

        //AQUI TERMINA  LA CONFIGURACION DE GLIDE



    }
}