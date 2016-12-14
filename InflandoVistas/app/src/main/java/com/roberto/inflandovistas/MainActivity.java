package com.roberto.inflandovistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(getClass().getCanonicalName(),"Entrando en la actividad principal");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton= (Button)findViewById(R.id.button);

        EscucharBoton escucharBoton=new EscucharBoton(this);

        boton.setOnClickListener(escucharBoton);
    }
}
