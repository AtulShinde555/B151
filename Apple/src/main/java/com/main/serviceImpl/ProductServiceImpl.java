package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Apple;
import com.main.repository.ProductRepository;
import com.main.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
	ProductRepository pr;

	@Override
	public Apple setdata(Apple a) {
		// TODO Auto-generated method stub
		return pr.save(a);
	}

	@Override
	public List getdata() {
		// TODO Auto-generated method stub
		return (List) pr.findAll();
	}

	@Override
	public void deletdata(int productid) {
		// TODO Auto-generated method stub
		pr.deleteById(productid);
	}

//	@Override
//	public Apple editdata(int productid, Apple a) {
//		// TODO Auto-generated method stub
//		return pr.save(a);
//	}

	
	
	
}
