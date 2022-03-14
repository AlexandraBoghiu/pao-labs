package com.company;

public class Main {

    public static void main(String[] args) {
        Merci firstMerci = new Merci("flavor1", "origin1", 10);
        Merci secondMerci = new Merci("flavor2", "origin2", 5);
        Lindt firstLindt = new Lindt("flavor3", "origin3", 1, 2, 3);
        Milka firstMilka = new Milka("flavor4", "origin4", 2, 3);
        Merci[] merciArray = new Merci[5];
        Lindt[] lindtArray = new Lindt[5];
        Milka[] milkaArray = new Milka[5];
        CandyBox[] candyBoxes = new CandyBox[4];
        candyBoxes[0] = firstMerci;
        candyBoxes[1] = secondMerci;
        candyBoxes[2] = firstLindt;
        candyBoxes[3] = firstMilka;
        CandyBag candyBag = new CandyBag(candyBoxes);


        Area area = new Area(candyBag, 3, "street1");
        area.printAddress();

        PasswordMaker pass = PasswordMaker.getInstance("abcdef");
        System.out.println(pass.getPassword());
    }
}
