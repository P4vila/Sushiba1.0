package com.example.sushiba;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class soporte_ayuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_soporte_ayuda);


        // Referenciar el botón
        Button btnAyudaAMesa = findViewById(R.id.btnmaestro);


        // Asignar el listener al botón
        btnAyudaAMesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear el AlertDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(soporte_ayuda.this);
                builder.setTitle("¡Ayuda en Camino!");
                builder.setMessage("Uno de nuestros Maestros sushi vendrá a ayudarte.");
                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss(); // Cerrar el diálogo
                    }
                });

                // Mostrar el diálogo
                builder.show();
            }
        });



        // Vincula el botón
        Button btnPagarTotal = findViewById(R.id.btn_pagar_total);

        // Establece el listener para el botón
        btnPagarTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia la actividad PantallaPago
                Intent intent = new Intent(soporte_ayuda.this, activity_Pantalla_Pago.class);
                startActivity(intent);
            }
        });






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // IMAGEN DE LOGO SIN FONDO CON EL GLIDE IMPLEMENTADO- IMAGEN DE ICON EN SOPORTE Y AYUDA
        ImageView imageView12 = findViewById(R.id.imageView12);
        String imageUrl12 = "https://live.staticflickr.com/65535/54156304544_65b4df6fbe_q.jpg";
        Glide.with(this)
                .load(imageUrl12)
                .into(imageView12);
    }
}