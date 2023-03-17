package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Repositry.HomeRepository;
import com.main.model.Product;
import com.main.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeRepository hr;

	@Override
	public Product savedata(Product p) {
		// TODO Auto-generated method stub
		return hr.save(p);
	}

	@Override
	public List getalldata() {
		// TODO Auto-generated method stub
		return (List) hr.findAll();
	}

	@Override
	public void deletedata(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
	}
}
