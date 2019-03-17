package com.charlesshipsides;

public class Main {

    public static void main(String[] args) {

        //width of 16 (2 Bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char registeredSymbol = '\u00AE';
        System.out.println("Unicode output was " + registeredSymbol);
    }
}
