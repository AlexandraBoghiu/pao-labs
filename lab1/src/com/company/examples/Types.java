package com.company.examples;

public class Types {

    public static void main(String[] args) {
        //numerice

        byte myBite = 1;
        short myShort = 30000;
        int myInt = 100_000_000;
        long myLong = 100_000_000_000_000L;
        float fl = (float) 2.14; //sau float fl = 2.14F;
        double d = 2.14;

        Byte minByte = Byte.MIN_VALUE;
        Short mins = Short.MIN_VALUE;
        Integer min = Integer.MIN_VALUE;
        Integer max = Integer.MAX_VALUE;
        Long minLong = Long.MIN_VALUE;

        Byte myWrapperByte = Byte.valueOf(myBite);

        //alfanumerice

        char c = 'a';
        char g = 'c';

        String myString = "abanababbaba" +
                "dadafaf" +
                "fafasfa";

        //other
        boolean t = true;
        boolean f = false;

        System.out.println("Hello world!");
        System.out.println(min);
        System.out.println(max);
    }
}