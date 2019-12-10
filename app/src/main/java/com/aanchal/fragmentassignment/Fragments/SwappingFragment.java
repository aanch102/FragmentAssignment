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
public class SwappingFragment extends Fragment implements View.OnClickListener{
private EditText etfirst,etsecond;
private Button btnswap;
private TextView tvswap;


    public SwappingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_swapping, container, false);
        etfirst=view.findViewById(R.id.etfirst);
        etsecond=view.findViewById(R.id.etsecond);
        btnswap=view.findViewById(R.id.btnswap);
        tvswap=view.findViewById(R.id.tvswap);


        btnswap.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int first,second;
        first =Integer.parseInt(etfirst.getText().toString());
        second =Integer.parseInt(etsecond.getText().toString());

        first=first+second;
        second=first-second;
        first=first-second;


        tvswap.setText("After swapping first no: " + first +" second no: "+second);

    }
}
