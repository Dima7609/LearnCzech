package free.dimadroid.learnczech;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class AlphabetActivity extends AppCompatActivity {

    Button byt;
    Button nebyt;
    Button budu;
    Button mit;
    Button jdujedu;
    Button zit;
    Button sit;
    Button cist;
    MediaPlayer player;

    AllSounds alls = new AllSounds();
    ArrayList<Integer> verbmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        byt = findViewById(R.id.button44);
        nebyt = findViewById(R.id.button45);
        budu = findViewById(R.id.button46);
        mit = findViewById(R.id.button47);
        jdujedu = findViewById(R.id.button48);
        zit = findViewById(R.id.button49);
        sit = findViewById(R.id.button50);
        cist = findViewById(R.id.button51);

        verbmusic = alls.getGoodservsound();

        byt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(AlphabetActivity.this, verbmusic.get(1));
                if (player.isPlaying()){
                    player.stop();
                    player.start();
                }
                else{
                    player.start();
                }
            }
        });
        nebyt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(AlphabetActivity.this, verbmusic.get(1));
                if (player.isPlaying()){
                    player.stop();
                    player.start();
                }
                else{
                    player.start();
                }
            }
        });
        budu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(AlphabetActivity.this, verbmusic.get(1));
                if (player.isPlaying()){
                    player.stop();
                    player.start();
                }
                else{
                    player.start();
                }
            }
        });
        mit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(AlphabetActivity.this, verbmusic.get(1));
                if (player.isPlaying()){
                    player.stop();
                    player.start();
                }
                else{
                    player.start();
                }
            }
        });
        jdujedu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(AlphabetActivity.this, verbmusic.get(1));
                if (player.isPlaying()){
                    player.stop();
                    player.start();
                }
                else{
                    player.start();
                }
            }
        });
        zit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(AlphabetActivity.this, verbmusic.get(1));
                if (player.isPlaying()){
                    player.stop();
                    player.start();
                }
                else{
                    player.start();
                }
            }
        });
        sit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(AlphabetActivity.this, verbmusic.get(1));
                if (player.isPlaying()){
                    player.stop();
                    player.start();
                }
                else{
                    player.start();
                }
            }
        });
        cist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(AlphabetActivity.this, verbmusic.get(1));
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
