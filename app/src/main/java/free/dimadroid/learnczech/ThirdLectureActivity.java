package free.dimadroid.learnczech;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ThirdLectureActivity extends AppCompatActivity {

    Button delat;

    MediaPlayer player;
    AllSounds alls = new AllSounds();
    ArrayList<Integer> verbmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_lecture);

        delat = findViewById(R.id.button55);

        verbmusic = alls.getGoodservsound();

        delat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(ThirdLectureActivity.this, verbmusic.get(1));
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
