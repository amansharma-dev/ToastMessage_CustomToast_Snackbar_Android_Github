package com.example.toastmessage_customtoast_snackbar_android_github;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SnackbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);
    }

    public void showSnackbar(View view){
        Snackbar snackbar = Snackbar.make(view,"Follow Me On Github,Thank You.",Snackbar.LENGTH_LONG);
        snackbar.show();
    }
    public void showSnackbarWithAction(View view){
        Snackbar.make(view,"Follow me On Github, Thanks!!",Snackbar.LENGTH_LONG)
                .setAction("Ok !", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Thank you, Stay Connected.", Toast.LENGTH_SHORT).show();
            }
        })
                .setActionTextColor(Color.BLUE)
                .show();
    }
}
