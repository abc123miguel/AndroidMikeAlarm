package net.teach4ever.android.mikealarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BroadcastAlarm2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("DEBUG:","test");
        Toast.makeText(context, "20 seconds passed", Toast.LENGTH_LONG).show();

    }

}
