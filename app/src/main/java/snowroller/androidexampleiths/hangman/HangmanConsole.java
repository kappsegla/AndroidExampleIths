package snowroller.androidexampleiths.hangman;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Martin on 2017-10-24.
 */

public class HangmanConsole {

    static void main(String[] args) {
        System.out.println("Welcome to HangmanActivity!!!!!!!!!!");
        String[] listwords = new String[10];
        listwords[0] = "sheep";
        listwords[1] = "goat";
        listwords[2] = "computer";
        listwords[3] = "america";
        listwords[4] = "watermelon";
        listwords[5] = "icecream";
        listwords[6] = "jasmine";
        listwords[7] = "pineapple";
        listwords[8] = "orange";
        listwords[9] = "mango";
        Random randGen = new Random();
        Scanner sc = new Scanner(System.in);
        //Random number
        int idx = randGen.nextInt(10);
        String mysteryWord = listwords[idx];
        char[] guess = new char[mysteryWord.length()];
        for (int p = 0; p < mysteryWord.length(); p++)
            guess[p] = '*';

        while (true) {

            System.out.print("Please enter your guess: ");
            char playerGuess = sc.next().charAt(0);
            for (int j = 0; j < mysteryWord.length(); j++) {
                if (playerGuess == mysteryWord.charAt(j))
                    guess[j] = playerGuess;
            }
            System.out.println(guess);
        }
    }
}
