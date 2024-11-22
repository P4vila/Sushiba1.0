package com.example.sushiba;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // Configura el modo Edge-to-Edge
        setContentView(R.layout.activity_registro);

        // Obtén el TextView del XML de la activity registro
        TextView tvAlreadyHaveAccount = findViewById(R.id.textRegistro);

        // Configura el listener
        tvAlreadyHaveAccount.setOnClickListener(v -> {
            // Redirige al LoginActivity
            Intent intent = new Intent(RegistroActivity.this, LoginActivity.class);
            startActivity(intent);
            finish(); // Finaliza la actividad actual si no quieres volver a ella
        });

        // Configura los insets para la vista principal
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
