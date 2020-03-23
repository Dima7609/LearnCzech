package free.dimadroid.learnczech;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class FourthLectureActivity extends AppCompatActivity {

    Button prosit;

    MediaPlayer player;
    AllSounds alls = new AllSounds();
    ArrayList<Integer> verbmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_lecture);

        prosit = findViewById(R.id.button56);

        verbmusic = alls.getGoodservsound();

        prosit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(FourthLectureActivity.this, verbmusic.get(1));
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
