package free.dimadroid.learnczech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DictionaryOutputActivity extends AppCompatActivity {

    AllWords aw = new AllWords();
    DictionaryActivity dca = new DictionaryActivity();
    int categoryindex = dca.getIterator();

    TextView textoriginal;
    TextView texttranslt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary_output);

        textoriginal = findViewById(R.id.textView);
        texttranslt = findViewById(R.id.textView2);

        if(categoryindex == 1){
            firstVoid();
        }
        else if(categoryindex == 2){
            secondVoid();
        }
        else if(categoryindex == 3){
            thirdVoid();
        }
        else if(categoryindex == 4){
            fourthVoid();
        }
        else if(categoryindex == 5){
            fifthVoid();
        }
        else if(categoryindex == 6){
            sixthVoid();
        }
        else if(categoryindex == 7){
            seventhVoid();
        }
        else if(categoryindex == 8){
            eighthVoid();
        }
        else if(categoryindex == 9){
            ninthVoid();
        }
        else if(categoryindex == 10){
            tenthVoid();
        }
        else if(categoryindex == 11){
            eleventhVoid();
        }
        else if(categoryindex == 12){
            twelfthVoid();
        }
        else if(categoryindex == 13){
            thirteenthVoid();
        }
        else if(categoryindex == 14){
            fourteenthVoid();
        }
        else if(categoryindex == 15){
            fifteenthVoid();
        }
        else if(categoryindex == 16){
            sixteenthVoid();
        }
        else if(categoryindex == 17){
            seventeenthVoid();
        }
        else if(categoryindex == 18){
            eighteenthVoid();
        }
        else if(categoryindex == 19){
            nineteenthVoid();
        }
        else if(categoryindex == 20){
            twentiethVoid();
        }
    }

    public void firstVoid(){
        ArrayList<String> sampleorig = aw.getOriginalGoodServices();
        ArrayList<String> sampletranslt = aw.getTranslateGoodServices();
        for(String i : sampleorig){
            textoriginal.append(i+ "\n\n");
        }
        for(String i : sampletranslt) {
            texttranslt.append(i + "\n\n" + " ");
        }
    }
    public void secondVoid(){
        ArrayList<String> sampleorig = aw.getLivingorig();
        ArrayList<String> sampletranslt = aw.getLivingtranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void thirdVoid(){
        ArrayList<String> sampleorig = aw.getTransportorig();
        ArrayList<String> sampletranslt = aw.getTransporttranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void fourthVoid(){
        ArrayList<String> sampleorig = aw.getBathroomorig();
        ArrayList<String> sampletranslt = aw.getBathroomtranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void fifthVoid(){
        ArrayList<String> sampleorig = aw.getKitchenorig();
        ArrayList<String> sampletranslt = aw.getKitchentranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void sixthVoid(){
        ArrayList<String> sampleorig = aw.getWeatherorig();
        ArrayList<String> sampletranslt = aw.getWeathertranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void seventhVoid(){
        ArrayList<String> sampleorig = aw.getCalendarorig();
        ArrayList<String> sampletranslt = aw.getCalendartranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void eighthVoid(){
        ArrayList<String> sampleorig = aw.getCityorig();
        ArrayList<String> sampletranslt = aw.getCitytranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void ninthVoid(){
        ArrayList<String> sampleorig = aw.getHouseorig();
        ArrayList<String> sampletranslt = aw.getHousetranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void tenthVoid(){
        ArrayList<String> sampleorig = aw.getEmergencyorig();
        ArrayList<String> sampletranslt = aw.getEmergencytranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void eleventhVoid(){
        ArrayList<String> sampleorig = aw.getBankorig();
        ArrayList<String> sampletranslt = aw.getBanktranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void twelfthVoid(){
        ArrayList<String> sampleorig = aw.getFoodorig();
        ArrayList<String> sampletranslt = aw.getFoodtranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void thirteenthVoid(){
        ArrayList<String> sampleorig = aw.getComputerorig();
        ArrayList<String> sampletranslt = aw.getComputertranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void fourteenthVoid(){
        ArrayList<String> sampleorig = aw.getFamilyorig();
        ArrayList<String> sampletranslt = aw.getFamilytranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void fifteenthVoid(){
        ArrayList<String> sampleorig = aw.getFruitsorig();
        ArrayList<String> sampletranslt = aw.getFruitstranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void sixteenthVoid(){
        ArrayList<String> sampleorig = aw.getVegetablesorig();
        ArrayList<String> sampletranslt = aw.getVegetablestranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void seventeenthVoid(){
        ArrayList<String> sampleorig = aw.getAnimalsorig();
        ArrayList<String> sampletranslt = aw.getAnimalstranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void nineteenthVoid(){
        ArrayList<String> sampleorig = aw.getClothingorig();
        ArrayList<String> sampletranslt = aw.getClothingtranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void eighteenthVoid(){
        ArrayList<String> sampleorig = aw.getThingsorig();
        ArrayList<String> sampletranslt = aw.getThingstranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
    public void twentiethVoid(){
        ArrayList<String> sampleorig = aw.getProfessionsorig();
        ArrayList<String> sampletranslt = aw.getProfessionstranslt();
        for(String i : sampleorig){
            textoriginal.append(i+"\n\n");
        }
        for(String i : sampletranslt){
            texttranslt.append(i+"\n\n" + " ");
        }
    }
}