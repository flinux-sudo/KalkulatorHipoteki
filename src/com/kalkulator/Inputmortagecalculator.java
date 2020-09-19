package com.kalkulator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inputmortagecalculator {
    static int decimal=100;
    static int months=12;
    List<Integer>lista=new ArrayList<Integer>(3);


    public float inputRate() {
        System.out.println("Rate (In years): ");
        Scanner scaner2 = new Scanner(System.in);
        while (!scaner2.hasNextFloat()) scaner2.nextLine();
        float rate= scaner2.nextFloat();
        rate= rate / decimal / months;
        scaner2.close();
        return rate;
    }
    public int inputPricipalAndPeriod() {
        System.out.println("Period: ");
        Scanner scaner = new Scanner(System.in);
        while (!scaner.hasNextInt()) scaner.nextLine();
        int  principal = scaner.nextInt();
        while (!scaner.hasNextInt()) scaner.next();
        int period = scaner.nextInt();
        scaner.close();
        lista.add(0,principal);
        lista.add(1,period);
        return (lista);
    }

    public static void main(String[] args) {
        new Inputmortagecalculator().inputRate();
    }

}
