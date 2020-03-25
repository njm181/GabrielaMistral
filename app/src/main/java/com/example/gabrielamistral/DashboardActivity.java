package com.example.gabrielamistral;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.gabrielamistral.dummy.DummyContent;

public class DashboardActivity extends AppCompatActivity implements EventoFragment.OnListFragmentInteractionListener {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);



    }


    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
