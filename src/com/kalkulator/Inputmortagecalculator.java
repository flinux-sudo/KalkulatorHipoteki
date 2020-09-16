package com.kalkulator;

import java.util.Scanner;

public class Inputmortagecalculator {
    static int decimal=100;
    static int months=12;

    public int inputPrincipal(){
        System.out.println("Principal: ");
        Scanner scaner=new Scanner(System.in);
        while (!scaner.hasNextInt()) scaner.nextLine();
        int principal = scaner.nextInt();
        scaner.close();
        return principal;
    }
    public float inputRate() {
        System.out.println("Rate (In years): ");
        Scanner scaner = new Scanner(System.in);
        float rate = scaner.nextFloat();
        while (!scaner.hasNextFloat()) {
            scaner.nextLine();
            rate = scaner.nextFloat();
        }
        rate= rate / decimal / months;
        scaner.close();
        return rate;
    }
    public int inputPeriod() {
        System.out.println("Period: ");
        Scanner scaner = new Scanner(System.in);
        int period = scaner.nextInt();
        while (!scaner.hasNextInt()){
            scaner.nextLine();
            period = scaner.nextInt();
        }

        scaner.close();
        return period;
    }


}
