package com.example.toastmessage_customtoast_snackbar_android_github;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastButton(View view){
        Intent intent = new Intent(this,ToastActivity.class);
        startActivity(intent);
    }

    public void snackbarButton(View view){
        Intent intent = new Intent(this,SnackbarActivity.class);
        startActivity(intent);
    }
}
