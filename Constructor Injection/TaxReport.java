package com.zodiac;
/*
    Dependency Injection using Constructor -
    -we need to be dependent to the interface

 */

public class TaxReport {
    private TaxCalculator calculator;

    //Constructor Injection
    public TaxReport(TaxCalculator calculator){
        this.calculator = calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
