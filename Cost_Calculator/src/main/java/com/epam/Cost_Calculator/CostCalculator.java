package com.epam.Cost_Calculator;

public class CostCalculator {
    public double calculateCost(String m,double a,String au) {
        double cost = 0.0;
        if(au.equalsIgnoreCase("full")) {
            if(m.equalsIgnoreCase("high")) {
                cost = a * 2500;
            }

        }
        else {
            if(m.equalsIgnoreCase("full")) {
                cost = a * 1800;
            } 
            else if(m.equalsIgnoreCase("aboveStandard")) {
                cost = a * 1500;
            }
            else if(m.equalsIgnoreCase("standard")) {
                cost = a * 1200;
            }
        }
        return cost;
    }
}