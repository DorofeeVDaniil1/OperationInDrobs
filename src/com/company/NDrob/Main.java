package com.company.NDrob;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Drob drob1 = new Drob(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());

        System.out.println(drob1.Multyply(drob1.getNumerator1(), drob1.getDenominator1(), drob1.getNumerator2(), drob1.getDenominator2()));
        System.out.println( drob1.Division(drob1.getNumerator1(), drob1.getDenominator1(), drob1.getNumerator2(), drob1.getDenominator2()));
        System.out.println(drob1.Addition(drob1.getNumerator1(), drob1.getDenominator1(), drob1.getNumerator2(), drob1.getDenominator2()));
        System.out.println(drob1.Subtraction(drob1.getNumerator1(), drob1.getDenominator1(), drob1.getNumerator2(), drob1.getDenominator2()));










    }



}
