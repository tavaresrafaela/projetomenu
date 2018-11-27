package com.lourdinas.finalaplication;

import com.lourdinas.finalaplication.Media;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Media extends AppCompatActivity {

    //private double resultado = 0;
    private double nota1 = 0;
    private double nota2 = 0;
    private double nota3 = 0;
    private double nota4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        final EditText nota1 = (EditText) findViewById(R.id.enota1);
        final EditText nota2 = (EditText) findViewById(R.id.enota2);
        final EditText nota3 = (EditText) findViewById(R.id.enota3);
        final EditText nota4 = (EditText) findViewById(R.id.enota4);
        final TextView vresul = (TextView) findViewById(R.id.resultado);

        final Button btncal = (Button) findViewById(R.id.btn_calcular);

        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nota1.getEditableText().equals("")) {
                    Toast.makeText(getApplicationContext(), "Digita a Nota 1!", Toast.LENGTH_LONG).show();
                }if(nota2.getEditableText().equals("")) {
                    Toast.makeText(getApplicationContext(), "Digita a Nota 2!", Toast.LENGTH_LONG).show();
                }if(nota3.getEditableText().equals("")) {
                    Toast.makeText(getApplicationContext(), "Digita a Nota 3!", Toast.LENGTH_LONG).show();
                }if(nota4.getEditableText().equals("")) {
                    Toast.makeText(getApplicationContext(), "Digita a Nota 4!", Toast.LENGTH_LONG).show();
                } else {
                    String resultado = calcular(
                            Double.parseDouble(nota1.getEditableText().toString()),
                            Double.parseDouble(nota2.getEditableText().toString()),
                            Double.parseDouble(nota3.getEditableText().toString()),
                            Double.parseDouble(nota4.getEditableText().toString()));
                    vresul.setText(resultado);
                }

            }
        });
    }

    public String calcular(Double nota1, Double nota2, Double nota3,
                           Double nota4) {

        Double resultado = 0.0;

        resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        return resultado.toString();
    }
}

