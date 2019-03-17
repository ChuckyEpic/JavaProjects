package com.charlesshipsides;

public class Main {

    public static void main(String[] args) {

        //Int rounds down to nearest whole number (width = 32, 4 bytes)
        int myIntValue = 5 / 3;
        //Float rounds down to 7dp (width = 32, 4 bytes)
        float myFloatValue = 5f / 3f;
        //Double rounds at 16dp (width = 64, 8 bytes)
        double myDoubleValue = 5d / 3d;

        //Decimals Java assume to be a double

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double noOfPounds = 5d;
        double noOfKilos = noOfPounds * 0.45359273d;
        System.out.println(noOfPounds + " Pounds is " + noOfKilos + " Kilos");

    }
}
