package com.company.NDrob;

public class Drob {
   private int numerator1;
    private int denominator1;
   private int numerator2;
   private int denominator2;
    /**--- Constructors ---**/
    public Drob(int numerator1, int denominator1, int numerator2, int denominator2) {
        this.numerator1 = numerator1;
        if(denominator1==0) System.out.println("Wrong!! Numerator1 is 0");
            else this.denominator1 = denominator1;
        this.numerator2 = numerator2;
        if(denominator2==0) System.out.println("Wrong!! Numertor2 is 0");
        else this.denominator2 = denominator2;

    }
    /**--- Getters ---**/
    public int getNumerator1() {
        return numerator1;
    }

    public int getDenominator1() {
        return denominator1;
    }

    public int getNumerator2() {
        return numerator2;
    }

    public int getDenominator2() {
        return denominator2;
    }

    /**--- Setters ---**/
//    public void setNumerator1(int numerator1) {
//        this.numerator1 = numerator1;
//    }
//
//    public void setDenominator1(int denominator1) {
//        if (denominator1==0){
//            System.out.println("WRONG denom1 = 0");}
//        else this.denominator1 = denominator1;
//    }
//
//    public void setNumerator2(int numerator2) {
//        this.numerator2 = numerator2;
//    }
//
//    public void setDenominator2(int denominator2) {
//        if (denominator2==0) System.out.println("Wrong deom 2 = 0");
//        else this.denominator2 = denominator2;
//    }
    /**--- Methods ---**/


    public int gcd(int numerator1, int denominator1) {
        return denominator1 == 0 ? numerator1 : gcd(denominator1, numerator1 % denominator1);
    }

    String Multyply(int numerator1, int denominator1, int numerator2 , int denominator2){
        int gcd = gcd(numerator1*numerator2,denominator1*denominator2);
        return denominator1*denominator2/gcd==1?("Произведение равно = "+(numerator1*numerator2/gcd)): ("Произведение равно = "+(numerator1*numerator2/gcd)+" / "+(denominator1*denominator2/gcd));
    }
    String Division(int numerator1, int denominator1, int numerator2 , int denominator2){
        int gcd = gcd(numerator1*denominator2,denominator1*numerator1);
        return denominator1*numerator2/gcd==1?("Частное равно = "+numerator1*denominator2/gcd):("Частное равно = "+numerator1*denominator2/gcd+" / "+denominator1*numerator2/gcd);
    }
    String Addition(int numerator1, int denominator1, int numerator2 , int denominator2){
        int gcd = gcd(numerator1*denominator2+numerator2*denominator1,denominator1*numerator1);
        return denominator1*denominator2/gcd==1?("Сумма равна = "+ ((numerator1*denominator2+numerator2*denominator1)/gcd)):("Сумма равна = "+ ((numerator1*denominator2+numerator2*denominator1)/gcd)+" / "+(denominator1*denominator2/gcd));
    }
    String Subtraction(int numerator1, int denominator1, int numerator2 , int denominator2){
        int gcd = gcd(numerator1*denominator2-numerator2*denominator1,denominator1*numerator1);

        return numerator1*denominator2-numerator2*denominator1==0?"Разность равна = 0":("Разность равна = "+((numerator1*denominator2-numerator2*denominator1)/gcd)+" / "+(denominator1*denominator2/gcd));

    }


}
