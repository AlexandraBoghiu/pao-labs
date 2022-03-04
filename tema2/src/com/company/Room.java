package com.company;

//2. Write a program to create a Room object, the attributes of this object are room number, room
//        type and room floor. Define a constructor for this class as well as accessors and mutators for all
//        the attributes. Create two objects of type and display the information for them on separate
//        lines
public class Room {
    int number;
    String type;
    int floor;

    public Room(int number, String type, int floor) {
        this.number = number;
        this.type = type;
        this.floor = floor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
