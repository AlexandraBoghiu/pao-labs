package com.company;

public class Area {
    CandyBag candyBag;
    int number;
    String street;

    public Area() {

    }

    public Area(CandyBag candyBag, int number, String street) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }

    public CandyBag getCandyBag() {
        return candyBag;
    }

    public void setCandyBag(CandyBag candyBag) {
        this.candyBag = candyBag;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void printAddress() {
        System.out.println("Street " + this.street + ", number " + this.number);
        for (int i = 0; i < this.candyBag.candyBoxes.length; i++) {
            System.out.println(candyBag.candyBoxes[i].toString());
        }


    }
}
