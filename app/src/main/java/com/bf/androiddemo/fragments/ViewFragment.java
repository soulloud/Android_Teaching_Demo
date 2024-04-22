package com.bf.androiddemo.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bf.androiddemo.R;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;

public class ViewFragment extends Fragment {
    Button backButton;
    MaterialSwitch switchButton;
    TextView toggleText;
    TextInputEditText textInput;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_views, container, false);

        backButton = view.findViewById(R.id.back_button);
        switchButton = view.findViewById(R.id.switchBtn);
        toggleText = view.findViewById(R.id.toggleText);
        textInput = view.findViewById(R.id.text_input);

        backButton.setOnClickListener(v -> loadFragment(new HomeFragment()));

        switchButton.setOnClickListener(v -> {
            if (switchButton.isChecked()){
                toggleText.setText(R.string.label_checked);
//                    Snackbar.make(view, R.string.label_checked, Snackbar.LENGTH_LONG)
//                            .setAction("Retry", new View.OnClickListener() {
//                                @Override
//                                public void onClick(View v) {
//                                    // onClick Logic
//                                }
//                            })
//                            .show();
            } else {
                toggleText.setText(R.string.label_unchecked);
//                    Snackbar.make(view, R.string.label_unchecked, Snackbar.LENGTH_LONG).show();
            }
        });



        return view;
    }

    private void loadFragment(Fragment fragment) {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .addToBackStack("View")
                .commit();
    }
}
