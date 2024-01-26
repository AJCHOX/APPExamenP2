package com.example.examnep2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText TextPrimerParcial, TextSegundoParcial;
    Button buttonPromedio;
    TextView textPromedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextPrimerParcial = findViewById(R.id.TextPrimerParcial);
        TextSegundoParcial = findViewById(R.id.TextSegundoParcial);
        buttonPromedio = findViewById(R.id.buttonPromedio);
        textPromedio = findViewById(R.id.textPromedio);

        buttonPromedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularPromedio();
            }
        });
    }

    private void calcularPromedio() {
        String primerParcialStr = TextPrimerParcial.getText().toString().trim();
        String segundoParcialStr = TextSegundoParcial.getText().toString().trim();

        if (primerParcialStr.isEmpty() || segundoParcialStr.isEmpty()) {
            Toast.makeText(this, "Ingresa las calificaciones", Toast.LENGTH_SHORT).show();
            return;
        }

        double primerParcial = Double.parseDouble(primerParcialStr);
        double segundoParcial = Double.parseDouble(segundoParcialStr);
        double promedio = (primerParcial + segundoParcial) / 2;

        textPromedio.setText("Promedio: " + promedio);
    }
}
