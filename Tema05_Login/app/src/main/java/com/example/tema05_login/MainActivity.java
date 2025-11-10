package com.example.tema05_login;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText tCorreo;
    private EditText tContrasena;
    private Button bContinuar;
    private Switch sRecordar;
    private TextView tvMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Asegúrate de que los IDs coincidan con los del XML
        tCorreo = findViewById(R.id.etCorreo);
        tContrasena = findViewById(R.id.etContraseña); // sin ñ para evitar errores
        bContinuar = findViewById(R.id.bContinuar);
        sRecordar = findViewById(R.id.sRecordar);
        tvMensaje = findViewById(R.id.tvMensaje);

        bContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String correo = tCorreo.getText().toString().trim();
                String contrasena = tContrasena.getText().toString().trim();
                boolean recordar = sRecordar.isChecked();

                if (correo.equals("correo@correo.com") && contrasena.equals("123")) {
                    tvMensaje.setText("Usuario y contraseña correctos");
                    tvMensaje.setTextColor(Color.GREEN);
                } else {
                    tvMensaje.setText("Usuario y/o contraseña incorrectos");
                    tvMensaje.setTextColor(Color.RED);
                }
            }
        });
    }
}
