package com.example.myannuallytasks;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class To_Do_Fragment extends Fragment {


    public To_Do_Fragment() {
        // Required empty public constructor
    }
///////////////////////////////////////////////////////
    public static To_Do_Fragment newInstance() {

        Bundle args = new Bundle();

        To_Do_Fragment fragment = new To_Do_Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    /////////////////////////////////////////////


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_to__do_, container, false);


    }


}
