package com.example.uddishverma22.hint.Fragments;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.uddishverma22.hint.MainActivity;
import com.example.uddishverma22.hint.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 */
public class Fragment14 extends Fragment {

    TextView tv, yes, no, dont;;
    Animation animation;

    public Fragment14() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fragment14, container, false);

        animation = AnimationUtils.loadAnimation(getActivity(), R.anim.slide);

        tv = (TextView) v.findViewById(R.id.tv14);
        yes = (TextView) v.findViewById(R.id.btn_yes);
        no = (TextView) v.findViewById(R.id.btn_no);
        dont = (TextView) v.findViewById(R.id.btn_dont);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.superwisers = 1;
                MainActivity.viewPager.setCurrentItem(13);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.superwisers = 0;
                MainActivity.viewPager.setCurrentItem(13);
            }
        });

        dont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.superwisers = 2;
                MainActivity.viewPager.setCurrentItem(13);
            }
        });

        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),"fonts/Raleway-Regular.ttf");
        tv.setTypeface(tf);
        tv.setAnimation(animation);
        return v;
        }

    // TODO: Rename method, update argument and hook method into UI event

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
