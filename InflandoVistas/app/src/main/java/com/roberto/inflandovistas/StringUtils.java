package com.roberto.inflandovistas;

/**
 * Created by PCCasa on 13/12/2016.
 * Clase de utilidades para tratar cadenas de texto.
 */

public class StringUtils {
    /*
    * Método que da la vuelta a un cadena String
    *@nombre String de entrada
    @return cadenaFormatedada, devuelve un String dado la vuelta.
    */
    public static String voltearMensaje(String nombre){

        String cadenaFormateada= new StringBuffer(nombre).reverse().toString();

        return cadenaFormateada;
    }
}
