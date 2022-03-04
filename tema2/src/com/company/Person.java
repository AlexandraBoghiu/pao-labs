package com.company;


//    1. Write a program to create a Person object, with the following attributes: name as string,
//    surname as string, age as int, identity number as long, type as string. Define a constructor for
//    this class as well as accessors and mutators for all the attributes. Create two objects of type
//    Person and display the information for them on separate lines.


public class Person {
    String name;
    String surname;
    int age;
    long id;
    String type;

    public Person(String name, String surname, int age, long id, String type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
