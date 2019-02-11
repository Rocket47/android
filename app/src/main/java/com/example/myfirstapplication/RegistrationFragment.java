package com.example.myfirstapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

    private boolean isInputValid() {
        if (isEmailValid() && isPasswordValid()) {
            return true;
        }
        return false;
    }

    private boolean isEmailValid() {
        String email = mEmail.getText().toString();
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private boolean isPasswordValid() {
        String password = mPassword.getText().toString();
        String passwordAgain = mPasswordAgain.getText().toString();
        return password.equals(passwordAgain) ||
                !TextUtils.isEmpty(password) ||
                !TextUtils.isEmpty(passwordAgain);
    }

    private void showMessage(@StringRes int string) {
        Toast.makeText(getActivity(), string, Toast.LENGTH_LONG).show();
    }
}


