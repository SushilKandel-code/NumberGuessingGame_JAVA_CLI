package com.example.gameChallenge;

import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String args[]){
        System.out.println("Welcome to Gaming world");
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Welcome " + name);
        System.out.println("Would you like to start the game? \n\t 1: Yes \n\t 2: No");
        int answer = scanner.nextInt();
        while(answer != 1){
            System.out.println("Would you like to start the game? \n\t 1: Yes \n\t 2: No");
            answer = scanner.nextInt();
        }
        Random random = new Random();
        int number = random.nextInt(30 + 1);

        System.out.println("Guess one number between 0 to 30");
        int guessNumber = scanner.nextInt();

        int playTime = 0;
        boolean hasFinished = false;
        boolean hasWon = false;

        while (!hasFinished){
            playTime++;
            if(playTime<5){
                if(guessNumber==number){
                    hasFinished = true;
                    hasWon = true;
                }else if(guessNumber>number){
                    System.out.println("Please guess the lower number");
                    guessNumber = scanner.nextInt();
                }else{
                    System.out.println("Please guess the higher number");
                    guessNumber = scanner.nextInt();
                }

            }else{
                hasFinished=true;
            }


        }

        if(hasWon == true){
            System.out.println("Congratulation " + name + ", you have won the game in " + playTime + " times");
        } else{
            System.out.println("Game over");
            System.out.println("The number was " + number);

        }
    }
}
