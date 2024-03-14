package com.example.javamobileapplicationtest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    View view;
    Button cartButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    public void searchBtnClick(View view) {

    }

    public void cartBtnClick(View view) {

    }

    public void allBtnClick(View view) {

    }

    public void handgunsBtnClick(View view) {

    }

    public void riflesBtnClick(View view) {

    }

    public void shotgunsBtnClick(View view) {

    }
}