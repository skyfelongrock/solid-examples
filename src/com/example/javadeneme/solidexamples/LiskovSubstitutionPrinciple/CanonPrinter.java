package com.example.javadeneme.solidexamples.LiskovSubstitutionPrinciple;
/*
 * Liskov’s Substitution Principle, “Kalıtılan sınıflar kalıtılan sınıfın tüm özelliklerine sahip olmalıdır!”
 * HpPrinterFalse sınıfı Liskov’s Substitution prensibine aykırı olduğu için kalıtım yaptığımız sınıfdan tarama metodunu çıkardık.
 *
 * Bu sebepten ötürü bu sınıfımızda ilk önce kalıtım işlemini yeni sınıfımzıdan yapıp, tarama özelliğini IScan arayüzünden
 * implemente ettik.
 */
public class CanonPrinter extends BasePrinter implements IScan{

    @Override
    public void print() {

    }
    @Override
    public void scan() {

    }
}
