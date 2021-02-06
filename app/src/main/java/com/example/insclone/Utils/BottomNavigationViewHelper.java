package com.example.insclone.Utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.insclone.Likes.LikesActivity;
import com.example.insclone.Main.MainActivity;
import com.example.insclone.Profile.ProfileActivity;
import com.example.insclone.R;
import com.example.insclone.Search.SearchActivity;
import com.example.insclone.Share.ShareActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupNavigationView: Setting up  BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);

    }

    public static void enableNavigation(final Context context,BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, MainActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        Intent intent2 = new Intent(context, SearchActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_circle:
                        Intent intent3 = new Intent(context, ShareActivity.class);
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_alert:
                        Intent intent4 = new Intent(context, LikesActivity.class);
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_android:
                        Intent intent5 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }
}
