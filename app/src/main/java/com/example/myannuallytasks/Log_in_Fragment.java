package com.example.myannuallytasks;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Log_in_Fragment extends Fragment {


    public Log_in_Fragment() {
        // Required empty public constructor
    }

///////////////////////////////////////NewInstance Section for Intent/////////////////////
    public static Log_in_Fragment newInstance() {

        Bundle args = new Bundle();

        Log_in_Fragment fragment = new Log_in_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
//////////////////////////////////////////////////////////////////////////////
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_log_in, container, false);



        return view;
    }

}
