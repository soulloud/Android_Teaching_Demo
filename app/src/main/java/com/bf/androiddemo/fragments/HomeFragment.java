package com.bf.androiddemo.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bf.androiddemo.R;

public class HomeFragment extends Fragment {

    Button toView, toScrollView, toRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        toRecyclerView = view.findViewById(R.id.button_toRecyclerView);
        bindButton(toRecyclerView, new TransactionFragment());

        toView = view.findViewById(R.id.button_toView);
        bindButton(toView, new ViewFragment());

        toScrollView = view.findViewById(R.id.button_toScrollView);
        bindButton(toScrollView, new ScrollViewFragment());

        return view;
    }

    private void bindButton(Button button, Fragment fragment){
        button.setOnClickListener(v -> loadFragment(fragment));
    }
    private void loadFragment(Fragment fragment) {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .addToBackStack("Home")
                .commit();
    }
}
