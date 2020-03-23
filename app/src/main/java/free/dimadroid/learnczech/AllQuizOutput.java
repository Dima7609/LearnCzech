package free.dimadroid.learnczech;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class AllQuizOutput extends AppCompatActivity {

    TextView displayquestion;
    TextView answerscore;

    Button answer;
    Button voice;

    String check;
    String nextcheck;

    EditText numberEditText;
    MediaPlayer player;

    AllQuiz all = new AllQuiz();
    AllWords allw = new AllWords();
    AllSounds alls = new AllSounds();
    ArrayList<Integer> listofsounds;
    ArrayList<String> sampleorig;
    ArrayList<String> sampletranslt;

    Random rand = new Random();
    int random_number = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_quiz_output);

        displayquestion = findViewById(R.id.textView5);
        answer = findViewById(R.id.button40);
        answerscore = findViewById(R.id.textView4);
        numberEditText = findViewById(R.id.editText);
        voice = findViewById(R.id.button41);
        int catindex = all.getIterator();

        numberEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                check = numberEditText.getText().toString().trim();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        if(catindex == 1){
            sampleorig = allw.getOriginalGoodServices();
            sampletranslt = allw.getTranslateGoodServices();
            listofsounds = alls.getGoodservsound();
        }
        else if(catindex == 2){
            sampleorig = allw.getLivingorig();
            sampletranslt = allw.getLivingtranslt();
            listofsounds = alls.getLivingsound();
        }
        else if(catindex == 3){
            sampleorig = allw.getTransportorig();
            sampletranslt = allw.getTransporttranslt();
            listofsounds = alls.getTransportsound();
        }
        else if(catindex == 4){
            sampleorig = allw.getBathroomorig();
            sampletranslt = allw.getBathroomtranslt();
            listofsounds = alls.getBathroomsound();
        }
        else if(catindex == 5){
            sampleorig = allw.getKitchenorig();
            sampletranslt = allw.getKitchentranslt();
            listofsounds = alls.getKitchensound();
        }
        else if(catindex == 6){
            sampleorig = allw.getWeatherorig();
            sampletranslt = allw.getWeathertranslt();
            listofsounds = alls.getWeathersound();
        }
        else if(catindex == 7){
            sampleorig = allw.getCalendarorig();
            sampletranslt = allw.getCalendartranslt();
            listofsounds = alls.getCalendarsound();
        }
        else if(catindex == 8){
            sampleorig = allw.getCityorig();
            sampletranslt = allw.getCitytranslt();
            listofsounds = alls.getCitysound();
        }
        else if(catindex == 9){
            sampleorig = allw.getHouseorig();
            sampletranslt = allw.getHousetranslt();
            listofsounds = alls.getHousesound();
        }
        else if(catindex == 10){
            sampleorig = allw.getEmergencyorig();
            sampletranslt = allw.getEmergencytranslt();
            listofsounds = alls.getEmergencysound();
        }
        else if(catindex == 11){
            sampleorig = allw.getBankorig();
            sampletranslt = allw.getBanktranslt();
            listofsounds = alls.getBanksound();
        }
        else if(catindex == 12){
            sampleorig = allw.getFoodorig();
            sampletranslt = allw.getFoodtranslt();
            listofsounds = alls.getFoodsound();
        }
        else if(catindex == 13){
            sampleorig = allw.getComputerorig();
            sampletranslt = allw.getComputertranslt();
            listofsounds = alls.getComputersound();
        }
        else if(catindex == 14){
            sampleorig = allw.getFamilyorig();
            sampletranslt = allw.getFamilytranslt();
            listofsounds = alls.getFamilysound();
        }
        else if(catindex == 15){
            sampleorig = allw.getFruitsorig();
            sampletranslt = allw.getFruitstranslt();
            listofsounds = alls.getFruitssound();
        }
        else if(catindex == 16){
            sampleorig = allw.getVegetablesorig();
            sampletranslt = allw.getVegetablestranslt();
            listofsounds = alls.getVegetablessound();
        }
        else if(catindex == 17){
            sampleorig = allw.getAnimalsorig();
            sampletranslt = allw.getAnimalstranslt();
            listofsounds = alls.getAnimalssound();
        }
        else if(catindex == 18){
            sampleorig = allw.getClothingorig();
            sampletranslt = allw.getClothingtranslt();
            listofsounds = alls.getClothingsound();
        }
        else if(catindex == 19){
            sampleorig = allw.getThingsorig();
            sampletranslt = allw.getThingstranslt();
            listofsounds = alls.getThingssound();
        }
        else if(catindex == 20){
            sampleorig = allw.getProfessionsorig();
            sampletranslt = allw.getProfessionstranslt();
            listofsounds = alls.getProfessionsound();
        }

        numberEditText.setText("Натисніть на кнопку щоб почати");
        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voice.setVisibility(View.VISIBLE);
                if(check.equals(sampletranslt.get(random_number))){
                    random_number = rand.nextInt(sampleorig.size());
                    nextcheck = sampleorig.get(random_number);
                    displayquestion.setText("Напишіть переклад слова " + nextcheck);
                    score++;
                    answerscore.setText(String.valueOf(score));
                    numberEditText.getText().clear();
                }
                else{
                    random_number = rand.nextInt(sampleorig.size());
                    nextcheck = sampleorig.get(random_number);
                    displayquestion.setText("Напишіть переклад слова " + nextcheck);
                    numberEditText.getText().clear();
                }
            }
        });

        voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(AllQuizOutput.this, listofsounds.get(random_number));
                if (player.isPlaying()){
                    player.stop();
                    player.start();
                }
                else{
                    player.start();
                }
            }
        });
    }
}