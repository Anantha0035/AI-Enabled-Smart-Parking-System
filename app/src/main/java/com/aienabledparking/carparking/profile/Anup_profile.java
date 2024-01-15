package com.aienabledparking.carparking.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.aienabledparking.carparking.R;

public class Anup_profile extends AppCompatActivity {
    TextView phone_profile,Location;
    Button call,what_call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anup_profile);

        what_call = findViewById(R.id.what_call);
        Location = findViewById(R.id.Location);

        what_call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("https://api.whatsapp.com/send/?phone=6281902423&text&app_absent=0");


            }
        });

        Location.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("https://goo.gl/maps/fHLoFSHs5PEzW4H1A");


            }
        });











    }

    private void gotoUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}