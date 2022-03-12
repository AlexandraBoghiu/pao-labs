package com.company;

public class CandyBag {
    CandyBox[] candyBoxes;

    public CandyBag(CandyBox[] candyBoxes) {
        this.candyBoxes = candyBoxes;
    }

    public CandyBox[] getCandyBoxes() {
        return candyBoxes;
    }

    public void setCandyBoxes(CandyBox[] candyBoxes) {
        this.candyBoxes = candyBoxes;
    }
}
