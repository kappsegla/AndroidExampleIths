package snowroller.androidexampleiths;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        editText = (EditText) findViewById(R.id.editText2);
        Intent intent = getIntent();
        editText.setText(intent.getStringExtra("text"));
    }

    public void onDoneClick(View view){


    }
}
