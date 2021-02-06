package com.example.insclone.Profile;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.insclone.R;
import com.example.insclone.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "ProfileActivity";
    private static final int ACTIVITY_NUM = 4;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG, "onCreate: started");

        //setUpBottomNavigationView();
        setUpToolbar();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void setUpToolbar(){
        Toolbar toolbar = findViewById(R.id.profileToolBar);
        setSupportActionBar(toolbar);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener(){
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Log.d(TAG, "onMenuItemClick: Clicked menu items"+item);
                switch (item.getItemId()){
                    case R.id.profileName:
                        Log.d(TAG, "onMenuItemClick: Navigating to profile preference");


                }
                return false;
            }
        });
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}