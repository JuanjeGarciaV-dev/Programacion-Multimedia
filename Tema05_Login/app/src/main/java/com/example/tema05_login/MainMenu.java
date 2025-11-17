package com.example.tema05_login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainMenu {

    private View view;
    private Button buttonDesconectar;
    private TextView textViewCorreo;


    public MainMenu(Context context, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.menu, parent, false);

        textViewCorreo = view.findViewById(R.id.textView3);
        buttonDesconectar = view.findViewById(R.id.button);
    }

    public View getView() {
        return view;
    }

    public Button getButtonDesconectar() {
        return buttonDesconectar;
    }

    public void setCorreo(String correo) {
        if (textViewCorreo != null) textViewCorreo.setText(correo);
    }
}
