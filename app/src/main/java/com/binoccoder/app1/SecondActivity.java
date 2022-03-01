package com.binoccoder.app1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button first, second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        first=(Button)findViewById(R.id.btn_first);
        second=(Button)findViewById(R.id.btn_second);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFirstFragment();
            }
        });
        second.setOnClickListener(v->{
            loadSecondFragment();
        });
    }

    public void loadFirstFragment(){
        FirstFragment firstFragment=new FirstFragment();
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, firstFragment);
        transaction.commit();
    }

    public void loadSecondFragment(){
        SecondFragment secondFragment=new SecondFragment();
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, secondFragment);
        transaction.commit();
    }
}