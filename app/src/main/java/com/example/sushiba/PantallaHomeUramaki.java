package com.example.sushiba;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.example.sushiba.Activity_perfil;
import com.example.sushiba.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PantallaHomeUramaki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pantalla_home_uramaki);

     //   MENÚ DE NAVEGACIÓN
            BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        // PREGUNTAR JUAN COMO ASOCIAR ITEMS DEL MENU NAV A LAS ACTIVITIES

        //  LA PRIMERA FOTO
        // Obtener la referencia al ImageView con el ID "imageView2"
            ImageView imageView12 = findViewById(R.id.imageView12);

        // URL directa de la imagen que quieras usar
             String imageUrl = "https://live.staticflickr.com/65535/54154818646_c2218aef4f_z.jpg";

        // Usar Glide para cargar la imagen en el ImageView
             Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                     .load(imageUrl) // URL de la imagen
                     .into(imageView12); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        // LA SEGUNDA FOTO
        // Obtener la referencia al ImageView con el ID "imageView2"
            ImageView imageView13 = findViewById(R.id.imageView13);

        // URL directa de la imagen que quieras usar
             String imageUrl2 = "https://live.staticflickr.com/65535/54154818641_34f04f4aef_z.jpg";

        // Usar Glide para cargar la imagen en el ImageView
              Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                      .load(imageUrl2) // URL de la imagen
                      .into(imageView13); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        //  LA TERCERA FOTO
        // Obtener la referencia al ImageView con el ID "imageView2"
              ImageView imageView14 = findViewById(R.id.imageView14);

        // URL directa de la imagen que quieras usar
             String imageUrl3 = "https://live.staticflickr.com/65535/54155105448_24c288259d_c.jpg";

        // Usar Glide para cargar la imagen en el ImageView
              Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                      .load(imageUrl3) // URL de la imagen
                     .into(imageView14); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        //  LA CUARTA FOTO
        // Obtener la referencia al ImageView con el ID "imageView2"
             ImageView imageView15 = findViewById(R.id.imageView15);

        // URL directa de la imagen que quieras usar
             String imageUrl4 = "https://live.staticflickr.com/65535/54155105488_7d478d6257.jpg";

        // Usar Glide para cargar la imagen en el ImageView
             Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                       .load(imageUrl4) // URL de la imagen
                      .into(imageView15); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        //  LA QUINTA FOTO
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView16 = findViewById(R.id.imageView16);

        // URL directa de la imagen que quieras usar
        String imageUrl5 = "https://live.staticflickr.com/65535/54155105453_f446209661_b.jpg";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl5) // URL de la imagen
                .into(imageView16); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        //  LA SEXTA FOTO
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView17 = findViewById(R.id.imageView17);

        // URL directa de la imagen que quieras usar
        String imageUrl6 = "https://live.staticflickr.com/65535/54155143219_6b2be821cb_c.jpg";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl6) // URL de la imagen
                .into(imageView17); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE









        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
