package com.zodiac;

//Using Setters Injection you can change dependency of the class throughout
// the lifetime of the application.

public class Main {

    public static void main(String[] args) {
        //Poor man's dependency injection
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);
        report.show();

        report.setCalculator(new TaxCalculator2019());
        report.show();
    }
}
