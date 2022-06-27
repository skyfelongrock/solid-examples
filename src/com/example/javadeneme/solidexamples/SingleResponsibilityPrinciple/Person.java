package com.example.javadeneme.solidexamples.SingleResponsibilityPrinciple;
/*
 * Single Responsibility Principle, "Bir sınıf sadece ve sadece tek bir şeyden sorumlu olmalıdır!"
 * Person sınıfında değişiklik yapmak istediğimizde Account sınıfında tekrardan bir değişiklik yapmamıza gerek yok.
 * Aynı durum tersi içinde geçerlidir.
 */
import java.util.List;

public class Person {
    private long personId;
    private String firstName;
    private String lastName;
    private String age;
    private List<Account> accounts;
}
