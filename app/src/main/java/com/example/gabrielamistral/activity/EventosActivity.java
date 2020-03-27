package com.example.gabrielamistral.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.activity.fragments.TestFragment;

public class EventosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        TestFragment testFragment = new TestFragment();
        fragmentTransaction.add(R.id.fragment_container, testFragment);
        fragmentTransaction.commit();
    }
}
