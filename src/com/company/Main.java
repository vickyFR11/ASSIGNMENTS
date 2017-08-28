package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DrawingFunctions function = new DrawingFunctions();

        System.out.println("-- Draw One Asterisk --");
        function.drawOneAsterisk();
        System.out.println("-- Draw Horizontal Asterisks --");
        function.drawHorizontalAsterisks(8);
        System.out.println("-- Draw Vertical Asterisks --");
        function.drawVerticalAsterisks(4);
        System.out.println("-- Draw Right Triangle --");
        function.drawRightTriangle(10);
        System.out.println("-- Draw Isosceles Triangle --");
        function.drawIsoscelesTriangle(3);
        System.out.println("-- Draw Diamond --");
        function.drawDiamond(5);
        System.out.println("-- Draw Diamond with Name --");
        function.drawDiamondWithName(4, "Victoria");
        System.out.println("-- Fizz Buzz --");
        function.FizzBuzz();


        System.out.println("-- Print Prime Factors List --");
        ArrayList<Integer> primeFactorsArray = function.PrimeFactors(30);

        // ---- Print Prime Factors List ---- //
        for (int i = 0; i< primeFactorsArray.size(); i++){
            System.out.println(primeFactorsArray.get(i));
        }

    }


}
