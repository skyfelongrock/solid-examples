package com.example.javadeneme.solidexamples.LiskovSubstitutionPrinciple;
/*
 * Liskov’s Substitution Principle, “Kalıtılan sınıflar kalıtılan sınıfın tüm özelliklerine sahip olmalıdır!”
 */
public class CanonPrinterFalse extends BasePrinterFalse {

    @Override
    public void print() {

    }
    @Override
    public void scan() {

    }
}
