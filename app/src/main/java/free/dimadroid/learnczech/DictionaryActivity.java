package free.dimadroid.learnczech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DictionaryActivity extends AppCompatActivity {

    public static int iterator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);
        Button firstbutton = findViewById(R.id.button1);
        Button secondbutton = findViewById(R.id.button2);
        Button thirdbutton = findViewById(R.id.button3);
        Button fourthbutton = findViewById(R.id.button4);
        Button fifthbutton = findViewById(R.id.button5);
        Button sixthbutton = findViewById(R.id.button6);
        Button seventhbutton = findViewById(R.id.button7);
        Button eighthbutton = findViewById(R.id.button8);
        Button ninthbutton = findViewById(R.id.button9);
        Button tenthbutton = findViewById(R.id.button10);
        Button eleventhbutton = findViewById(R.id.button11);
        Button twelfthbutton = findViewById(R.id.button12);
        Button thirteenthbutton = findViewById(R.id.button13);
        Button fourteenthbutton = findViewById(R.id.button14);
        Button fifteenthbutton = findViewById(R.id.button15);
        Button sixteenthbutton = findViewById(R.id.button16);
        Button seventeenthbutton = findViewById(R.id.button17);
        Button nineteenbutton = findViewById(R.id.button18);
        Button eighteenbutton = findViewById(R.id.button19);
        Button twentynbutton = findViewById(R.id.button20);

        firstbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gsActivity();
            }
        });
        secondbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roomActivity();
            }
        });
        thirdbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transportActivity();
            }
        });
        fourthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bathroomActivity();
            }
        });
        fifthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kitchenActivity();
            }
        });
        sixthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weatherActivity();
            }
        });
        seventhbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendarActivity();
            }
        });
        eighthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cityActivity();
            }
        });
        ninthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                houseActivity();
            }
        });
        tenthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emergencyActivity();
            }
        });
        eleventhbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bankActivity();
            }
        });
        twelfthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodActivity();
            }
        });
        thirteenthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computerActivity();
            }
        });
        fourteenthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyActivity();
            }
        });
        fifteenthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruitsActivity();
            }
        });
        sixteenthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vegetablesActivity();
            }
        });
        seventeenthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animalsActivity();
            }
        });
        eighteenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clothingActivity();
            }
        });
        nineteenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thingsActivity();

            }
        });
        twentynbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                professionsActivity();
            }
        });
    }
    public void gsActivity(){
        iterator = 1;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void roomActivity(){
        iterator = 2;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void transportActivity(){
        iterator = 3;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void bathroomActivity(){
        iterator = 4;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void kitchenActivity(){
        iterator = 5;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void weatherActivity(){
        iterator = 6;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void calendarActivity(){
        iterator = 7;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void cityActivity(){
        iterator = 8;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void houseActivity(){
        iterator = 9;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void emergencyActivity(){
        iterator = 10;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void bankActivity(){
        iterator = 11;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void foodActivity(){
        iterator = 12;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void computerActivity(){
        iterator = 13;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void familyActivity(){
        iterator = 14;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void fruitsActivity(){
        iterator = 15;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void vegetablesActivity(){
        iterator = 16;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void animalsActivity(){
        iterator = 17;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void clothingActivity(){
        iterator = 18;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void thingsActivity(){
        iterator = 19;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }
    public void professionsActivity(){
        iterator = 20;
        Intent intent = new Intent(this, DictionaryOutputActivity.class);
        startActivity(intent);
    }

    public Integer getIterator(){
        return iterator;
    }
}