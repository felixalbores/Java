package com.zodiac;
/*
    -Method Injection
    Dependency Injection using Method -
    -we need to be dependent to the interface

 */

public class TaxReport {

    private TaxCalculator calculator;

    //Constructor Injection
//    public TaxReport(TaxCalculator calculator){
//        this.calculator = calculator;
//    }

    public void show(TaxCalculator calculator){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
