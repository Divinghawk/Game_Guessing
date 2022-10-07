package com.Divinghawk.Guessing;

import java.util.Random;
import java.util.Scanner;

public class Main_Game_Guessing {
    private static final Random r = new Random(); // Randomize Number
    private static final int NUMBER = r.nextInt(100) + 1; // Cast Number in Int
    private static int guess = 0;

    public static void main(String[] args) {  
        Scanner player = new Scanner(System.in); // Player Input
            System.out.println("number is " + String.valueOf(NUMBER)); // Solution
            while ( guess != NUMBER ) {
            // prompt player for guess
            System.out.println("Guess a number between 1 and 100");
            guess = player.nextInt(); // player input in int
            if ( guess > NUMBER ) { //  If player input too high
                System.out.println("Too high");
            } else if ( guess < NUMBER ) { // If player input too low
                System.out.println("Too low");
            } else {
                System.out.println("That's right!"); // correct player input + exit + inputcloser
                System.exit(0);
                player.close();
            }
        }
  }
}
