package com.aanchal.fragmentassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.aanchal.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterestFragment extends Fragment  implements  View.OnClickListener{
EditText etp;
EditText ettime;
EditText etrate;
Button btncalcu;

TextView tvres;


    public SimpleInterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_simple_interest, container, false);

        etp=view.findViewById(R.id.etp);
        ettime=view.findViewById(R.id.ettime);
        etrate=view.findViewById(R.id.etrate);
        btncalcu=view.findViewById(R.id.btncalcu);
        tvres=view.findViewById(R.id.tvres);

        btncalcu.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float principle=Float.parseFloat((etp.getText().toString()));
        float time=Float.parseFloat((ettime.getText().toString()));
        float rate=Float.parseFloat((etrate.getText().toString()));


        float SI= (principle*time*rate)/100;

        tvres.setText("Simple Interest is: "+SI);


    }
}
