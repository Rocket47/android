package com.example.myfirstapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationFragment extends Fragment {

    private EditText mEmail;
    private EditText mPassword;
    private EditText mPasswordAgain;
    private Button mButtonRegistr;

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //todo
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_registration, container, false);

        mEmail = v.findViewById(R.id.emailRegist);
        mPassword = v.findViewById(R.id.passwordRegistr);
        mPasswordAgain = v.findViewById(R.id.passwordRegistrAgain);
        mButtonRegistr.setOnClickListener(clickListener);

        return v;
    }
}


