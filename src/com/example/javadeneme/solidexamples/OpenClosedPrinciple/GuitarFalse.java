package com.example.javadeneme.solidexamples.OpenClosedPrinciple;
/*
 * Open Closed Principle, “Yazılım bileşenleri genişletmeye açık, ancak değişikliğe kapalı olmalıdır!”
 * Her zaman kodlarımız bu kadar basit olmayabilir. Sınıflarımızda yapacağımız değişiklikler
 * farklı yerlerde hatalara sebep verebilir. Hali hazırda çalışan bir uygulamamız varken, uygulamamıza yeni şeyler eklemek
 * istersek, geliştirmelerimizi classların üzerinden genişleterek yapmamız gerekir.
 * Aşağıda gördüğünüz örnek Open Closed prensibine aykırıdır.
 */
public class GuitarFalse {

    private String make;
    private String model;
    private String type;
    private int volume;

    //yeni eklediğimiz satır
    private String PatternType;
}
