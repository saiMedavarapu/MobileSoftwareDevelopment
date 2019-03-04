//package com.example.rajkiran.crickclub;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class splash extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
//        Thread myThread=new Thread(){
//
//            @Override
//            public void run() {
//                try {
//                    sleep(5000);
//                    Intent intent= new Intent(getApplicationContext(),MainActivity.class);
//                    startActivity(intent);
//                    finish();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        myThread.start();
//    }
//}



package com.example.rajkiran.crickclub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Button easy = findViewById(R.id.button2);
        Button medium = findViewById(R.id.button3);
        Button hard = findViewById(R.id.button4);


        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuizEasy();
            }
        });


        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuizMedium();
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuizHard();
            }
        });

    }

    private void startQuizEasy()
    {
        Intent intent1 = new Intent(splash.this, MainActivity.class);
        startActivity(intent1);
    }

    private void startQuizMedium()
    {
        Intent intent1 = new Intent(splash.this, MainActivityMedium.class);
        startActivity(intent1);
    }


    private void startQuizHard()
    {
        Intent intent1 = new Intent(splash.this, MainActivityHard.class);
        startActivity(intent1);
    }
}

