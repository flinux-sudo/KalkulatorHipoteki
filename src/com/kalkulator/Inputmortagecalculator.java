package com.kalkulator;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inputmortagecalculator {
    static int decimal=100;
    static int months=12;
    public Scanner scaner= new Scanner(System.in);


    public float inputRate() {
        System.out.println("Rate (for year): ");
        while (!scaner.hasNextFloat()) scaner.next();
        float rate= scaner.nextFloat();
        rate= rate / decimal / months;

        return rate;
    }
    public List <Integer> inputPricipalAndPeriod() {
        System.out.println("Principal: ");
        while (!scaner.hasNextInt()) scaner.next();
        int  principal = scaner.nextInt();
        System.out.println("Period(in years): ");
        while (!scaner.hasNextInt()) scaner.next();
        int period = scaner.nextInt();
        period=period *12;
        List <Integer> lista = new ArrayList<Integer>(1);
        lista.add(0,principal);
        lista.add(1,period);
        return lista;
    }


}
