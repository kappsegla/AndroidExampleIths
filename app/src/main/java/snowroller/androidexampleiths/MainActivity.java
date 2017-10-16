package snowroller.androidexampleiths;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    //Referenser till grafiska komponenterna
    private Button button2;
    private ProgressBar progressBar;
    private View online;

    private boolean onlineStatus = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) findViewById(R.id.button2);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        online = findViewById(R.id.onlineStatusView);
    }

    public void onButtonClicked(View view) {

        button2.setVisibility(View.INVISIBLE);
        progressBar.setVisibility(View.VISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                button2.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.INVISIBLE);
                onlineStatus = !onlineStatus;

                if (onlineStatus) {
                    online.setVisibility(View.VISIBLE);
                } else {
                    online.setVisibility(View.INVISIBLE);
                }
            }
        }, 1000);


    }
}
