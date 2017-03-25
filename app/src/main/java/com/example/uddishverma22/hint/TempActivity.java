package com.example.uddishverma22.hint;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class TempActivity extends AppCompatActivity {

    ProgressDialog progressDialog;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        linearLayout = (LinearLayout) findViewById(R.id.ll);

        progressDialog = new ProgressDialog(TempActivity.this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                progressDialog.dismiss();
                if (MainActivity.leave == 0 && MainActivity.work_interfere == 0 && MainActivity.remotework == 0 && MainActivity.benefits == 0
                        && MainActivity.phys_health == 0) {
                    linearLayout.setBackgroundResource(R.drawable.no);
                } else {
                    linearLayout.setBackgroundResource(R.drawable.yes);
                }
            }
        }, 3000);

    }

}
