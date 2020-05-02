package com.mybatch.app.processor;

import org.springframework.batch.item.ItemProcessor;

import com.mybatch.app.dto.People;

public class FilterPeopleProcessor implements ItemProcessor<People, People> {

	@Override
	public People process(People item) throws Exception {

		System.out.println("Processor"+item.getFirstName());
		return item;
	}

}