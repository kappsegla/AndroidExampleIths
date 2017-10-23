package snowroller.androidexampleiths;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    private ImageView imageView;
    private TypedArray pictures;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        pictures = getResources().obtainTypedArray(R.array.pictures);

        imageView = (ImageView) findViewById(R.id.imageViewGubbe);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if( i > pictures.length()-1)
                    i = 0;
               imageView.setImageResource(pictures.getResourceId(i, -1));
            }
        });
    }
}
