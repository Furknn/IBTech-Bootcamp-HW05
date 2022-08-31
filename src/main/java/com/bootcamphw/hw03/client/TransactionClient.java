package com.bootcamphw.hw03.client;

import com.bootcamphw.hw03.utils.StreamUtils;
import com.bootcamphw.hw03.utils.TransactionConverter;

public class TransactionClient {
    public static void main(String[] args) throws Exception {
        String address="http://localhost:8080/Homework04/transaction";
        var response=StreamUtils.get(address);
        var transaction=TransactionConverter.parse(response);
        System.out.println(transaction);
    }
}
