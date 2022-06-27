package com.example.javadeneme.solidexamples.LiskovSubstitutionPrinciple;
/*
 * Liskov’s Substitution Principle, “Kalıtılan sınıflar kalıtılan sınıfın tüm özelliklerine sahip olmalıdır!”
 * BasePrinterFalse sınıfından kalıttığımız bu sınıfımızda tarama özelliği olmadığı için fazladan metod kullanmış olduk.
 * Liskov’s Substitution prensibine aykırı bir durumdur.
 */
public class HpPrinterFalse extends BasePrinterFalse {

    @Override
    public void print() {

    }
    @Override
    public void scan() {

        throw new AssertionError("Tarama ozelligim yok!");
    }
}
