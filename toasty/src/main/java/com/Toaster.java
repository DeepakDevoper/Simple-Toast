package com;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void simpleDeepakToast(Context context, String msd){
        Toast.makeText(context, msd, Toast.LENGTH_SHORT).show();
    }
}
