package com.androidlokomedia.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        ImageView bart = (ImageView) findViewById(R.id.img1);
        bart.animate().translationXBy(-1000f).setDuration(2000);
        Toast.makeText(getApplicationContext(),"okeke",Toast.LENGTH_SHORT).show();
//        ImageView bart2 = (ImageView) findViewById(R.id.img2);
//        bart.animate().alpha(1f).setDuration(2000);
//        bart2.animate().alpha(0f).setDuration(2000);
    }


}
