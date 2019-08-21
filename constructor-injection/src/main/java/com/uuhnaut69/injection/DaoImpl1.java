package com.uuhnaut69.injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class DaoImpl1 implements IDao {

	@Override
	public void getValue() {
		// TODO Auto-generated method stub
		System.out.println("This is DaoImpl 1");
	}

}
