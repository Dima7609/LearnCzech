package free.dimadroid.learnczech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExtraInformationActivity extends AppCompatActivity {

    Button gotosearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_information);

        gotosearch = findViewById(R.id.button42);

        gotosearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotosearchVoid();
            }
        });
    }

    public void gotosearchVoid(){
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }
}
