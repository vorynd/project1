package com.martynuk.domain;

public class Client {

    private long id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private String phone;

    public  Client (String name, String surname, int age, String email,String phone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phone = phone;

    }
    public  long getId() {
        return id;
    }

}
