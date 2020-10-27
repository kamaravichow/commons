package io.github.kamaravichow.common.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.github.kamaravichow.common.InternetUtils;

public class MainActivity extends AppCompatActivity {

    private InternetUtils internetUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        internetUtils = InternetUtils.getInstance(getApplicationContext());
        check();
    }

    private void check() {
        internetUtils.isConnectedMobile();
        internetUtils.isConnected();
    }
}