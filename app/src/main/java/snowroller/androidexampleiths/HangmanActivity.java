package snowroller.androidexampleiths;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import snowroller.androidexampleiths.hangman.AndroidHangman;

public class HangmanActivity extends AppCompatActivity {

    private AndroidHangman hangmanGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangman);
        if( savedInstanceState != null)
            hangmanGame = new AndroidHangman(savedInstanceState);
        else
            hangmanGame = new AndroidHangman();

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        hangmanGame.onSaveInstaceState(outState);
    }
}
