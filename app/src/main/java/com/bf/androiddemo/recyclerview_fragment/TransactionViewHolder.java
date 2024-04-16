package com.bf.androiddemo.recyclerview_fragment;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bf.androiddemo.R;
import com.bf.androiddemo.model.Transaction;

import java.time.LocalDate;

public class TransactionViewHolder extends RecyclerView.ViewHolder {

    TextView month, date, merchant, payment;
//    ImageView categoryIcon;

    public TransactionViewHolder(@NonNull View itemView) {
        super(itemView);
        month = itemView.findViewById(R.id.month);
        date = itemView.findViewById(R.id.date);
        merchant = itemView.findViewById(R.id.merchant_name);
        payment = itemView.findViewById(R.id.payment_text);
    }

    // bind data into the view
    public void binding(Transaction transaction){
        month.setText(transaction.getDate().getMonth().toString());
        date.setText(getDateString(transaction.getDate()));
        merchant.setText(transaction.getMerchant());
    }

    private String getDateString(LocalDate date){
        int dateOfMonth = date.getDayOfMonth();
        return dateOfMonth < 10 ? "0" + dateOfMonth : "" + dateOfMonth;
    }
}
