package com.example.sushiba;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);



        /**
         * SplashActivity: Clase que representa la pantalla de bienvenida de la aplicación.
         * Se muestra al usuario al iniciar la app y permanece visible por un breve periodo antes
         * de redirigir a la pantalla de inicio de sesión (LoginActivity).
         */



        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    // Después de 2 segundos, inicia la LoginActivity
                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();  // Termina la SplashActivity para que no se pueda volver atrás
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 2000);  // 2000 ms = 2 segundos


        // Manejo de barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
