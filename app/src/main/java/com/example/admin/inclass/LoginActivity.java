package com.example.admin.inclass;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    private Button loginButton;
    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton= (Button) findViewById(R.id.button);
        username= (EditText) findViewById(R.id.editText);
        loginButton.setOnClickListener(loginButtonListener);
    }

    //Create an anonymous implementation of OnClickListener
    private View.OnClickListener loginButtonListener = new View.OnClickListener() {
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Welcome "+ username.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    };
}
