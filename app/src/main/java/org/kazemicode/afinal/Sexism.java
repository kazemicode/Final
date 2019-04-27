package org.kazemicode.afinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sexism extends AppCompatActivity {
    Button btnReadMore;
    Button btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexism);

        View overlay = findViewById(R.id.sexismLayout);
        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


        btnReadMore = findViewById(R.id.btnReadSexism);
        btnRestart = findViewById(R.id.btnPlayAgain);

        btnReadMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.careercontessa.com/advice/women-sexism-in-the-workplace/"));
                startActivity(intent);
            }
        });

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sexism.this, org.kazemicode.afinal.MainActivity.class);
                startActivity(intent);
                Sexism.this.finish();

            }
        });
    }
}
