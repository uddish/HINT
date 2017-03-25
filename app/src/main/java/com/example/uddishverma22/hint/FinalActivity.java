package com.example.uddishverma22.hint;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class FinalActivity extends AppCompatActivity {


    String server_url = "http://172.20.53.45:8000/get_score";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        SharedPreferences sharedPreferences = getSharedPreferences("Info", Context.MODE_PRIVATE);
        final String age = sharedPreferences.getString("Age", "");
        final String gender = sharedPreferences.getString("Gender", "");
        final int s_emp = MainActivity.s_emp;
        final int family_his = MainActivity.family_his;
        final int treatment = MainActivity.treatment;
        final int work_interfere = MainActivity.work_interfere;
        final int no_of_emp = MainActivity.no_of_emp;
        final int remotework = MainActivity.remotework;
        final int tech_comp = MainActivity.tech_comp;
        final int benefits = MainActivity.benefits;
        final int seekhelp = MainActivity.seekhelp;
        final int anonymity = MainActivity.anonymity;
        final int leave = MainActivity.leave;
        final int mental_cons = MainActivity.mental_cons;
        final int phys_health = MainActivity.phys_health;
        final int coworkers = MainActivity.coworkers;
        final int superwisers = MainActivity.superwisers;
        final int ment_interview = MainActivity.ment_interview;
        final int phys_health_i = MainActivity.phys_health_i;
        final int phyvsmen = MainActivity.phyvsmen;


        ProgressDialog progressDialog = new ProgressDialog(FinalActivity.this);
        progressDialog.show();
        final JsonObjectRequest stringRequest = new JsonObjectRequest(Request.Method.POST, server_url, (JSONObject) null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                int a;
                try {
                    a = response.getInt("score");
                    Toast.makeText(getApplicationContext(),Integer.toString(a),Toast.LENGTH_LONG).show();
                    Log.d("Score",Integer.toString(a));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                Log.d("In gere", "In here");
                params.put("a", "19");
                params.put("b", "1");
                params.put("c", String.valueOf(s_emp));
                params.put("d", String.valueOf(family_his));
                params.put("e", String.valueOf(treatment));
                params.put("f", String.valueOf(work_interfere));
                params.put("g", String.valueOf(no_of_emp));
                params.put("h", String.valueOf(remotework));
                params.put("i", String.valueOf(tech_comp));
                params.put("j", String.valueOf(benefits));
                params.put("k", String.valueOf(seekhelp));
                params.put("l", String.valueOf(anonymity));
                params.put("m", String.valueOf(leave));
                params.put("n", String.valueOf(mental_cons));
                params.put("o", String.valueOf(phys_health));
                params.put("p", String.valueOf(coworkers));
                params.put("q", String.valueOf(superwisers));
                params.put("r", String.valueOf(ment_interview));
                params.put("s", String.valueOf(phys_health_i));
                params.put("t", String.valueOf(phyvsmen));
                Log.d("TAG", "getParams: PARAM " + params);
                return params;
            }

//            @Override
//            public byte[] getBody() {
//                                Map<String, String> params = new HashMap<String, String>();
//                Log.d("In gere", "In here");
//                params.put("a", "19");
//                params.put("b", "1");
//                params.put("c", String.valueOf(s_emp));
//                params.put("d", String.valueOf(family_his));
//                params.put("e", String.valueOf(treatment));
//                params.put("f", String.valueOf(work_interfere));
//                params.put("g", String.valueOf(no_of_emp));
//                params.put("h", String.valueOf(remotework));
//                params.put("i", String.valueOf(tech_comp));
//                params.put("j", String.valueOf(benefits));
//                params.put("k", String.valueOf(seekhelp));
//                params.put("l", String.valueOf(anonymity));
//                params.put("m", String.valueOf(leave));
//                params.put("n", String.valueOf(mental_cons));
//                params.put("o", String.valueOf(phys_health));
//                params.put("p", String.valueOf(coworkers));
//                params.put("q", String.valueOf(superwisers));
//                params.put("r", String.valueOf(ment_interview));
//                params.put("s", String.valueOf(phys_health_i));
//                params.put("t", String.valueOf(phyvsmen));
//                String myjson = new String(String.valueOf(params));
//                Log.d("TAG",myjson);
//                return myjson.getBytes();
//            }
        };
        MySingleton.getInstance(FinalActivity.this).addToRequestQueue(stringRequest);
    }
}
