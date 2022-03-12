package com.company;

public abstract class CandyBox {

    protected String flavor, origin;

    public CandyBox() {
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    abstract float getVolume();

    public boolean equals(CandyBox candyBox) {
        return this.flavor.equals(candyBox.flavor) && this.origin.equals(candyBox.origin);
    }
    @Override
    public String toString() {
        return "Flavor: " + this.flavor + ", Origin: " + this.origin;
    }

}
