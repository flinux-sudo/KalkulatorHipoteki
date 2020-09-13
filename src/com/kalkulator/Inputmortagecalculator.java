package com.kalkulator;

import java.util.Scanner;

public class Inputmortagecalculator {


    public void inputPrincipal(){
        System.out.println("Principal: ");
        Scanner scaner=new Scanner(System.in);


        while (!scaner.hasNextInt()) scaner.next();
        int principal = scaner.nextInt();
        System.out.println(principal);
        scaner.close();
    }
    public void inputRate() {
        System.out.println("Rate: ");
        Scanner scaner = new Scanner(System.in);
        while (!scaner.hasNextFloat()) scaner.next();
        float rate = scaner.nextInt();
        rate= rate / 100 / 12;
        System.out.print(rate);
        scaner.close();
    }
    public void inputPeriod() {
        System.out.println("Period: ");
        Scanner scaner = new Scanner(System.in);
        while (!scaner.hasNextInt()) scaner.next();
        int period = scaner.nextInt();
        System.out.print(period);
        scaner.close();
    }

}
