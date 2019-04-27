package org.kazemicode.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Scene2 extends AppCompatActivity {
    Button btnAssert;
    Button btnSmile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene2);

        View overlay = findViewById(R.id.S2Layout);
        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        btnSmile = findViewById(R.id.btnSmile);
        btnAssert = findViewById(R.id.btnAssert);

        btnSmile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene2.this, org.kazemicode.afinal.Sexism.class);
                startActivity(intent);
                Scene2.this.finish();
            }
        });

        btnAssert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene2.this, org.kazemicode.afinal.ToBeContinued.class);
                startActivity(intent);
                Scene2.this.finish();
            }
        });

    }

}