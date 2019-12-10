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
public class ArmstrongFragment extends Fragment implements  View.OnClickListener{

private EditText etarm;
private Button btnresult;
private TextView tvresult;
    public ArmstrongFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_armstrong, container, false);

        etarm=view.findViewById(R.id.etarm);
        btnresult =view.findViewById(R.id.btnchk);
        tvresult=view.findViewById(R.id.tvresult);

        btnresult.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {



       int a;
       int c=0;
       int temp;
       int n=Integer.parseInt(etarm.getText().toString());
       temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }

        if(temp==c){
            tvresult.setText("It is a armstrong number");

        } else{
            tvresult.setText("It is not armstrong num");
        }


    }
}
