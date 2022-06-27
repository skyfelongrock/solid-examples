package com.example.javadeneme.solidexamples.InterfaceSegregationPrinciple;
/*
 * Interface Segregation Principle, “Cilentler kullanmayacakları gereksiz metodları kullanmaya zorlanmamalı!”
 * Sınıflarımızda kullanacağımız metodlar bu arayüz üzerinde bulunmaktadır. Fakat buradaki metodların hepsini sınıflarımızda
 * aynı anda kullanılmayacağız için, tek bir arayüz üzerinden tüm metodları vermemiz Interface Segregation prensibine aykırıdır!
 */
public interface IAnimalsKeeperFalse {

    void washTheAnimals();
    void feedTheAnimals();
    void petTheAnimals();
}
