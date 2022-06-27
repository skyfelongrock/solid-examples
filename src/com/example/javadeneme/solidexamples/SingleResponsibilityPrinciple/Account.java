package com.example.javadeneme.solidexamples.SingleResponsibilityPrinciple;
/*
* Single Responsibility Principle, "Bir sınıf sadece ve sadece tek bir şeyden sorumlu olmalıdır!"
* Person sınıfında liste olarak kullandığımız Account sınıfı.
*/
public class Account {
    private Long guid;
    private String accountNumber;
    private String accountName;
    private String status;
    private String type;
}
