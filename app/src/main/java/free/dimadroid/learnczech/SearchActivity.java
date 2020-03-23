package free.dimadroid.learnczech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    TextView getorig;
    TextView gettranslt;
    EditText wordsearch;
    Button clicksearch;
    String enterword;
    String firststring;
    String secondstring;
    int index;

    AllWords aw = new AllWords();
    ArrayList<String> translеword;

    ArrayList<String> firstoriginal = aw.getOriginalGoodServices();
    ArrayList<String> secondoriginal = aw.getLivingorig();
    ArrayList<String> thirdoriginal = aw.getTransportorig();
    ArrayList<String> fourthoriginal = aw.getBathroomorig();
    ArrayList<String> fifthoriginal = aw.getKitchenorig();
    ArrayList<String> sixthoriginal = aw.getWeatherorig();
    ArrayList<String> seventhoriginal = aw.getCalendarorig();
    ArrayList<String> eighthoriginal = aw.getCityorig();
    ArrayList<String> ninthoriginal = aw.getHouseorig();
    ArrayList<String> tenthoriginal = aw.getEmergencyorig();
    ArrayList<String> eleventhoriginal = aw.getBankorig();
    ArrayList<String> twelfthoriginal = aw.getFoodorig();
    ArrayList<String> thirteenthoriginal = aw.getComputerorig();
    ArrayList<String> fourteenthoriginal = aw.getFamilyorig();
    ArrayList<String> fifteenthoriginal = aw.getFruitsorig();
    ArrayList<String> sixteenthoriginal = aw.getVegetablesorig();
    ArrayList<String> seventeenthoriginal = aw.getAnimalsorig();
    ArrayList<String> eighteenthoriginal = aw.getThingsorig();
    ArrayList<String> nineteenthoriginal = aw.getClothingorig();
    ArrayList<String> twentiethoriginal = aw.getProfessionsorig();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        getorig = findViewById(R.id.textView7);
        gettranslt = findViewById(R.id.textView8);
        wordsearch = findViewById(R.id.editText2);
        clicksearch = findViewById(R.id.button43);

        wordsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                enterword = wordsearch.getText().toString().trim();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        clicksearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkVoid();
            }
        });

    }

    public void checkVoid(){
        if (firstoriginal.contains(enterword)){
            index = firstoriginal.indexOf(enterword);
            translеword = aw.getTranslateGoodServices();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(secondoriginal.contains(enterword)){
            index = secondoriginal.indexOf(enterword);
            translеword = aw.getLivingtranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(thirdoriginal.contains(enterword)){
            index = thirdoriginal.indexOf(enterword);
            translеword = aw.getTransporttranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(fourthoriginal.contains(enterword)){
            index = fourthoriginal.indexOf(enterword);
            translеword = aw.getBathroomtranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(fifthoriginal.contains(enterword)){
            index = fifthoriginal.indexOf(enterword);
            translеword = aw.getKitchentranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(sixthoriginal.contains(enterword)){
            index = sixthoriginal.indexOf(enterword);
            translеword = aw.getWeathertranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(seventhoriginal.contains(enterword)){
            index = seventhoriginal.indexOf(enterword);
            translеword = aw.getCalendartranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(eighthoriginal.contains(enterword)){
            index = eighthoriginal.indexOf(enterword);
            translеword = aw.getCitytranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(ninthoriginal.contains(enterword)){
            index = ninthoriginal.indexOf(enterword);
            translеword = aw.getHousetranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(tenthoriginal.contains(enterword)){
            index = tenthoriginal.indexOf(enterword);
            translеword = aw.getEmergencytranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(eleventhoriginal.contains(enterword)){
            index = eleventhoriginal.indexOf(enterword);
            translеword = aw.getBanktranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(twelfthoriginal.contains(enterword)){
            index = twelfthoriginal.indexOf(enterword);
            translеword = aw.getFoodtranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(thirteenthoriginal.contains(enterword)){
            index = thirteenthoriginal.indexOf(enterword);
            translеword = aw.getComputertranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(fourteenthoriginal.contains(enterword)){
            index = fourteenthoriginal.indexOf(enterword);
            translеword = aw.getFamilytranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(fifteenthoriginal.contains(enterword)){
            index = fifteenthoriginal.indexOf(enterword);
            translеword = aw.getFruitstranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(sixteenthoriginal.contains(enterword)){
            index = sixteenthoriginal.indexOf(enterword);
            translеword = aw.getVegetablestranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(seventeenthoriginal.contains(enterword)){
            index = seventeenthoriginal.indexOf(enterword);
            translеword = aw.getAnimalstranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(eighteenthoriginal.contains(enterword)){
            index = eighteenthoriginal.indexOf(enterword);
            translеword = aw.getThingstranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(nineteenthoriginal.contains(enterword)){
            index = nineteenthoriginal.indexOf(enterword);
            translеword = aw.getClothingtranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else if(twentiethoriginal.contains(enterword)){
            index = twentiethoriginal.indexOf(enterword);
            translеword = aw.getProfessionstranslt();
            firststring = translеword.get(index);
            getorig.setText("Оригінал: " + enterword);
            gettranslt.setText("Переклад: " + firststring);
        }
        else{
            getorig.setText("Дане слово відсутнє в словнику");
            gettranslt.setText("");
        }
        wordsearch.getText().clear();
    }
}