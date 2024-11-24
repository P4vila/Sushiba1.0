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
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    Intent homeIntent = new Intent(PantallaHomeUramaki.this, PantallaHomeUramaki.class);
                    startActivity(homeIntent);
                    return true;

                case R.id.carro:
                    // Manejar clic en "Cart"
                    return true;

                case R.id.info:
                    // Manejar clic en "Info"
                    return true;

                case R.id.nav_profile:
                    Intent profileIntent = new Intent(PantallaHomeUramaki.this, Activity_perfil.class);
                    startActivity(profileIntent);
                    return true;

                default:
                    return false;
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
