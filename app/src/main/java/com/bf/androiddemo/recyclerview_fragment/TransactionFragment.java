package com.bf.androiddemo.recyclerview_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bf.androiddemo.R;
import com.bf.androiddemo.HomeFragment;
import com.bf.androiddemo.model.MockData;
import com.bf.androiddemo.model.Transaction;

import java.util.List;

public class TransactionFragment extends Fragment {

    RecyclerView transactionRV;
    Button backButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        transactionRV = view.findViewById(R.id.transaction_recyclerView);
        transactionRV.setLayoutManager(new LinearLayoutManager(getContext())); //set up layoutManager
        List<Transaction> transactionList = MockData.getSampleData();
        TransactionAdapter adapter = new TransactionAdapter(transactionList);
        transactionRV.setAdapter(adapter); // set up adapter

        backButton = view.findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new HomeFragment());
            }
        });

        return view;
    }

    private void loadFragment(Fragment fragment) {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit();
    }
}
