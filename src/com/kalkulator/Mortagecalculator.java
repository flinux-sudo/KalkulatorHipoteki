package com.kalkulator;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class Mortagecalculator {
//    głowna klasa ktora pobiera dane od klasy ktora jest odpowiedzialna za input
    Inputmortagecalculator input=new Inputmortagecalculator();//nowa instancja obiektu klasy input mam dostep do inputu
    public void calculateMortage(){
        List<Integer> list=input.inputPricipalAndPeriod();//lokalna lista dla listy (Integer) z klasu input
        int principal= list.get(0);//przypisuje te zmienne ktore uzyskałem z klasy input do loaklnych
        float rate=input.inputRate();
        int period=list.get(1);

        float power= (float) Math.pow(1+rate,period);
        float multi= rate * power;
        float second=power-1;
        float mortage = principal * (multi / second);//obliczam hipoteke na bazie uzyskanych danych
        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.CEILING);//zaokrąglam wynik ps tu chciałem dac do dwóch miejsc po przecinku ale nie mogłem znalesc wiec coz...
        System.out.println("Mortage: "+df.format(mortage));//zaokrągla do częsci dziesitnych wiec działa


    }

}
