package snowroller.androidexampleiths;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        editText = (EditText)findViewById(R.id.editText);
    }

    public void sendButton(View view){
        //Här ska vi starta aktivitet SecondActivity
        Intent intent = new Intent(this , SecondActivity.class);
        //Skicka med ett meddelande som en textsträng
        intent.putExtra("Message",editText.getText().toString());
        intent.putExtra("massage",true);


        startActivity(intent);
    }
}
