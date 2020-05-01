package com.mybatch.app.reader;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.mybatch.app.dto.Transaction;

public class RecordFieldSetMapper implements FieldSetMapper<Transaction> {
	  
    public Transaction mapFieldSet(FieldSet fieldSet) throws BindException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyy");
        Transaction transaction = new Transaction();
  
        transaction.setUsername(fieldSet.readString(0) +", " + fieldSet.readString(1));
        transaction.setUserId(fieldSet.readInt(2));
        transaction.setAmount(fieldSet.readDouble(4));
        String dateString = fieldSet.readString(3);
        transaction.setTransactionDate(LocalDate.parse(dateString, formatter).atStartOfDay());
        return transaction;
    }
}
