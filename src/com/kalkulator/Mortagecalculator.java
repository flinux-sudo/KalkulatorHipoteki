package com.kalkulator;


import mortage.Mortage;

public class Mortagecalculator {
    Mortage values = new Mortage();
    Inputmortagecalculator input=new Inputmortagecalculator();
    public void calculateMortage(){
        input.inputPricipalAndPeriod();
        input.inputRate();
        int principal =values.getPricipal();
        float rate= values.getRate();
        int period= values.getPeriod();



        float power= (float) Math.pow(1+rate,period);
        float multi= rate * power;
        float second=power-1;
        float mortage = principal * (multi / second);
        System.out.println("Mortage: "+mortage);


    }

}
