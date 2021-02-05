package com.example.insclone.Utils;

import android.content.Context;
import android.nfc.Tag;
import android.util.Log;

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

    }
}
