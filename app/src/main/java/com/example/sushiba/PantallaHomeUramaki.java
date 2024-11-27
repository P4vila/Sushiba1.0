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
        //COMO HABLAMOS EN CLASE, DEJAREMOS LA VISTA DEL MENÚ EN TODAS LAS ACTIVITIES QUE LO QUEREMOS USAR
        //A FALTA DE SABER IMPLEMENTAR DESPUÉS DE LOS ERRORES QUE VIMOS, VAMOS A CONFIGURAR UN LINEARLAYOUT CON BOTONES PARA NAVEGAR ENTRE LAS ACTIVITY
        //SIMULANDO UN FRAGMENT


        //LINEAR LAYOUT SUPERIOR

        // Vincula los botones del linear layout
        Button btnUramaki = findViewById(R.id.btnUramaki);
        Button btnFritos = findViewById(R.id.btnFritos);
        Button btnNigiri = findViewById(R.id.btnNigiri);

        // Establece los listeners para cada botón
        btnUramaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abre la actividad PantallaHomeUramaki
                Intent intent = new Intent(PantallaHomeUramaki.this, PantallaHomeUramaki.class);
                startActivity(intent);
            }
        });

        btnFritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abre la actividad PantallaHomeRebozados
                Intent intent = new Intent(PantallaHomeUramaki.this, PantallaHomeRebozados.class);
                startActivity(intent);
            }
        });

        btnNigiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abre la actividad PantallaHomeNigiri
                Intent intent = new Intent(PantallaHomeUramaki.this, PantallaHomeNigiri.class);
                startActivity(intent);
            }
        });

        //LINEAR LAYOUT INFERIOR

        // Referenciar los botones del layout
        Button btnHome = findViewById(R.id.btnHome);
        Button btnCarro = findViewById(R.id.btnCarro);
        Button btnInfo = findViewById(R.id.btnInfo);
        Button btnPerfil = findViewById(R.id.btnPerfil);

        // Configurar cada botón para abrir la actividad correspondiente
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaHomeUramaki.this, PantallaHomeUramaki.class);
                startActivity(intent);
            }
        });

        btnCarro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaHomeUramaki.this, mi_carrito.class);
                startActivity(intent);
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaHomeUramaki.this, soporte_ayuda.class);
                startActivity(intent);
            }
        });

        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaHomeUramaki.this, Activity_perfil.class);
                startActivity(intent);
            }
        });

        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
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


        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
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


        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
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


        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
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


        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
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


        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
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

        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
        //  LA SEPTIMA FOTO
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView18 = findViewById(R.id.imageView18);

        // URL directa de la imagen que quieras usar
        String imageUrl7 = "https://live.staticflickr.com/65535/54155143224_e21aa968d3_o.jpg";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl7) // URL de la imagen
                .into(imageView18); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE


        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
        //  LA OCTAVA FOTO
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView19 = findViewById(R.id.imageView19);

        // URL directa de la imagen que quieras usar
        String imageUrl8 = "https://live.staticflickr.com/65535/54155279445_bd8d7655e7_o.png";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl8) // URL de la imagen
                .into(imageView19); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
        //  LA PRIMERA FOTO +-
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView20 = findViewById(R.id.imageView22);

        // URL directa de la imagen que quieras usar
        String imageUrl9 = "https://live.staticflickr.com/65535/54164340641_d863fe09cf_o.png";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl9) // URL de la imagen
                .into(imageView20); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
        //  LA SEGUNDA FOTO +-
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView23 = findViewById(R.id.imageView23);

        // URL directa de la imagen que quieras usar
        String imageUrl10 = "https://live.staticflickr.com/65535/54164340641_d863fe09cf_o.png";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl10) // URL de la imagen
                .into(imageView23); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
        //  LA TERCERA FOTO +-
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView24 = findViewById(R.id.imageView24);

        // URL directa de la imagen que quieras usar
        String imageUrl11 = "https://live.staticflickr.com/65535/54164340641_d863fe09cf_o.png";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl11) // URL de la imagen
                .into(imageView24); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
        //  LA CUARTA FOTO +-
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView25 = findViewById(R.id.imageView25);

        // URL directa de la imagen que quieras usar
        String imageUrl12 = "https://live.staticflickr.com/65535/54164340641_d863fe09cf_o.png";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl12) // URL de la imagen
                .into(imageView25); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
        //  LA QUINTA FOTO +-
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView26 = findViewById(R.id.imageView26);

        // URL directa de la imagen que quieras usar
        String imageUrl13 = "https://live.staticflickr.com/65535/54164340641_d863fe09cf_o.png";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl13) // URL de la imagen
                .into(imageView26); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
        //  LA SEXTA FOTO +-
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView27 = findViewById(R.id.imageView27);

        // URL directa de la imagen que quieras usar
        String imageUrl14 = "https://live.staticflickr.com/65535/54164340641_d863fe09cf_o.png";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl14) // URL de la imagen
                .into(imageView27); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
        //  LA SEPTIMA FOTO +-
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView28 = findViewById(R.id.imageView28);

        // URL directa de la imagen que quieras usar
        String imageUrl15 = "https://live.staticflickr.com/65535/54164340641_d863fe09cf_o.png";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl15) // URL de la imagen
                .into(imageView28); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
        //  LA ULTIMA FOTO +-
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView29 = findViewById(R.id.imageView29);

        // URL directa de la imagen que quieras usar
        String imageUrl16 = "https://live.staticflickr.com/65535/54164340641_d863fe09cf_o.png";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl16) // URL de la imagen
                .into(imageView29); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE










        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
