package com.aanchal.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aanchal.fragmentassignment.Fragments.AreaofcircleFragment;
import com.aanchal.fragmentassignment.Fragments.ArmstrongFragment;
import com.aanchal.fragmentassignment.Fragments.AutomorphicFragment;
import com.aanchal.fragmentassignment.Fragments.PalindromeFragment;
import com.aanchal.fragmentassignment.Fragments.SimpleInterestFragment;
import com.aanchal.fragmentassignment.Fragments.SwappingFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnarea;
    private Button btnpalindrome;
    private Button btnautomorphic;
    private  Button btnSI;
    private Button btnarmstrong;
    private Button btnswap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnarea = findViewById(R.id.btnarea);
        btnpalindrome = findViewById(R.id.btnpalindrome);
        btnautomorphic=findViewById(R.id.btnautomorphic);
        btnSI=findViewById(R.id.btnSI);
        btnarmstrong=findViewById(R.id.btnarmstrong);
        btnswap=findViewById(R.id.btnswap);



        btnarea.setOnClickListener(this);
        btnautomorphic.setOnClickListener(this);
        btnpalindrome.setOnClickListener(this);
        btnSI.setOnClickListener(this);
        btnarmstrong.setOnClickListener(this);
        btnswap.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {

            case  R.id.btnarea:
                AreaofcircleFragment areaofcircleFragment=new AreaofcircleFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,areaofcircleFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

            case R.id.btnpalindrome:
                PalindromeFragment palindromeFragment=new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,palindromeFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

            case R.id.btnautomorphic:
                AutomorphicFragment automorphicFragment=new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,automorphicFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;


            case R.id.btnSI:
                SimpleInterestFragment simpleInterestFragment=new SimpleInterestFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,simpleInterestFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

            case R.id.btnarmstrong:
                ArmstrongFragment armstrongFragment=new ArmstrongFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,armstrongFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnswap:
                SwappingFragment swappingFragment=new SwappingFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,swappingFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

        }
    }
}
