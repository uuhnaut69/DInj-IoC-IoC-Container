package com.uuhnaut69.injection;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

	private final IDao dao;

	public ExampleService(IDao dao) {
		this.dao = dao;
	}

	public void getValue() {
		dao.getValue();
	}
}
