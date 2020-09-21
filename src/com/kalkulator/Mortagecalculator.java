package com.kalkulator;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class Mortagecalculator {

    Inputmortagecalculator input=new Inputmortagecalculator();
    public void calculateMortage(){
        List<Integer> list=input.inputPricipalAndPeriod();
        int principal= list.get(0);
        float rate=input.inputRate();
        int period=list.get(1);

        float power= (float) Math.pow(1+rate,period);
        float multi= rate * power;
        float second=power-1;
        float mortage = principal * (multi / second);
        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println("Mortage: "+df.format(mortage));


    }

}
