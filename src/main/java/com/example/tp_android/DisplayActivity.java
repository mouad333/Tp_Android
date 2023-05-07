package com.example.tp_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");

        // Set the username and password in the TextViews
        TextView usernameTextView = findViewById(R.id.username_text_view);
        usernameTextView.setText("Username: " + username);

        TextView passwordTextView = findViewById(R.id.password_text_view);
        passwordTextView.setText("Password: " + password);

        // Set up the back button
        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}