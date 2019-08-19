package com.uuhnaut69.di;

public class ClientA implements Client {
	Service service;

	public ClientA(Service service) {
		this.service = service;
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		String info = service.getInfo();
		System.out.println(info);
	}

}
