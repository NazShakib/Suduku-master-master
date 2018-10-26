package com.example.hasan.suduku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread splaceScreen  = new Thread() {       // init new Thread()
            public void run() {     //run function
                try{
                    sleep( 2 *1000);

                    Intent intent = new Intent(splash_screen.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e){

                }
            }
        };  //thread block
        splaceScreen.start();


    }
}
