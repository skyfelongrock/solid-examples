package com.example.javadeneme.solidexamples.DependencyInversionPrinciple;
/*
 * Dependency Inversion Principle, “Üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır!”
 * IMessage arayüzümüzü Email sınıfımıza implemente ettik.
 */
public class Email implements IMessage{

    @Override
    public void sendMessage() {

        sendEmail();
    }
    private void sendEmail() {

    }
}
