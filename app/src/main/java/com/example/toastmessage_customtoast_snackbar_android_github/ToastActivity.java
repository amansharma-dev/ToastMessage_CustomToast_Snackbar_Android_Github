package com.example.toastmessage_customtoast_snackbar_android_github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    RadioButton radioButtonShort;
    int toastDuration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        radioButtonShort = findViewById(R.id.radioButton_short);
    }


    public void showToastButton(View view){

        if (radioButtonShort.isChecked()){
            toastDuration = Toast.LENGTH_SHORT;
        }else{
            toastDuration = Toast.LENGTH_LONG;
        }

        Toast toast = Toast.makeText(getApplicationContext(),"Hello, This is a Toast.",toastDuration);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
    public void showCustomToastButton(View view){
        if (radioButtonShort.isChecked()){
            toastDuration = Toast.LENGTH_SHORT;
        }else{
            toastDuration = Toast.LENGTH_LONG;
        }

        LayoutInflater layoutInflater = getLayoutInflater();
        View viewLayout = layoutInflater.inflate(R.layout.custom_toast_layout, (ViewGroup)findViewById(R.id.custom_toast_layout));

        TextView textView = viewLayout.findViewById(R.id.customToast_text);
        textView.setText(R.string.text_show_custom_toast_text);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(toastDuration);
        toast.setGravity(Gravity.BOTTOM,0,350);
        toast.setView(viewLayout);
        toast.show();
    }
}
