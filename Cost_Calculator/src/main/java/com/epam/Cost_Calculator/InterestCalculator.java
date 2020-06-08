package com.epam.Cost_Calculator;

public class InterestCalculator {

    public double simpleInterest(double p,double n,double r) {
        return ((p*n*r)/100.0);
    }

    public double compoundInterest(double p,double n,double r) {
        return p*(Math.pow((1+(r/ 100.0)),n));
    }
}