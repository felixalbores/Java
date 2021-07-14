package com.zodiac;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        //Poor man's dependency injection
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);
    }
}
