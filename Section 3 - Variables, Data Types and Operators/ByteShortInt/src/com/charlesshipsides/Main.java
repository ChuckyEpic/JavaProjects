package com.charlesshipsides;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int myMinInt = -2_147_483_648;
        int myMaxInt = 2_147_483_647;
        int myTotal = (myMinInt/2);

        //byte has a width of 8
        byte myMinByte = -128;
        byte myMaxByte = 127;
        //Java defaults to int
        byte myByteTotal = (byte) (myMaxByte/2);

        //short has a width of 16
        short myMinShort = -32768;
        short myMaxShort = 32767;

        //long has a width of 61
        long myMinLong = -9_223_372_036_854_775_807L;
        long myMaxLong = 9_223_372_036_854_775_807L;

        byte myByte = 31;
        short myShort = 143;
        int myInt = 32123;
        long myLong = 5000 + (10 * (myByte + myShort + myInt));

    }
}
