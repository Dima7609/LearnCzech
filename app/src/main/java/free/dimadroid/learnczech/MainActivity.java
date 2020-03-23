package free.dimadroid.learnczech;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button slovabutton = findViewById(R.id.buttonslova);
        slovabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slovaActivity();
            }
        });

        Button grammatikbutton = findViewById(R.id.buttongramatika);
        grammatikbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grammatikaActivity();
            }
        });

        Button quizbutton = findViewById(R.id.buttonquiz);
        quizbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quizActivity();
            }
        });

        Button additionbutton = findViewById(R.id.buttonadd);
        additionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                additionActivity();
            }
        });
    }
    public void slovaActivity(){
        Intent intent = new Intent(this, DictionaryActivity.class);
        startActivity(intent);
    }
    public void grammatikaActivity(){
        Intent intent = new Intent(this, GrammarActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                settingsActivity();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    public void quizActivity(){
        Intent intent = new Intent(this, AllQuiz.class);
        startActivity(intent);
    }
    public void additionActivity(){
        Intent intent = new Intent(this, ExtraInformationActivity.class);
        startActivity(intent);
    }
    public void settingsActivity(){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        openQuitDialog();
    }

    private void openQuitDialog() {
        AlertDialog.Builder quitDialog = new AlertDialog.Builder(this);
        quitDialog.setTitle("Вы дійсно хочете вийти?");
        quitDialog.setPositiveButton("Так", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        quitDialog.setNegativeButton("Ні", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        quitDialog.show();
    }
}