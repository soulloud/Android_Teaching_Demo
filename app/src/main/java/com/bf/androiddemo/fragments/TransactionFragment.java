package com.bf.androiddemo.fragments;

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
import com.bf.androiddemo.fragments.transaction_fragment.TransactionAdapter;
import com.bf.androiddemo.model.MockData;
import com.bf.androiddemo.model.Transaction;

import java.util.List;

public class TransactionFragment extends Fragment {

    RecyclerView transactionRV;
    Button backButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_recycler_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        transactionRV = view.findViewById(R.id.transaction_recyclerView);
        transactionRV.setLayoutManager(new LinearLayoutManager(getContext())); //set up layoutManager
        List<Transaction> transactionList = MockData.getSampleData();
        TransactionAdapter adapter = new TransactionAdapter(transactionList);
        transactionRV.setAdapter(adapter); // set up adapter

        backButton = view.findViewById(R.id.back_button);
        backButton.setOnClickListener(v -> loadFragment(new HomeFragment()));
    }

    private void loadFragment(Fragment fragment) {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .addToBackStack("Transaction")
                .commit();
    }
}
