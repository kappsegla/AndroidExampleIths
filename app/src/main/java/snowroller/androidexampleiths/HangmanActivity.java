package snowroller.androidexampleiths;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import snowroller.androidexampleiths.hangman.Hangman;

public class HangmanActivity extends AppCompatActivity {

    private Hangman hangmanGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangman);
        if( savedInstanceState != null)
            hangmanGame = new Hangman(savedInstanceState);
        else
            hangmanGame = new Hangman();

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        hangmanGame.onSaveInstaceState(outState);
    }
}
