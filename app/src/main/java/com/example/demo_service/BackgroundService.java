package com.example.demo_service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class BackgroundService extends Service {
    private MediaPlayer mPlayer;
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mPlayer = MediaPlayer.create(this, R.raw.seetinh);
        mPlayer.setLooping(false);
        mPlayer.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPlayer.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
