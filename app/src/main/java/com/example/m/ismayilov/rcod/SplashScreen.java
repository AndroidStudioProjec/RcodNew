package com.example.m.ismayilov.rcod;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends Fragment {

    View v;
    Animation animation;
    ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_splash_screen, container, false);

        imageView = v.findViewById(R.id.splashScreen_image);
        animation = AnimationUtils.loadAnimation(getContext() , R.anim.alpha_animation);
        imageView.setAnimation(animation);

        Handler handler = new Handler();
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                Navigation.findNavController(v).navigate(R.id.action_splashScreen_to_login);
            }
        };handler.postDelayed(runnable , 2000);


        return  v;
    }
}