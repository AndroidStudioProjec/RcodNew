package com.example.m.ismayilov.rcod;

import android.database.DatabaseUtils;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m.ismayilov.rcod.databinding.FragmentLoginBinding;

public class Login extends Fragment {


    View v;
    FragmentLoginBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding  = DataBindingUtil.inflate(inflater ,R.layout.fragment_login, container, false);
        v = binding.getRoot();

        binding.loginSingupBtn.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_login_to_splashScreen);
        });
        return v;
    }
}