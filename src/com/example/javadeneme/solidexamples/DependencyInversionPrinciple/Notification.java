package com.example.javadeneme.solidexamples.DependencyInversionPrinciple;
/*
 * Dependency Inversion Principle, “Üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır!”
 * IMessage arayüzümüz ile NotificationFalse sınıfımızdaki bağlılıkları bu sınıfımızda kaldırmış olduk.
 * IMessagee arayüzünü implemente eden yeni bir sınıf oluşturduğumuzda Notification sınıfında bir değişiklik yapmadan
 * kullanabileceğiz. Dependency Inversion prensibine uygun bir davranış yapmış olduk.
 */
import java.util.List;

public class Notification {

    private List<IMessage> messages;

    public Notification(List<IMessage> messages) {

    }

    public void sender() {

    }
}
