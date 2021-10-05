package com.cesar.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = findViewById(R.id.edCorreo);
        EditText contraseña = findViewById(R.id.edContraseña);
        Button btn = findViewById(R.id.btnEnviar);

        btn.setOnClickListener(view -> {
            String Email = email.getText().toString();
            String Contraseña = contraseña.getText().toString();
            if (!Email.isEmpty() && !Contraseña.isEmpty()){
                
            }
        });
    }
}