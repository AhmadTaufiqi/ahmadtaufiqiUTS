package com.kipli.myprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardViewNext = findViewById(R.id.next_profile);
        cardViewNext.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.next_profile:
                Intent profileIntent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
        }
    }
}
