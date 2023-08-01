package com.daizzyinfo.worldclock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class NavigationDrawer extends AppCompatActivity {

    NavigationView nav_view;
    DrawerLayout drawer_layout;
    ImageView openNavigationDrawer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        nav_view=findViewById(R.id.nav_view);
        drawer_layout=findViewById(R.id.drawer_layout);
        openNavigationDrawer=findViewById(R.id.openNavigationDrawer);


        openNavigationDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isOpen();
                Toast.makeText(NavigationDrawer.this, "sfdgsdfg", Toast.LENGTH_SHORT).show();

            }
        });



    }

    public void isOpen() {


        drawer_layout.openDrawer(Gravity.LEFT);


    }


}