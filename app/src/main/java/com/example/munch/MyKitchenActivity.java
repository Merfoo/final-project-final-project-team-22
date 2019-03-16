package com.example.munch;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

public class MyKitchenActivity extends AppCompatActivity {

    private BottomNavigationView mMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_kitchen);



        mMenu = findViewById(R.id.navigationView);
        mMenu.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.navigation_my_profile:
                                //Future Implementation if we have time to do this
                                return true;
                            case R.id.navigation_my_home:
                                Log.d(MainActivity.class.getSimpleName(), "in navigation my home logic");
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                                return true;
                            case R.id.navigation_my_kitchen:
                                //Nothing happens.
                                return true;
                        }
                        return true;
                    }
                });


    }

}