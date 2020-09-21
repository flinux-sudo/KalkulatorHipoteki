package com.kalkulator;


import mortage.Mortage;

import java.util.Scanner;

public class Inputmortagecalculator {
    static int decimal=100;
    static int months=12;
    public Scanner scaner= new Scanner(System.in);
    Mortage input = new Mortage();

    public void inputRate() {
        System.out.println("Rate (In years): ");

        while (!scaner.hasNextFloat()) scaner.nextLine();
        float rate= scaner.nextFloat();
        rate= rate / decimal / months;
        scaner.close();
        input.setRate(rate);

    }
    public void inputPricipalAndPeriod() {
        System.out.println("Period: ");
        Scanner scaner = new Scanner(System.in);
        while (!scaner.hasNextInt()) scaner.nextLine();
        int  principal = scaner.nextInt();
        while (!scaner.hasNextInt()) scaner.next();
        int period = scaner.nextInt();
        scaner.close();
        input.setPricipal(principal);
        input.setPeriod(period);

    }


}
