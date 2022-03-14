package com.company;

import java.util.Random;
// Lazy Singleton Implementation
public class PasswordMaker {
    final int MAGIC_NUMBER = 10;
    final String MAGIC_STRING = new String(magicStringGenerator(generateRandomNumber()));
    String name;
    private static PasswordMaker instance = null;

    private PasswordMaker(String name) {
        this.name = name;
    }

    static PasswordMaker getInstance(String name) {
        if (instance != null) {
            return instance;
        }
        instance = new PasswordMaker(name);
        return instance;
    }

    public int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(20, 31);
    }

    public StringBuilder magicStringGenerator(int length) {
        Random rand = new Random();
        StringBuilder magicString = new StringBuilder("");
        for (int i = 0; i < length; i++) {
            int randomInt = rand.nextInt(97, 123);
            magicString.append((char) randomInt);
        }
        return magicString;
    }

    public String getPassword() {
        Random rand = new Random();
        int randomInt = rand.nextInt(0, 101);
        int randomLength = rand.nextInt(20, 30);
        String firstString = new String(magicStringGenerator(10));
        String secondString = MAGIC_STRING.substring(0, 10);
        String thirdString = new String(String.valueOf(this.name.length()));
        String fourthString = new String(String.valueOf(randomInt));
        return firstString + secondString + thirdString + fourthString;
    }
}
