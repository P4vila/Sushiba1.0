package com.example.sushiba;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // Configura el modo Edge-to-Edge
        setContentView(R.layout.activity_registro);

        // Configurar Glide para las imágenes
        ImageView imageView20 = findViewById(R.id.imageView20);
        String imageUrl2 = "https://live.staticflickr.com/65535/54164766056_88aa5b65f6_o.png";
        Glide.with(this).load(imageUrl2).into(imageView20);

        ImageView imageView2 = findViewById(R.id.imageView2);
        String imageUrl = "https://live.staticflickr.com/65535/54156304544_65b4df6fbe_w.jpg";
        Glide.with(this).load(imageUrl).into(imageView2);

        // Configurar el TextView para redirigir al LoginActivity
        TextView tvAlreadyHaveAccount = findViewById(R.id.textRegistro);
        tvAlreadyHaveAccount.setOnClickListener(v -> {
            Intent intent = new Intent(RegistroActivity.this, LoginActivity.class);
            startActivity(intent);
            finish(); // Finaliza la actividad de registro para que el usuario no pueda regresar
        });

        // Configurar el botón de registro
        Button btnRegistrar = findViewById(R.id.btnEntrar);
        btnRegistrar.setOnClickListener(v -> {
            // Aquí puedes agregar la lógica para registrar al usuario
            // Después de registrarlo, redirige al LoginActivity
            Intent intent = new Intent(RegistroActivity.this, LoginActivity.class);
            startActivity(intent);
            finish(); // Finaliza la actividad actual
        });

        // Configuración de padding para el sistema de barras
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
