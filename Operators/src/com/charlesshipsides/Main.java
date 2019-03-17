package com.charlesshipsides;

public class Main {

    public static void main(String[] args) {

        //Addition
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        //Substraction
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        //Multiplication
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        //Division
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        //Return remainder
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;

        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        //=  is assignment, == is checking
        int newValue  = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isChar = false;
        if(isChar == true)
            System.out.println("This is not supposed to happen");

        boolean wasChar = isChar ? true : false;
        if(wasChar)
            System.out.println("wasChar is true");

        double dubVar = 20;
        double secondDubVar = 80;
        double sumOfVar = (dubVar + secondDubVar) * 25;
        sumOfVar = sumOfVar % 40;
        if(sumOfVar <= 20)
            System.out.println("Total was over the limit");


    }
}
