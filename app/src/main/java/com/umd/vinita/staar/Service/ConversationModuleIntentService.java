package com.umd.vinita.staar.Service;

import android.app.IntentService;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import net.gotev.speech.GoogleVoiceTypingDisabledException;
import net.gotev.speech.Speech;
import net.gotev.speech.SpeechDelegate;
import net.gotev.speech.SpeechRecognitionNotAvailable;

import java.util.List;


@RequiresApi(api = Build.VERSION_CODES.CUPCAKE)
public class ConversationModuleIntentService extends IntentService {
    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS

    private static final String TAG = "CM Intent Service";
    public static final String START_LISTENING = "startlistening";

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
            if(action.equals(START_LISTENING)) {
                try {
                    Speech.getInstance().startListening(new SpeechDelegate() {
                        @Override
                        public void onStartOfSpeech() {

                        }

                        @Override
                        public void onSpeechRmsChanged(float value) {

                        }

                        @Override
                        public void onSpeechPartialResults(List<String> results) {

                        }

                        @Override
                        public void onSpeechResult(String result) {

                        }
                    });
                } catch (SpeechRecognitionNotAvailable speechRecognitionNotAvailable) {
                    speechRecognitionNotAvailable.printStackTrace();
                } catch (GoogleVoiceTypingDisabledException e) {
                    e.printStackTrace();
                }
            }
            Log.d(TAG, "onHandleIntent: else");
        }
    }


    private void handleActionStartConversation(){
        throw new UnsupportedOperationException("Not yet implemented");

    }

}
