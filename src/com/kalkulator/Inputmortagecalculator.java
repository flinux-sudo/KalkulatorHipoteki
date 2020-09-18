package com.kalkulator;

import java.util.Scanner;

public class Inputmortagecalculator {
    static int decimal=100;
    static int months=12;






        


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
        float rate=inputRate();
        while (!scaner.hasNextInt()) scaner.next();
        int period = scaner.nextInt();
        scaner.close();
        return principal,period,rate;
    }

    public static void main(String[] args) {
        new Inputmortagecalculator().inputRate();
    }

}
