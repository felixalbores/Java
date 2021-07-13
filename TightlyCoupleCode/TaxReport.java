package com.zodiac;
/*
    Tight coupling means classes and objects are dependent on one another.
    In general, tight coupling is usually not good because it reduces the flexibility
    and re-usability of the code  while Loose coupling means reducing the dependencies
    of a class that uses the different class directly.

    Tightly Couple Code - In this class, we are using TaxCalculator class, we are depending of that TaxCalculator class
    Look at the constructor, Our class are dependent of the other class.
    If one class, may affected then the other class may affected as well.

 */

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(){
        calculator = new TaxCalculator(100_000);
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
