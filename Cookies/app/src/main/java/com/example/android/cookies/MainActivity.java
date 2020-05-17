package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.

        // TODO: Find a reference to the TextView in the layout. Change the text.
        ImageView aftercookieView = (ImageView) findViewById(R.id.android_cookie_image_view);
        aftercookieView.setImageResource(R.drawable.after_cookie);

        TextView statusIntitializeTextView = (TextView) findViewById(R.id.status_text_view);
        statusIntitializeTextView.setText("I'm Totally Full :) ");

    }
}