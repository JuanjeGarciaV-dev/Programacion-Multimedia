package com.example.tema05_login;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainLayout = findViewById(R.id.main);


        ViewCompat.setOnApplyWindowInsetsListener(mainLayout, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        View botonContinuar = findViewById(R.id.bContinuar);
        botonContinuar.setOnClickListener(v -> showMenu());
    }

    private void showMenu() {

        mainLayout.removeAllViews();


        MainMenu mainMenu = new MainMenu(this, mainLayout);
        mainMenu.setCorreo("correo@correo.com"); // correo mostrado


        mainLayout.addView(mainMenu.getView());


        mainMenu.getButtonDesconectar().setOnClickListener(v -> {
            recreate();
        });
    }
}
