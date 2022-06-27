package com.example.javadeneme.solidexamples.InterfaceSegregationPrinciple;
/*
 * Interface Segregation Principle, “Cilentler kullanmayacakları gereksiz metodları kullanmaya zorlanmamalı!”
 * Bu sınıfımızda gerekli metodları kullanmak üzere arayüzler üzerinden implemente işlemi gerçekleştirdik.
 */
public class AnimalsCarer implements IAnimalsCleaner, IAnimalsFeeder{

    @Override
    public void washTheAnimals() {

    }
    @Override
    public void feedTheAnimals() {

    }
}
