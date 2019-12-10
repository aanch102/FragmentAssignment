package com.aanchal.fragmentassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.aanchal.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaofcircleFragment extends Fragment implements  View.OnClickListener {

    private EditText etradius;
    private Button btncircle;
    private TextView tvresult;

    public AreaofcircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_areaofcircle, container, false);

        etradius=view.findViewById(R.id.etradius);
        btncircle=view.findViewById(R.id.btncircle);
        tvresult=view.findViewById(R.id.tvresult);
        btncircle.setOnClickListener(this);
        return view;


    }

    @Override
    public void onClick(View v) {
        float radius=Float.parseFloat((etradius.getText().toString()));
        float area=3.14f*radius*radius;
        tvresult.setText("area of circle is:"+area);



    }
}
