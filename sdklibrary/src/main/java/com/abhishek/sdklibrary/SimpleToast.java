package com.abhishek.sdklibrary;

import android.content.Context;
import android.widget.Toast;

public class SimpleToast {
    public static void showToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
