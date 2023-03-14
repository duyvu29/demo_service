package com.example.demo_service;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnStart, btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.btnStart);
        btnStop = findViewById(R.id.btnStop);

        btnStart.setOnClickListener(v -> {
            startService(new Intent(this, BackgroundService.class));

            // Khai báo ForegroundService
            /**Intent intent = new Intent(this, ForegroundService.class);
            intent.putExtra("keyValueIntent", "This is my notification content !");
            ContextCompat.startForegroundService(this, intent);**/
        });

        btnStop.setOnClickListener(v -> {
            stopService(new Intent(this, BackgroundService.class));

            // Dừng ForegroundService
            /**Intent intent = new Intent(this, ForegroundService.class);
            stopService(intent);**/
        });
    }
}
