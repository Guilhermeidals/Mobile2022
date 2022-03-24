package edu.uniritter.aula.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import edu.uniritter.aula.R;

public class SplashPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_splash);
        Handler handler = new Handler();
        handler.postDelayed(this::run, 1500);
    }

    public void run() {
        Intent intent = new Intent(getApplicationContext(), LoginPage.class);
        startActivity(intent);

    }
}

