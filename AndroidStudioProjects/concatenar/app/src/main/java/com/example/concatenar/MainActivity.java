package com.example.concatenar;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }


    public void concatenar(View view) {
        TextView campo1 = findViewById(R.id.id_campo1);
        TextView campo2 = findViewById(R.id.id_campo2);
        TextView resultado1 = findViewById(R.id.resultado);
        String valor1 ="";
        String valor2= "";

        valor1 = String.valueOf(campo1.getText());
        valor2 = String.valueOf(campo2.getText());

        String res = valor1 +" "+ valor2;
        resultado1.setText(res);
        Toast.makeText(this, res, Toast.LENGTH_SHORT).show();


    }


}


