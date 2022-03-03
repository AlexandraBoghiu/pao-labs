package com.company.catalog;

import com.company.catalog.models.*;

public class Main {

    public static void main(String[] args) {
//	Student student2 = new Student();
//    Student student = new Student();
//    Teacher teacher = new Teacher();

        //numerice

        int myBite = 1;

        short myShort = 30000;
        Short mins = Short.MIN_VALUE;

        int myInt = 100_000_000;
        Integer min = Integer.MIN_VALUE;
        Integer max = Integer.MAX_VALUE;

        long myLong = 100_000_000_000_000L;
        Long minLong = Long.MIN_VALUE;

        float fl = (float) 2.14;
        //sau float fl = 2.14F;

        double d = 2.14;


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
