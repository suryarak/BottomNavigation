package com.dreamz.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            bottomNavigationView=findViewById(R.id.bottomnav);

      bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
          switch (item.getItemId()){
              case R.id.home:
                  Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                  return true;
              case R.id.camera:
                  Toast.makeText(this, "Camera", Toast.LENGTH_SHORT).show();
                  return true;
              case R.id.message:
                  Toast.makeText(this, "Message", Toast.LENGTH_SHORT).show();
                  return true;
          }
          return false;
      });
      bottomNavigationView.setOnNavigationItemReselectedListener(item -> {
          switch (item.getItemId()){
              case R.id.home:
              case R.id.camera:
              case R.id.message:
          }
      });



        }
    }
