package com.example.user.viewpageadapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Joel on 13-Dec-15.
 */
public class Page2Fragment extends Fragment {
    Context context;

    public Page2Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity().getApplicationContext();
        // Inflate the layout for this fragment
        View parentView = inflater.inflate(R.layout.fragment_page2, container, false);
        return parentView;
    }
}
