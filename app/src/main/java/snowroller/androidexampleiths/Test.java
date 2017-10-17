package snowroller.androidexampleiths;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Test extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        textView = (TextView)findViewById(R.id.textView6);
    }

    public void onEditClick(View view){
        Intent intent = new Intent(this, EditActivity.class);
        intent.putExtra("text", textView.getText().toString());

        startActivity(intent);

    }
}
