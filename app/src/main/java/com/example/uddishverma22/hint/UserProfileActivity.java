package com.example.uddishverma22.hint;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserProfileActivity extends AppCompatActivity {

    EditText name,gender,age,occupation;
    Button submit;
    UserProfile userProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        name = (EditText)findViewById(R.id.name_person);
        gender = (EditText)findViewById(R.id.gender);
        age = (EditText) findViewById(R.id.age);
        occupation = (EditText) findViewById(R.id.occupation);

        submit = (Button)findViewById(R.id.sub_butt);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = name.getText().toString();
                String g = gender.getText().toString();
                String a = age.getText().toString();
                String o = occupation.getText().toString();

                if(a.equals("")||n.equals("")||g.equals("")||o.equals("")) {
                    Toast.makeText(UserProfileActivity.this,"Some details are not entered please enter...",Toast.LENGTH_LONG).show();
                } else {

                    userProfile = new UserProfile(n,a,g,o);
                    SharedPreferences sharedPreferences=getSharedPreferences("Info", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=sharedPreferences.edit();
                    editor.putString("Name",n);
                    editor.putString("Gender",g);
                    editor.putString("Age",a);
                    editor.putString("Occupation",o);
                    editor.commit();
                    Intent intent = new Intent(UserProfileActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
