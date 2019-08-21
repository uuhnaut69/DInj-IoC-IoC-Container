package com.uuhnaut69.injection;

import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl2 implements IDao {

	@Override
	public void getValue() {
		// TODO Auto-generated method stub
		System.out.println("This is Dao Impl 2");
	}

}
