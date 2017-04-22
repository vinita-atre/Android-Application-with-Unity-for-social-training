package com.umd.vinita.staar;
import android.app.Application;

import net.gotev.speech.Logger;
import net.gotev.speech.Speech;
/**
 * Created by Vinita on 3/19/2017.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Speech.init(this, getPackageName());
        //Speech.init(this);
        Logger.setLogLevel(Logger.LogLevel.DEBUG);
    }
}