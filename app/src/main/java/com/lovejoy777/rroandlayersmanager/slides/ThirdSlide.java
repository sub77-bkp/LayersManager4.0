package com.lovejoy777.rroandlayersmanager.slides;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lovejoy777.rroandlayersmanager.R;

/**
 * Created by Niklas on 21.06.2015.
 */
public class ThirdSlide extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.intro_3, container, false);
        return v;
    }
}