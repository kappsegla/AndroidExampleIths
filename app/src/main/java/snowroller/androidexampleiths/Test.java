package snowroller.androidexampleiths;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Test extends AppCompatActivity {

    private TextView textView;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        textView = (TextView)findViewById(R.id.textView6);

        sharedPreferences = getSharedPreferences("TestActivity",0);
        textView.setText(sharedPreferences.getString("textView6", "Default Value on first run"));
    }

    public void onEditClick(View view){
        Intent intent = new Intent(this, EditActivity.class);
        intent.putExtra("text", textView.getText().toString());

        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if( requestCode == 1){
            textView.setText(data.getStringExtra("answer"));
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("textView6",data.getStringExtra("answer"));
            editor.apply();  //Or commit() if return value is important.
        }
    }
}
