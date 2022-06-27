package com.example.javadeneme.solidexamples.DependencyInversionPrinciple;
/*
 * Dependency Inversion Principle, “Üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır!”
 * NotificationFalse sınıfımız üst seviye bir sınıf olmasına rağmen daha alt seviye olan EmailFalse ve SmsFalse sınıflarına
 * bağımlı halde. Bu sınıflardaki değişiklikler direkt olarak NotificationFalse sınıfımızı etkileyecektir.
 * Bu durumda Dependency Inversion prensibine aykırı hareket etmiş olduk.
 */
public class NotificationFalse {

    private EmailFalse emailFalse = new EmailFalse();
    private SmsFalse smsFalse = new SmsFalse();

    public void sender() {

    }
}
