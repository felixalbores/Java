package com.zodiac;

//Lose Coupling in Action - doesn't recompile or modify the other class.
public class TaxCalculator2018 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax(){
        return taxableIncome * 0.3; //30 percent tax
    }
}
