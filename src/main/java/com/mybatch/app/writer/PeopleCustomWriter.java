package com.mybatch.app.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.mybatch.app.dto.People;

public class PeopleCustomWriter implements ItemWriter<People>{

	@Override
	public void write(List<? extends People> items) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(items.get(0).getFirstName());
	}

}
