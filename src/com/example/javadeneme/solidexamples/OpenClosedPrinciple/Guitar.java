package com.example.javadeneme.solidexamples.OpenClosedPrinciple;
/*
 * Open Closed Principle, “Yazılım bileşenleri genişletmeye açık, ancak değişikliğe kapalı olmalıdır!”
 * Guitar sınıfımızda değişiklik yapmak yerine extends komutu ile sınıfımızı GuitarWithPatterns sınıfımız ile genişlettik.
 */
public class Guitar {

    private String make;
    private String model;
    private String type;
    private int volume;
}
