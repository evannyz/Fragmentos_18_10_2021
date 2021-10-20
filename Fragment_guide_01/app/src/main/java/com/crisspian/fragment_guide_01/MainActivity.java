package com.crisspian.fragment_guide_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.crisspian.fragment_guide_01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private boolean isFragmentDisplayed = false;
    private PrimerFragmento primerFragmento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBinding();
        setContentView(binding.getRoot());
        setupClickListener();

    }

    private void setupClickListener() {
        binding.btnMain.setOnClickListener(v-> {

            if (isFragmentDisplayed) {
                closeFragment();
            } else {
                showFragment();
            }
        });
    }

    private void initBinding() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
    }

    private void showFragment(){

        if(primerFragmento== null){
            primerFragmento = PrimerFragmento.newInstance();
        }


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.contenedor_fragmento,primerFragmento)
                .addToBackStack(null)
                .commit();

        binding.btnMain.setText(R.string.close);
        isFragmentDisplayed = true;
    }

    private void closeFragment() {

        FragmentManager fragmentManager = getSupportFragmentManager();

        PrimerFragmento primerFragmento = (PrimerFragmento) fragmentManager
                .findFragmentById(R.id.contenedor_fragmento);

        if (primerFragmento != null) {
            FragmentTransaction fragmentTransaction =
                    fragmentManager.beginTransaction();
            fragmentTransaction.remove(primerFragmento).commit(); }

        binding.btnMain.setText(R.string.open);
        isFragmentDisplayed = false;
    }




}