package com.uuhnaut69.di;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Service service = new ServiceB();
		Client client = new ClientA(service);
		client.doSomething();
	}
}
