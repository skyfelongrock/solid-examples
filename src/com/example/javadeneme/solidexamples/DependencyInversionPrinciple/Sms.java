package com.example.javadeneme.solidexamples.DependencyInversionPrinciple;
/*
 * Dependency Inversion Principle, “Üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır!”
 * IMessage arayüzümüzü Sms sınıfımıza implemente ettik.
 */
public class Sms implements IMessage{

    @Override
    public void sendMessage() {

        sendSms();
    }
    private void sendSms() {

    }
}
