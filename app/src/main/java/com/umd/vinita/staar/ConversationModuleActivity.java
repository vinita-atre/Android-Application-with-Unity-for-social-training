package com.umd.vinita.staar;
//
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.STAAR.artrial5.UnityPlayerActivity;
import com.umd.vinita.staar.Service.ProductService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConversationModuleActivity extends AppCompatActivity {
    private Button startModule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation_module);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        startModule = (Button) findViewById(R.id.button_start);
        startModule.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startModule();
            }}

        );


    }
    private void startModule(){

        Intent intent = new Intent(this, UnityPlayerActivity.class);
        startActivity(intent);
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
