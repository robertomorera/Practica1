package com.cice.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {

    Button botonSuma;
    Button botonResta;
    Button botonMulti;
    Button botonDivision;
    EditText operando1;
    EditText operando2;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    //Inicializamos los componentes del layout.

        //Botón de suma.
        botonSuma= (Button)findViewById(R.id.sumaButton);
        //Botón de resta.
        botonResta=(Button)findViewById(R.id.restaButton);
        //Botón de multiplicación.
        botonMulti= (Button)findViewById(R.id.multiButton);
        //Botón de division.
        botonDivision=(Button)findViewById(R.id.divisionButton);
        operando1=(EditText)findViewById(R.id.operando1);
        operando2=(EditText)findViewById(R.id.operando2);
        resultado=(TextView)findViewById(R.id.resultado);
        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=operando1.getText().toString();
                int op1=Integer.parseInt(num1);
                String num2=operando2.getText().toString();
                int op2=Integer.parseInt(num2);
                Calculadora calculadora=new Calculadora(op1,op2);
                String resultadoSuma=Integer.toString(calculadora.suma());
                resultado.setText(resultadoSuma);

            }
        });



        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=operando1.getText().toString();
                int op1=Integer.parseInt(num1);
                String num2=operando2.getText().toString();
                int op2=Integer.parseInt(num2);
                Calculadora calculadora=new Calculadora(op1,op2);
                String resultadoResta=Integer.toString(calculadora.resta());
                resultado.setText(resultadoResta);

            }
        });


        botonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=operando1.getText().toString();
                int op1=Integer.parseInt(num1);
                String num2=operando2.getText().toString();
                int op2=Integer.parseInt(num2);
                Calculadora calculadora=new Calculadora(op1,op2);
                String resultadoMulti=Integer.toString(calculadora.multiplica());
                resultado.setText(resultadoMulti);

            }
        });


        botonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=operando1.getText().toString();
                int op1=Integer.parseInt(num1);
                String num2=operando2.getText().toString();
                int op2=Integer.parseInt(num2);
                Calculadora calculadora=new Calculadora(op1,op2);
              try{
                String resultadoDiv=Integer.toString(calculadora.divide());
                resultado.setText(resultadoDiv);
            }catch(CalculadoraException e){
                  e.getMessage();
              }finally {

              }
              }
        });



    }
}
