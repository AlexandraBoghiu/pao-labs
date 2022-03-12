package com.company;

import java.lang.Math.*;

public class Milka extends CandyBox {

    int radius, height;

    public Milka(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public Milka(String flavor, String origin, int radius, int height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public boolean equals(Milka milka) {
        return this.radius == milka.radius && this.height == milka.height &&
                this.flavor.equals(milka.flavor) && this.origin.equals(milka.origin);
    }

    @Override
    float getVolume() {
        return (float) (Math.PI * this.radius * this.radius * this.height);
    }
    @Override
    public String toString(){
        return "The " + this.origin + " " + this.flavor + " has volume " + this.getVolume() + ".";
    }
}
