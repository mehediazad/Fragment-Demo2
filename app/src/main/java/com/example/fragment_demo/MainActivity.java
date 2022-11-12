package com.example.fragment_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.fragment_demo.fragment.HomeFragment;
import com.example.fragment_demo.fragment.ProfileFragment;
import com.example.fragment_demo.fragment.SettingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


   BottomNavigationView BottomNavigationViewId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationViewId = findViewById(R.id.BottomNavigationViewId);



        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayoutId,new HomeFragment()).commit();
        }



        BottomNavigationViewId.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                if (item.getItemId() == R.id.HomeId){
                    fragment = new HomeFragment();

                }

                if (item.getItemId()== R.id.ProfileId){
                    fragment = new ProfileFragment();
                }

                if (item.getItemId() == R.id.SettingId){
                    fragment = new SettingFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayoutId,fragment).commit();

                return false;
            }
        });


    }




}