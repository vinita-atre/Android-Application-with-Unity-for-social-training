package com.umd.vinita.staar.Service;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;


@RequiresApi(api = Build.VERSION_CODES.CUPCAKE)
public class ConversationModuleIntentService extends IntentService {
    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS

    private static final String TAG = "CM Intent Service";

    // TODO: Rename parameters


    public ConversationModuleIntentService() {
        super("ConversationModuleIntentService");
        Log.d(TAG, "ConversationModuleIntentService: check");
    }
        


    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if(action.equals("startTalking")){
                Log.d(TAG, "onHandleIntent: hi");
                handleActionStartConversation();
                
            }
            Log.d(TAG, "onHandleIntent: else");
        }
    }


    private void handleActionStartConversation(){
        throw new UnsupportedOperationException("Not yet implemented");

    }

}
