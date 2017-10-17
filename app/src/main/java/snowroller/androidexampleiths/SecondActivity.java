package snowroller.androidexampleiths;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Hämta intentet som startade oss
        Intent intent = getIntent();

        String text = intent.getStringExtra("Message");
        boolean massage = intent.getBooleanExtra("massage", false);
        textView = (TextView)findViewById(R.id.textView5);
        textView.setText(text);
    }
}
