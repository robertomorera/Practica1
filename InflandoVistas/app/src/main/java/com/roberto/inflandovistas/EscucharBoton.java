package com.roberto.inflandovistas;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by PCCasa on 13/12/2016.
 * Clase donde se programa el Listener asociado al boton de la
 * actividad principal.
 */

public class EscucharBoton implements View.OnClickListener {

    private Context context;

    public EscucharBoton (Context context)
    {
        this.context = context;
    }

    /*
     * Método que implementa la funcionalidad del botón.
     */
    @Override
    public void onClick(View v) {

        Log.d(getClass().getCanonicalName(), "He pulsado el boton");

        Activity activity = (Activity) context;

        EditText editText = (EditText) activity.findViewById(R.id.editText);

        String mensaje = editText.getText().toString();

        Log.d(getClass().getCanonicalName(), "He introducido la cadena: " + mensaje);

        String mensajeFormateado = StringUtils.voltearMensaje(mensaje);

        ViewGroup cajaResultado = (ViewGroup) activity.findViewById(R.id.resultado);

        if (cajaResultado.getChildCount() > 0) {

            TextView text = (TextView)activity.findViewById(R.id.mensaje_formateado);
            Log.d(getClass().getCanonicalName(),"Mensaje formateado: "+ mensajeFormateado);
            text.setText(mensajeFormateado);


        } else {

            LayoutInflater layoutInflater = activity.getLayoutInflater();

            View vistaInflada = layoutInflater.inflate(R.layout.mensaje_salida, cajaResultado);

            TextView textView = (TextView) vistaInflada.findViewById(R.id.mensaje_formateado);
            Log.d(getClass().getCanonicalName(),"Mensaje formateado: "+ mensajeFormateado);
            textView.setText(mensajeFormateado);


        }


        mostrarLayout(activity.findViewById(R.id.activity_main));


    }

   /*
    * Método que muesta en el log los elementos que forman el fichero XML del Layout.
    */
    private void mostrarLayout(View vista)
    {
        Log.d(getClass().getCanonicalName(), vista.getClass().getCanonicalName());

        if (vista instanceof ViewGroup)
        {
            ViewGroup viewGroup = (ViewGroup) vista;

            for (int i = 0; i<viewGroup.getChildCount(); i++)
            {
                View vistahija = viewGroup.getChildAt(i);
                mostrarLayout(vistahija);

            }
        }
    }


}