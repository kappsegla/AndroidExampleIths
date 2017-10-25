package snowroller.androidexampleiths.hangman;

import android.os.Bundle;

import java.util.Random;

/**
 * Created by Martin on 2017-10-24.
 */

public class Hangman {

    private String[] listwords;
    private String mysteryWord;
    private  char[] guess;

    public Hangman(){
        listwords = new String[10];
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
        //Random number
        int idx = randGen.nextInt(10);
        mysteryWord = listwords[idx];
        guess = new char[mysteryWord.length()];
        for (int p = 0; p < mysteryWord.length(); p++)
            guess[p] = '*';
    }

    public Hangman(Bundle savedInstanceState){

    }

    public boolean makeGuess(char playerGuess){
        boolean hit = false;

        for (int j = 0; j < mysteryWord.length(); j++) {
            if (playerGuess == mysteryWord.charAt(j)) {
                guess[j] = playerGuess;
                hit = true;
            }
        }
        return hit;
    }

    public String getMaskedWord()
    {
        return String.valueOf(guess);
    }

    public void onSaveInstaceState(Bundle outState) {

    }
}
