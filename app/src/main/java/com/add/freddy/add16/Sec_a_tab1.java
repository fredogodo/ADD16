package com.add.freddy.add16;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by FREDDY on 31/07/2016.
 */
public class Sec_a_tab1 extends Fragment{
    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.secc_a_tab1, container, false);
        return rootView;
    }
}
