package com.example.myfirstapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private AppCompatImageView mPhoto;
    private TextView mLogin;
    private TextView mPassword;

    private View.OnClickListener mOnPhotoClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //todo
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPhoto = findViewById(R.id.tvPhoto);
        mLogin = findViewById(R.id.tvEmail);
        mPassword = findViewById(R.id.tvPassword);

        mPhoto.setOnClickListener(mOnPhotoClickListener);
    }
}
