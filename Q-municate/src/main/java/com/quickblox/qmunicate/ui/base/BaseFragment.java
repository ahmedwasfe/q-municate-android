package com.quickblox.qmunicate.ui.base;

import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.quickblox.qmunicate.App;

public abstract class BaseFragment extends Fragment {

    protected static final String ARG_TITLE = "title";

    protected App app;
    private String title;

    public String getTitle() {
        return title;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        app = App.getInstance();
        if (getArguments() != null) {
            title = getArguments().getString(ARG_TITLE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        getActionBar().setTitle(title);
    }

    protected ActionBar getActionBar() {
        return getActivity().getActionBar();
    }
}
