package com.talent.batch11.day03.homeworks;

public class factorial {
    private int n;
    private int fact;

    public factorial(int n) {
        this.n = n;
        this.fact = 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getFact() {
        return fact;
    }

    public void setFact(int fact) {
        this.fact = fact;
    }

    public void calculate(){
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
    }

    public static void main(String[] args) {

        factorial obj = new factorial(5);
        obj.calculate();

        System.out.println("Factorial of " + obj.getN() + " is " + obj.getFact());
    }
}
