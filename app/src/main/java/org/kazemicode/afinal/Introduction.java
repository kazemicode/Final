package org.kazemicode.afinal;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Introduction extends AppCompatActivity {

    Button btnGetUp;
    Button btnStay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        View overlay = findViewById(R.id.myIntroLayout);
        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        btnStay = findViewById(R.id.btnStay);
        btnGetUp = findViewById(R.id.btnGetUp);

        btnStay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduction.this, org.kazemicode.afinal.GameOver.class);
                startActivity(intent);
                Introduction.this.finish();
            }
        });

        btnGetUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduction.this, org.kazemicode.afinal.Scene2.class);
                startActivity(intent);
                Introduction.this.finish();
            }
        });
    }

}
