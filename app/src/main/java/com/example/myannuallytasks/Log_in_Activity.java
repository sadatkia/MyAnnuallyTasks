package com.example.myannuallytasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class Log_in_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        FragmentManager fragmentManager = getSupportFragmentManager();//      هر جا که قراره اد شود بزارید ولی معمولا همین جاست
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container_Login);

        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container_Login, new Log_in_Fragment())/////id container ,,,,,object Fragment
                .commit();

    }
}