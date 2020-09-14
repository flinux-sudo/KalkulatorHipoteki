package com.kalkulator;


public class Mortagecalculator {
    Inputmortagecalculator calculator=new Inputmortagecalculator();
    public void calculateMortage(){
        float mortage;
        int principal =calculator.inputPrincipal();
        float rate=calculator.inputRate();
        int period=calculator.inputPeriod();
        float power= (float) Math.pow(1+rate,period);
        float multi= rate * power;
        float second=power-1;
        mortage=principal * (multi/second);
        System.out.println("Mortage: "+mortage);


    }

}
