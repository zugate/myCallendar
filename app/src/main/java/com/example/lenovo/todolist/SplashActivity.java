package com.example.lenovo.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.todolist.R;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash );

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                /*ProgressDialog pd = new ProgressDialog(SplashActivity.this);
                pd.setMessage("Loading.....");
                pd.show();*/
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    // pd.dismiss();
                    startActivity(new Intent(SplashActivity.this,MainActivity.class));

                }
            }
        });
        t.start();
    }
}

