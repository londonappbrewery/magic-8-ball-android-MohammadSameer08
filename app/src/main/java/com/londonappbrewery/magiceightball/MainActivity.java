package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
ImageView ball;
Button btnAsk;
int askBall[]={R.drawable.ball1,
               R.drawable.ball2,
               R.drawable.ball3,
              R.drawable.ball4,
              R.drawable.ball5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ball=(ImageView)findViewById(R.id.image_eightBall);
        btnAsk=(Button) findViewById(R.id.askButton);
        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Random random=new Random();
                int r=random.nextInt(5);
                ball.setImageResource(askBall[r]);

            }
        });
    }
}
