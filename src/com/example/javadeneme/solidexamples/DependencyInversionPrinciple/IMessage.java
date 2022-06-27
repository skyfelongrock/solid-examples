package com.example.javadeneme.solidexamples.DependencyInversionPrinciple;
/*
 * Dependency Inversion Principle, “Üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır!”
 * Üst sınıfımız olan NotificationFalse sınıfımızın alt sınıflar olan EmailFalse ve SmsFalse sınıflarına bağlılıklarını
 * kaldırmak için soyutlama yapacağız. Bu sebeple IScan arayüzümü oluşturduk.
 */
public interface IMessage {

    void sendMessage();
}
