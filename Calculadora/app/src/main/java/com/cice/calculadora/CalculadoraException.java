package com.cice.calculadora;

/**
 * Created by PCCasa on 01/12/2016.
 */

public class CalculadoraException extends Exception {


    private String mensaje;

    public CalculadoraException(String mensaje){
        this.mensaje=mensaje;
    }


    @Override
    public String getMessage() {
        return mensaje;
    }
}
