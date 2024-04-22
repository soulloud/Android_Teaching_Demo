package com.bf.androiddemo.fragments.transaction_fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bf.androiddemo.R;
import com.bf.androiddemo.model.Transaction;

import java.util.List;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionViewHolder> {

    List<Transaction> transactionList;

    public TransactionAdapter(List<Transaction> itemList) {
        transactionList = itemList;
    }

    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_card, parent, false);
        return new TransactionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder holder, int position) {
        holder.binding(transactionList.get(position));
    }

    @Override
    public int getItemCount() {
        return transactionList.size();
    }
}
