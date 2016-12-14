package com.cice.calculadora;

/**
 * Created by PCCasa on 01/12/2016.
 */

public class Calculadora {

 private int operando1;
 private int operando2;


public Calculadora(int operando1,int operando2){
    this.operando1=operando1;
    this.operando2=operando2;
}

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public int suma(){
        return operando1+operando2;
    }

    public int resta(){
        return operando1-operando2;
    }

    public int multiplica(){
        return operando1*operando2;
    }

    public int divide() throws  CalculadoraException{

        int resultado=0;
        if(operando2==0){
            CalculadoraException calculadoraException=new CalculadoraException("El divisor no debe ser cero");
            throw calculadoraException;
        }else{
         resultado=operando1/operando2;
        }
        return resultado;
    }
}
