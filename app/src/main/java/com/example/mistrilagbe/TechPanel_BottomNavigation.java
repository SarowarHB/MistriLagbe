package com.example.mistrilagbe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.mistrilagbe.techPanel.TechHomeFragment;
import com.example.mistrilagbe.techPanel.TechOrderFragment;
import com.example.mistrilagbe.techPanel.TechPendingOrderFragment;
import com.example.mistrilagbe.techPanel.TechProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TechPanel_BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_panel__bottom_navigation);
        BottomNavigationView navigationView = findViewById(R.id.tech_bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.chefHome:
                fragment=new TechHomeFragment();
                break;
            case R.id.PendingOrders:
                fragment=new TechPendingOrderFragment();
                break;
            case R.id.Orders:
                fragment=new TechOrderFragment();
                break;
            case R.id.chefProfile:
                fragment=new TechProfileFragment();
                break;
        }
        return loadcheffragment(fragment);
    }

    private boolean loadcheffragment(Fragment fragment) {

        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,fragment).commit();
            return true;
        }
        return false;
    }
}