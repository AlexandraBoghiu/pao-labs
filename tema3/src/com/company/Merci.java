package com.company;

import java.util.Objects;

public class Merci extends CandyBox {

    int length;

    public Merci(int length) {
        this.length = length;
    }

    public Merci(String flavor, String origin, int length) {
        super(flavor, origin);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public boolean equals(Merci merci) {
        return this.length == merci.length && this.flavor.equals(merci.flavor) && this.origin.equals(merci.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    @Override
    float getVolume() {
        return this.length * this.length * this.length;
    }

    @Override
    public String toString(){
        return "The " + this.origin + " " + this.flavor + " has volume " + this.getVolume() + ".";
    }
}
