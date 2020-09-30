package com.kalkulator;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inputmortagecalculator {
    static int decimal=100;//zmienna na potrzebe zamiany na licabe dziesietną
    static int months=12;// zmienna na potrzebe zamiany roku na miesiace
    public Scanner scaner= new Scanner(System.in);
    static int positive=0;//tu chciałem zmienna ktora mi pomoze w while inty i float brac poduawge tylko wieksze od zera


    public float inputRate() {
        System.out.println("Rate (for year): ");
        while (!(scaner.hasNextFloat()) && scaner.nextFloat()>positive)
            scaner.next();//petla aby tylko skaner przyjmowal float  i wieksza niz zero(ale to cos nie działą)
        float rate= scaner.nextFloat();//poviera nastepnego floata
        rate= rate / decimal / months;//zamienia na liczbe dzisietna i dzieli na miesiac

        return rate;
    }
    public List <Integer> inputPricipalAndPeriod() {
        System.out.println("Principal: ");
        while (!(scaner.hasNextInt()) && scaner.nextInt()>positive) scaner.next();//tak jak w przypadku z float-em
        int  principal = scaner.nextInt();
        System.out.println("Period(in years): ");
        while (!(scaner.hasNextInt()) && scaner.nextInt()>positive) scaner.next();
        int period = scaner.nextInt();
        period=period *months;
        List <Integer> lista = new ArrayList<Integer>(1);//lista abym mogł zwrócic dwie zmienne z metody
        lista.add(0,principal);
        lista.add(1,period);
        return lista;
    }


}
