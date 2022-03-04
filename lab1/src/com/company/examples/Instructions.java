package com.company.examples;

public class Instructions {
    public static void main(String[] args) {

        String color = "black";

        //decizionale

        if ("red".equals(color))
            System.out.println("It's red");
        else if ("green".equals(color))
            System.out.println("It's green");
        else
            System.out.println("It's idk what");

        switch(color){
            case "red":
                System.out.println("red");
                break;
            case "green":
                System.out.println("green");
                break;
            default:
                System.out.println("idk");
        }
    }
}
