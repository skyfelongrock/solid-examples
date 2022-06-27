package com.example.javadeneme.solidexamples.LiskovSubstitutionPrinciple;
/*
 * Liskov’s Substitution Principle, “Kalıtılan sınıflar kalıtılan sınıfın tüm özelliklerine sahip olmalıdır!”
 * HpPrinterFalse sınıfımız tarama özelliğine özelliğine sahip olmadığı için,
 * kalıtım yaptığımız BasePrinterFalse sınıfıyla Liskov’s Substitution prensibine göre aykırı kalıyordu.
 *
 * Bu sebepten ötürü kalıtım yaptığımız sınıfdan tarama özelliğini çıkartıp IScan arayüzü ile taramayı sınıflarımıza
 * implemente ettik. Kalıtım yaptığımız sınıf yazdırma özelliğini, kullanılan sınıflarda karşıladığı için Liskov’s Substitution
 * prensibine uygun çalışmış olduk.
 */
public interface IScan {

    void scan();
}
