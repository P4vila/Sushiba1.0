package com.example.sushiba;


import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
        // Establecer el listener para manejar la navegación



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
