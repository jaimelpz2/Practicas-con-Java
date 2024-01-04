package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1,n2;
    Button suma;
    TextView r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText)findViewById(R.id.Texto1);
        n2=(EditText)findViewById(R.id.Texto2);
        suma=(Button)findViewById(R.id.Suma);
        r=(TextView)findViewById(R.id.Resultado);
        suma.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Double num1 = Double.parseDouble(n1.getText().toString());
        Double num2 = Double.parseDouble(n2.getText().toString());
        Double s=num1+num2;
        r.setText("la suma es: "+s);

    }




}
