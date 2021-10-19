package com.crisspian.fragment_guide_01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.crisspian.fragment_guide_01.databinding.FragmentPrimerFragmentoBinding;


public class PrimerFragmento extends Fragment {

    private FragmentPrimerFragmentoBinding binding;
    public static final int YES = 1;
    public static final int NO = 1;



    public PrimerFragmento() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        initBinding(inflater,container);
        setupListener();
        return binding.getRoot();

    }



    private void initBinding(LayoutInflater inflater, ViewGroup container) {
        binding = FragmentPrimerFragmentoBinding.inflate(inflater,container,false);
    }
    private void setupListener() {
    }
}