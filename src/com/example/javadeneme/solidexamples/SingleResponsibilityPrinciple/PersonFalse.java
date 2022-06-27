package com.example.javadeneme.solidexamples.SingleResponsibilityPrinciple;
/*
 * Single Responsibility Principle, "Bir sınıf sadece ve sadece tek bir şeyden sorumlu olmalıdır!"
 * Sınıfları birbirinden ayırmadığımız için, kodumuz hem karışık hemde düzenleme yapmak için çalışması daha zor hale geldi.
 * Bu bahsettiğimiz Single Responsibility prensibine aykırıdır.
 */
public class PersonFalse {
    private long personId;
    private String firstName;
    private String lastName;
    private String age;
    private Long guid;
    private String accountNumber;
    private String accountName;
    private String status;
    private String type;
}
