package com.example.insclone.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;

import com.example.insclone.R;
import com.example.insclone.Utils.BottomNavigationViewHelper;
import com.example.insclone.Fragment_camera;
import com.example.insclone.Fragment_main;
import com.example.insclone.Fragment_message;
import com.google.android.material.tabs.TabLayout;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int ACTIVITY_NUM =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting");

        setUpBottomNavigationView();
        setupViewPager();
    }

    /**
     * Responsible for adding the 3 tabs: Camera, Main, Mseeage
     */
    private void setupViewPager() {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment_camera());//Index 0
        adapter.addFragment(new Fragment_main());//Index 1
        adapter.addFragment(new Fragment_message());//Index 2
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById((R.id.tabs));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_instagram);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_send);

    }
    /**
     * BottomNavigationView Set up
     */
    private void setUpBottomNavigationView(){
        Log.d(TAG, "setUpBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx)findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(this,bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);

    }
}