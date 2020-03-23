package free.dimadroid.learnczech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllQuiz extends AppCompatActivity {

    public static int newiterator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_quiz);

        Button goodsservices = findViewById(R.id.button);
        Button room = findViewById(R.id.button21);
        Button transport = findViewById(R.id.button22);
        Button bathroomandwc = findViewById(R.id.button23);
        Button kitchen = findViewById(R.id.button24);
        Button weather = findViewById(R.id.button25);
        Button calendar = findViewById(R.id.button26);
        Button city = findViewById(R.id.button27);
        Button house = findViewById(R.id.button28);
        Button emergency = findViewById(R.id.button29);
        Button bank = findViewById(R.id.button30);
        Button food = findViewById(R.id.button31);
        Button computer = findViewById(R.id.button32);
        Button family = findViewById(R.id.button33);
        Button fruits = findViewById(R.id.button34);
        Button vegetables = findViewById(R.id.button35);
        Button animals = findViewById(R.id.button36);
        Button clothing = findViewById(R.id.button37);
        Button subjects = findViewById(R.id.button38);
        Button profession = findViewById(R.id.button39);

        goodsservices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goodsservicesVoid();
            }
        });
        room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roomVoid();
            }
        });
        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transportVoid();
            }
        });
        bathroomandwc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bathroomVoid();
            }
        });
        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kitchenVoid();
            }
        });
        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weatherVoid();
            }
        });
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendarVoid();
            }
        });
        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cityVoid();
            }
        });
        house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                houseVoid();
            }
        });
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emergencyVoid();
            }
        });
        bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bankVoid();
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodVoid();
            }
        });
        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computerVoid();
            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyVoid();
            }
        });
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruitsVoid();
            }
        });
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vegetablesVoid();
            }
        });
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animalsVoid();
            }
        });
        clothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clothingActivity();
            }
        });
        subjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thingsVoid();
            }
        });
        profession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                professionsActivity();
            }
        });
    }

    public void goodsservicesVoid(){
        newiterator = 1;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void roomVoid(){
        newiterator = 2;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void transportVoid(){
        newiterator = 3;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void bathroomVoid(){
        newiterator = 4;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void kitchenVoid(){
        newiterator = 5;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void weatherVoid(){
        newiterator = 6;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void calendarVoid(){
        newiterator = 7;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void cityVoid(){
        newiterator = 8;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void houseVoid(){
        newiterator = 9;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void emergencyVoid(){
        newiterator = 10;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void bankVoid(){
        newiterator = 11;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void foodVoid(){
        newiterator = 12;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void computerVoid(){
        newiterator = 13;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void familyVoid(){
        newiterator = 14;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void fruitsVoid(){
        newiterator = 15;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void vegetablesVoid(){
        newiterator = 16;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void animalsVoid(){
        newiterator = 17;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void clothingActivity(){
        newiterator = 18;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void thingsVoid(){
        newiterator = 19;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }
    public void professionsActivity(){
        newiterator = 20;
        Intent intent = new Intent(this, AllQuizOutput.class);
        startActivity(intent);
    }

    public Integer getIterator(){
        return newiterator;
    }
}