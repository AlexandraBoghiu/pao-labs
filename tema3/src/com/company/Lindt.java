package com.company;

public class Lindt extends CandyBox {

    int length, width, height;

    public Lindt(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Lindt(String flavor, String origin, int length, int width, int height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public boolean equals(Lindt lindt) {
        return this.length == lindt.length && this.width == lindt.width && this.height == lindt.height &&
                this.flavor.equals(lindt.flavor) && this.origin.equals(lindt.origin);

    }

    @Override
    float getVolume() {
        return this.length * this.width * this.height;
    }

    @Override
    public String toString(){
        return "The " + this.origin + " " + this.flavor + " has volume " + this.getVolume() + ".";
    }
}
