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
public class PalindromeFragment extends Fragment implements View.OnClickListener {

    EditText etnum;
    Button btncheck;
    TextView tvmessage;

    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);

        etnum = view.findViewById(R.id.etnum);
        btncheck = view.findViewById(R.id.btncheck);
        tvmessage = view.findViewById(R.id.tvmessage);

        btncheck.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int number = Integer.parseInt(etnum.getText().toString());
        int reverseInteger = 0, remainder, orginalInteger;
        orginalInteger = number;

        while (number != 0) {
            remainder=number % 10;
            reverseInteger= reverseInteger * 10 + remainder;
            number /= 10;


        }
        if (orginalInteger==reverseInteger){
            //Toast.makeText(getActivity(),"Is Palindrome:"+ orginalInteger,Toast.LENGTH_SHORT).show();
            tvmessage.setText("It is palindronme:");
        }
        else {
            tvmessage.setText("It is not palindrome");
            //Toast.makeText(getActivity(),"Is not:"+ orginalInteger,Toast.LENGTH_SHORT).show();
        }
    }
}
