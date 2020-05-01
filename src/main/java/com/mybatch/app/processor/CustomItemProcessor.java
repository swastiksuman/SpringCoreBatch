package com.mybatch.app.processor;

import org.springframework.batch.item.ItemProcessor;

import com.mybatch.app.dto.Transaction;

public class CustomItemProcessor implements ItemProcessor<Transaction, Transaction> {
	 
    public Transaction process(Transaction item) {
        return item;
    }
}