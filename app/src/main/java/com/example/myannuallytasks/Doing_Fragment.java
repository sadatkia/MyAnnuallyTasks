package com.example.myannuallytasks;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Doing_Fragment extends Fragment {


    public Doing_Fragment() {
        // Required empty public constructor
    }
///////////////////
public static Doing_Fragment newInstance() {
    
    Bundle args = new Bundle();
    
    Doing_Fragment fragment = new Doing_Fragment();
    fragment.setArguments(args);
    return fragment;
}


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.taskmenu, menu);

        MenuItem subtitleItem = menu.findItem(R.id.id_LogOff);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_doing_, container, false);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id_LogOff:
                Intent intent =new Intent(getActivity(),First_Activity.class);
                startActivity(intent);
                return true;
            default:




                return super.onOptionsItemSelected(item);


        }
    }

}
