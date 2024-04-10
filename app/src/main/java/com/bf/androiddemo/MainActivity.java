package com.bf.androiddemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

public class MainActivity extends AppCompatActivity {

    private boolean loggedIn = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WindowCompat.setDecorFitsSystemWindows(this.getWindow(), false);

        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // change image and text
                TextView txt = findViewById(R.id.textView);
                ImageView img = findViewById(R.id.imageView);
                if (loggedIn){
                    txt.setText(R.string.loggedIn);
                    button.setText(R.string.log_me_in);
                    img.setImageResource(R.drawable.login_icon_foreground);
                } else {
                    txt.setText(R.string.signedOut);
                    button.setText(R.string.sign_me_out);
                    img.setImageResource(R.drawable.logout_icon_foreground);
                }
                loggedIn = !loggedIn;
            }
        });
    }


}
