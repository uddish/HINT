package com.example.uddishverma22.hint.Fragments;

//TODO COMPLETE SPINNER ACTIVITY

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.uddishverma22.hint.MainActivity;
import com.example.uddishverma22.hint.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link Fragment5#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment5 extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    TextView tv;
    Animation animation;
    Spinner empSpinner;
    ArrayAdapter<CharSequence> empAdapter;
    String noEmp = null;


    public Fragment5() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment5.
     */
    public static Fragment5 newInstance(String param1, String param2) {
        Fragment5 fragment = new Fragment5();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fragment5, container, false);

        empSpinner = (Spinner) v.findViewById(R.id.spin_range);
        empAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.no_emp,android.R.layout.simple_spinner_item);
        empAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        empSpinner.setAdapter(empAdapter);

        empSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                noEmp = String.valueOf(adapterView.getItemAtPosition(i));
                if(noEmp.equals("1-5")) {
                    MainActivity.no_of_emp = 1;
                    MainActivity.viewPager.setCurrentItem(5);
                }
                if(noEmp.equals("6-25")) {
                    MainActivity.no_of_emp = 2;
                    MainActivity.viewPager.setCurrentItem(5);
                }
                if(noEmp.equals("25-100")) {
                    MainActivity.no_of_emp = 3;
                    MainActivity.viewPager.setCurrentItem(5);
                }
                if(noEmp.equals("100-500")) {
                    MainActivity.no_of_emp = 4;
                    MainActivity.viewPager.setCurrentItem(5);
                }
                if(noEmp.equals("500-1000")) {
                    MainActivity.no_of_emp = 5;
                    MainActivity.viewPager.setCurrentItem(5);
                }
                if(noEmp.equals("1000 and above")) {
                    MainActivity.no_of_emp = 6;
                    MainActivity.viewPager.setCurrentItem(5);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        //**************************
//        MainActivity.viewPager.setCurrentItem(5);
        //**************************

        animation = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_down);
        tv = (TextView) v.findViewById(R.id.tv5);
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),"fonts/Raleway-Regular.ttf");
        tv.setTypeface(tf);
        tv.setAnimation(animation);
        return v;    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */

}
