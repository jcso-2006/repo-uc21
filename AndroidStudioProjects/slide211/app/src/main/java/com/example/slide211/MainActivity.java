package com.example.slide211;

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.input2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public  void calculo(View view){
        TextView num1 = findViewById(R.id.input1);
        TextView num2 = findViewById(R.id.input2);

        double soma = 0;
        double subtracao = 0;
        double multiplicacao = 0;
        double divisao = 0;
        double resto = 0;

        //ver se todos os campos foram preenchidos
        if ((num1.getText().toString().isEmpty()) || (num2.getText().toString().isEmpty()) ){
            Toast.makeText(this, "Insiara os valors no campo", Toast.LENGTH_SHORT).show();
        }else{

                double valor1 = 0;
                valor1 = Double.parseDouble(num1.getText().toSring());
                double valor2 = 0;
                valor2 = Double.parseDouble(num1.getText().toSring());


                if(valor1 ==0 && valor2 == 0){
                    Toast.makeText(this, "Insira valores diferentes de 0", Toast.LENGTH_SHORT).show();

                }else{


                }
            }

    }
}