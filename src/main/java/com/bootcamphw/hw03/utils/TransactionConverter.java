package com.bootcamphw.hw03.utils;

import com.bootcamphw.hw03.model.Transaction;

public class TransactionConverter {
    public static String format(Transaction transaction){
        return String.format("%d;%s;%s", transaction.getTransactionId(), transaction.getTransactionName(), transaction.getAmountLocal());
    }

    public static Transaction parse(String line){
        var parts=line.split(";");
        var transaction=new Transaction();
        transaction.setTransactionId(Integer.parseInt(parts[0]));
        transaction.setTransactionName(parts[1]);
        transaction.setAmountLocal(Double.parseDouble(parts[2]));
        return transaction;
    }
}
