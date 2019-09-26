package com.example.myannuallytasks;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Done_Fragment extends Fragment {


    public Done_Fragment() {
        // Required empty public constructor
    }
////////////////////////
public static Done_Fragment newInstance() {
    
    Bundle args = new Bundle();
    
    Done_Fragment fragment = new Done_Fragment();
    fragment.setArguments(args);
    return fragment;
}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_done_, container, false);
    }

}
