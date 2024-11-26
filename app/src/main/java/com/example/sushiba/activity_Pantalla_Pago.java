package com.example.sushiba;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;




public class activity_Pantalla_Pago extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pantalla_pago);

        // Vincula el botón
        Button btnConfirmarPago = findViewById(R.id.btn_confirmar_pago);

        // Establece el listener para el botón
        btnConfirmarPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear el AlertDialog
                new AlertDialog.Builder(activity_Pantalla_Pago.this)
                        .setTitle("Confirmación de Pago") // Título del pop-up
                        .setMessage("Su pago se procesará tras la toma de datos.") // Mensaje del pop-up
                        .setPositiveButton("Aceptar", null) // Botón de aceptación (sin acción adicional)
                        .show(); // Mostrar el pop-up
            }
        });






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });



    }


    }
