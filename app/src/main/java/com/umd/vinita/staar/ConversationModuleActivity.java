package com.umd.vinita.staar;
//
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.STAAR.artrial5.UnityPlayerActivity;
import com.umd.vinita.staar.Service.ProductService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConversationModuleActivity extends AppCompatActivity {
    private Button startModule;
    private ImageView  moduleThumbnail;
    private VideoView introVideoView, maintainVideoView, endVideoView;
    private final String INTROVIDEOURL = "https://s3.ap-south-1.amazonaws.com/staarumd/module+1-+intro.mp4";
    private final String MAINTAININGVIDEOURL = "https://s3.ap-south-1.amazonaws.com/staarumd/module+1-+intro.mp4";
    private final String ENDINGVIDEOURL = "https://s3.ap-south-1.amazonaws.com/staarumd/module+1-+intro.mp4";
    private final  String TAG = "Conversation Module";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation_module);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //moduleThumbnail = (ImageView) findViewById(R.id.ConversationModuleImageView);
        introVideoView = (VideoView) findViewById(R.id.ConversationModuleVideoView);
        //maintainVideoView = (VideoView) findViewById(R.id.ConversationModuleVideoView2);
        //endVideoView = (VideoView) findViewById(R.id.ConversationModuleVideoView3);
        setMediaPlayer(introVideoView,INTROVIDEOURL);
        Toast.makeText(this, " Loading Video ", Toast.LENGTH_SHORT).show();
       // introVideo.setVideoPath("https://youtu.be/8WBonnlREiU");
       // introVideo.start();
     //   moduleThumbnail.setImageResource(R.drawable.ic_menu_conversation_module );
        startModule = (Button) findViewById(R.id.button_start);
        startModule.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startModule();
            }}

        );


    }
    public void setMediaPlayer( VideoView videoview, String videoURL){
        try {
            // Start the MediaController
            MediaController mediacontroller = new MediaController(
                    ConversationModuleActivity.this);
            mediacontroller.setAnchorView(videoview);
            // Get the URL from String VideoURL
            Uri video = Uri.parse(videoURL);
            videoview.setMediaController(mediacontroller);
            videoview.setVideoURI(video);
            Toast.makeText(this, " Start Video by Tapping", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }

        videoview.requestFocus();
    }
//    @Override
//    public void onPrepared() {
//        //Starts the video playback as soon as it is ready
//        emVideoView.start();
//    }
//    private void setupVideoView() {
//        EMVideoView emVideoView = (EMVideoView)findViewById(R.id.ConversationModuleVideoView);
//        emVideoView.setOnPreparedListener(this);
//
//        //For now we just picked an arbitrary item to play.  More can be found at
//        //https://archive.org/details/more_animation
//        emVideoView.setVideoURI(Uri.parse());
//    }
    private void startModule(){
        Log.d(TAG, "startModule:");
        Intent intent = new Intent(this, UnityPlayerActivity.class);

        startActivity(intent);

//        Intent otherIntent = new Intent(this, ModuleVoice.class);
//
//        startActivity(otherIntent);
//
//
//
//        Intent serviceIntent = new Intent(this, com.umd.vinita.staar.Service.ConversationModuleIntentService.class);
//        serviceIntent.setAction("startTalking");
//        serviceIntent.putExtra("hi",true);
//        startService(serviceIntent);

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
//
