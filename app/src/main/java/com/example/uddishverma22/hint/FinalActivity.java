package com.example.uddishverma22.hint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        StringRequest stringRequest = new StringRequest(Request.Method.POST, server_url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("Status","SUCCESS");
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(),"ERROR !!",Toast.LENGTH_LONG).show();
                    }
                }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String, String>();
                Log.d("In gere","In here");

//                params.put("queryno",s);
//                params.put("firno",firnum);
//                params.put("district","Outer");
//                params.put("station",station);
//                params.put("officer",iofficer);
//                params.put("mobile",mobile);
//                params.put("query",query);
//                params.put("date",datee.toString());
//                params.put("time",time);
//                params.put("cname",Cname);
//                params.put("cmob",cnum);
//                params.put("querystat",qstat);
                return params;
            }
        };

        MySingleton.getInstance(FinalActivity.this).AddToRequestQueue(stringRequest);



    }
}
