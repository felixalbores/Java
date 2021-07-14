package com.zodiac;

//Using Method Injection passing the object into the parameters

public class Main {

    public static void main(String[] args) {
        //Poor man's dependency injection
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport();
        report.show(calculator); //Method Injection
        report.show(new TaxCalculator2019());
        //Method Injection
    }
}
