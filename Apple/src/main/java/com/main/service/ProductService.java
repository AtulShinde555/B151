package com.main.service;

import java.util.List;

import com.main.model.Apple;

public interface ProductService {

	Apple setdata(Apple a);

	List getdata();

	void deletdata(int productid);

	//Apple editdata(int productid, Apple a);

	
}
