package com.example.sushiba;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.sushiba.PantallaHomeUramaki;
import com.example.sushiba.R;
import com.example.sushiba.RegistroActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //CONFIGURACIÓN PARA QUE AL PULSAR EL TEXTO DE NO TIENES CUENTA, VAYA A LA ACTIVITY REGISTRO
        TextView textRegistro = findViewById(R.id.textRegistro);

        textRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear la intención para ir a la actividad de registro
                Intent intent = new Intent(LoginActivity.this, RegistroActivity.class);
                startActivity(intent);
            }
        });


        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
        // Obtener la referencia al ImageView con el ID "imageView2"
        ImageView imageView2 = findViewById(R.id.imageView2);

        // URL directa de la imagen que queremos usar
        String imageUrl = "https://live.staticflickr.com/65535/54156304544_65b4df6fbe_w.jpg";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl) // URL de la imagen
                .into(imageView2); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE

        // AQUI EMPIEZA LA CONFIGURACION DE GLIDE
        // Obtener la referencia al ImageView con el ID "imageView20"
        ImageView imageView20 = findViewById(R.id.imageView20);

        // URL directa de la imagen que queremos usar
        String imageUrl2 = "https://live.staticflickr.com/65535/54164766056_88aa5b65f6_o.png";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this) // Usamos "this" para pasar el contexto de la actividad
                .load(imageUrl2) // URL de la imagen
                .into(imageView20); // El ImageView donde se cargará la imagen

        // AQUI TERMINA LA CONFIGURACION DE GLIDE


        // Encuentro el botón en el xml de LoginActivity
        Button btnEntrar = findViewById(R.id.btnEntrar);

        // Configuro un listener para el botón entrar
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Primero, muestra el pop-up de bienvenida
                showWelcomeDialog();
            }
        });
    }

    // Método para mostrar el pop-up de bienvenida a modo de confirmación de que el Login de usuario ha sido exitoso
    private void showWelcomeDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
        builder.setMessage("Bienvenido a Sushiba") // El mensaje del pop-up
                .setCancelable(false) // No se puede cancelar tocando fuera del cuadro de diálogo
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Después de hacer clic en "Aceptar", abre la actividad PantallaHomeUramaki
                        Intent intent = new Intent(LoginActivity.this, PantallaHomeUramaki.class);
                        startActivity(intent);
                    }
                });

        // Crear y mostrar el diálogo
        AlertDialog alert = builder.create();
        alert.show();
    }
}