package com.example.admin.criminalintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public abstract class SingleFramentActivity extends AppCompatActivity {
    protected abstract Fragment createFrament();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager=getSupportFragmentManager();
        android.support.v4.app.Fragment fragment=manager.findFragmentById(R.id.fragment_container);
        if (fragment==null){
            fragment=createFrament();
            manager.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }
    }
}
