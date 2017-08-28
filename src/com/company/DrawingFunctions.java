package com.company;

import java.util.ArrayList;

public class DrawingFunctions {

    public void drawOneAsterisk(){
        System.out.print("*");
        System.out.println("");
    }

    public void drawHorizontalAsterisks(int n){
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public void drawVerticalAsterisks(int n){
        for (int i = 0; i < n; i++){
            System.out.println("*");
        }
    }

    public void drawRightTriangle(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    public void drawIsoscelesTriangle(int n){

        String word;

        for (int i = 0, aux = (n-1); i < n; i++, aux--){
            word = defineNumberOfSpaces(aux);
            for (int j = 0; j <= (i*2); j++){
                word += "*";
            }
            System.out.println(word);
        }

    }


    public void drawDiamond(int n){

        String word = "", wordCopy="";
        boolean isHalf = false;
        int countOfAsterisk = 0, auxSpace = 1;

        for (int i = 0; i < ((n * 2)-1); i++){
            word = "";
            if (i == n){
                isHalf = true;
            }

            if (isHalf == false){

                for (int j = 0; j < ( n - 1 ) - i; j++){
                    word += " ";
                }
                for (int k = 0; k <= i*2; k++){
                    word += "*";
                }
                wordCopy = word;

            }else{

                countOfAsterisk = numberOfAsterisk(wordCopy);
                for (int j = 0; j < auxSpace; j++){
                    word += " ";
                }

                for (int k = 0; k < countOfAsterisk - 2; k++){
                    word += "*";
                }

                wordCopy = word;
                auxSpace++;
                countOfAsterisk = numberOfAsterisk(word);
            }

            System.out.println(word);
        }

    }


    public void drawDiamondWithName(int n, String name) {

        String word = "", wordCopy = "";
        boolean isHalf = false;
        int countOfAsterisk = 0, auxSpace = 1;

        for (int i = 0; i < ((n * 2) - 1); i++) {
            word = "";
            if (i == n) {
                isHalf = true;

            }

            if (isHalf == false) {

                for (int j = 0; j < (n - 1) - i; j++) {
                    word += " ";
                }


                for (int k = 0; k <= i * 2; k++) {

                    word += "*";
                }


                wordCopy = word;

            } else {
                //System.out.println(wordCopy);
                countOfAsterisk = numberOfAsterisk(wordCopy);
                for (int j = 0; j < auxSpace; j++) {
                    word += " ";
                }

                for (int k = 0; k < countOfAsterisk - 2; k++) {
                    word += "*";
                }

                wordCopy = word;
                auxSpace++;
                countOfAsterisk = numberOfAsterisk(word);
            }

            if (i == (n - 1)) {
                word = name;
                System.out.println(word);
            } else {
                System.out.println(word);
            }

        }
    }


    private int numberOfAsterisk(String word){
        int count = 0;
        char[] charsOfWord = word.toCharArray();


        //System.out.println(charsOfWord.length);
        for (int i = 0; i < charsOfWord.length; i++){
            //System.out.println(charsOfWord[i]);
            if (charsOfWord[i] == '*'){
                count++;
            }
        }

        return count;
    }

    private String defineNumberOfSpaces(int aux){
        String word = " ";
        for (int i = 0; i<aux; i++){
            word += " ";
        }

        return word;
    }

    public void FizzBuzz(){

        String text = "";

        for (int i = 1; i <= 100; i++){

            text = i+"";

            if ((i%3) == 0){
                text = "Fizz";
            }
            if((i%5) == 0){
                text = "Buzz";
            }
            if(((i%3) == 0) && ((i%5) == 0)){
                text = "FizzBuzz";
            }

            System.out.println(text);

        }
    }


    public ArrayList<Integer> PrimeFactors(int n){
        int i = 2, index = 0, size = 1;
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Prime Factors of "+n+": ");
        while (n > 1){

            if ((n % i) == 0){
                n = n/i;

                array.add(i);
                index++;

            }else {

                i++;
            }
        }

        return array;
    }

}
