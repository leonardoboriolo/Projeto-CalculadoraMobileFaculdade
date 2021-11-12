package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText valorText1, valorText2;
    Button btnSomar, btnSubtrair, btnDividir, btnMultiplicar, btnlimparTela;
    TextView txtRes;

    Double v1;
    Double v2;
    Double res;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorText1 = findViewById(R.id.valorText1);
        valorText2 = findViewById(R.id.valorText2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnDividir = findViewById(R.id.btnDividir);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        txtRes = findViewById(R.id.txtRes);
        btnlimparTela = findViewById(R.id.btnLimpar);



        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v1 = Double.parseDouble(valorText1.getText().toString());
                v2 = Double.parseDouble(valorText2.getText().toString());
                    res = v1 + v2;
                    txtRes.setText(res.toString());
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(valorText1.getText().toString());
                v2 = Double.parseDouble(valorText2.getText().toString());
                    res = v1 - v2;
                    txtRes.setText(res.toString());
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(valorText1.getText().toString());
                v2 = Double.parseDouble(valorText2.getText().toString());
                    res = v1 * v2;
                    txtRes.setText(res.toString());
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(valorText1.getText().toString());
                v2 = Double.parseDouble(valorText2.getText().toString());
                    res = v1 / v2;
                    txtRes.setText(res.toString());
            }
        });

        btnlimparTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = null;
                v2 = null;
                res = null;
                valorText1.setText("");
                valorText2.setText("");
                txtRes.setText("");
            }
        });


    }
}