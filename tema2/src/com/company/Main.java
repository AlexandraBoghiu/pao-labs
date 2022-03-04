package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. ");
        Person firstPerson = new Person("Sophie", "Smith", 30, 12345678, "Sophie's type");
        Person secondPerson = new Person("Johnny", "Walker", 35, 87654321, "Johnny's type");
        System.out.println("Name: " + firstPerson.getName() + ", Surname: " + firstPerson.getSurname() + ", Age: " +
                firstPerson.getAge() + ", Id: " + firstPerson.getId() + ", Type: " + firstPerson.getType());
        System.out.println("Name: " + secondPerson.getName() + ", Surname: " + secondPerson.getSurname() + ", Age: " +
                secondPerson.getAge() + ", Id: " + secondPerson.getId() + ", Type: " + secondPerson.getType());

        System.out.println("2. ");
        Room firstRoom = new Room(10, "Double", 1);
        Room secondRoom = new Room(25, "Single", 2);
        System.out.println("Room number: " + firstRoom.getNumber() + ", Type: " + firstRoom.getType() + ", Floor: " + firstRoom.getFloor());
        System.out.println("Room number: " + secondRoom.getNumber() + ", Type: " + secondRoom.getType() + ", Floor: " + secondRoom.getFloor());

        System.out.println("3. ");
        Subject firstSubject = new Subject(firstRoom, 30, firstPerson);
        Subject secondSubject = new Subject(secondRoom, 20, secondPerson);
        System.out.println("First subject:\n" + "Room number: " + firstSubject.getRoom().getNumber() + ", Type: " +
                firstSubject.getRoom().getType() + ", Floor: " + firstSubject.getRoom().getFloor() + ", Number of students: "
                + firstSubject.getNoOfStudents() + ", Teacher's name: " + firstSubject.getTeacher().getName() + ", Surname: "
                + firstSubject.getTeacher().getSurname() + ", Age: " + firstSubject.getTeacher().getAge() + ", Id: " +
                firstSubject.getTeacher().getId() + ", Type: " + firstSubject.getTeacher().getType());
        System.out.println("Second subject:\n" + "Room number: " + secondSubject.getRoom().getNumber() + ", Type: " +
                secondSubject.getRoom().getType() + ", Floor: " + secondSubject.getRoom().getFloor() + ", Number of " +
                "students: " + secondSubject.getNoOfStudents() +
                ", Teacher's name: " + secondSubject.getTeacher().getName() + ", Surname: " + secondSubject.getTeacher().getSurname()
                + ", Age: " +
                secondSubject.getTeacher().getAge() + ", Id: " + secondSubject.getTeacher().getId() + ", Type: " +
                secondSubject.getTeacher().getType());
    }
}
