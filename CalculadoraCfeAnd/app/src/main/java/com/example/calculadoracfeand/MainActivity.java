package com.example.calculadoracfeand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Consultas;
    EditText Consumir,TotalPagar;
    Spinner ComboBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Consumir=(EditText)findViewById(R.id.Texto1);
        TotalPagar=(EditText)findViewById(R.id.Texto2);
        ComboBox=(Spinner)findViewById(R.id.spinner);
        Consultas=(Button)findViewById(R.id.Consultar);
        Consultas.setOnClickListener(this);

        //aqui se crea el arrayadapter para el arreglo de las cadenas y el layour del spinner es decir el layout entre los items
        ArrayAdapter<CharSequence>dataAdapter = ArrayAdapter.createFromResource(this,R.array.Tarifas,android.R.layout.simple_spinner_item);

        //se Especifica el Comportamiento
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //se aplica el adapter al spinner
        ComboBox.setAdapter(dataAdapter);

    }

    public void onClick(View v) {
        String tarifa = (String) ComboBox.getSelectedItem();

        if(tarifa.equals("1")){
            //ToastMakeText es como si fuera un jOptionPane
            Toast.makeText(this,"Has seleccionado la tarifa 1"+ComboBox.getSelectedItem(),Toast.LENGTH_LONG).show();
        }
        else if(tarifa.equals("1A")){
            Toast.makeText(this,"Has seleccionado la tarifa 1A"+ComboBox.getSelectedItem(),Toast.LENGTH_LONG).show();
        }
        else if(tarifa.equals("1B")){
            Toast.makeText(this,"Has seleccionado la tarifa 1B"+ComboBox.getSelectedItem(),Toast.LENGTH_LONG).show();
        }
        else if(tarifa.equals("")){
            Toast.makeText(this,"No ha Seleccionado nada Por favor Elija su Tarifa"+ComboBox.getSelectedItem(),Toast.LENGTH_LONG).show();
        }
    }
}
