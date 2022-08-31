package com.bootcamphw.hw03.model;

public class Transaction {
    private int transactionId;
    private String transactionName;
    private double amountLocal;

    public Transaction() {
    }

    public Transaction(int transactionId, String transactionName, double amountLocal) {
        this.transactionId = transactionId;
        this.transactionName = transactionName;
        this.amountLocal = amountLocal;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public double getAmountLocal() {
        return amountLocal;
    }

    public void setAmountLocal(double amountLocal) {
        this.amountLocal = amountLocal;
    }

}
