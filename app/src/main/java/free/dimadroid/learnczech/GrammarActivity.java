package free.dimadroid.learnczech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class GrammarActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinnercategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar);
        spinnercategory = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> myAdapter = ArrayAdapter.createFromResource(this, R.array.namesection, android.R.layout.simple_spinner_item);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnercategory.setAdapter(myAdapter);
        spinnercategory.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                return;
            case 1:
                Intent intentfirst = new Intent(this, AlphabetActivity.class);
                startActivity(intentfirst);
                return;
            case 2:
                Intent intentsecond = new Intent(this, FirstLectureActivity.class);
                startActivity(intentsecond);
                return;
            case 3:
                Intent intentthird = new Intent(this, SecondLectureActivity.class);
                startActivity(intentthird);
                return;
            case 4:
                Intent intentfourth = new Intent(this, ThirdLectureActivity.class);
                startActivity(intentfourth);
                return;
            case 5:
                Intent intentfifth = new Intent(this, FourthLectureActivity.class);
                startActivity(intentfifth);
                return;
            case 6:
                Intent intentsixth = new Intent(this, FifthLectureActivity.class);
                startActivity(intentsixth);
                return;
            case 7:
                Intent intentseventh = new Intent(this, SixthLectureActivity.class);
                startActivity(intentseventh);
                return;
            case 8:
                Intent intenteighth = new Intent(this, SeventhLectureActivity.class);
                startActivity(intenteighth);
                return;
            case 9:
                Intent intentninth = new Intent(this, EighthLectureActivity.class);
                startActivity(intentninth);
                return;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}