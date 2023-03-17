package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Apple;
import com.main.service.ProductService;

@RestController
public class MainController {
	@Autowired
	ProductService ps;
	
	@PostMapping("/postdata")
	public Apple pro(@RequestBody Apple a) {
		Apple aa=ps.setdata(a);
		return a;
	}
	@GetMapping("/getalldata")
	public List pre() {
		List list=ps.getdata();
		return list;
	}

//	@PutMapping("/editdata/{productid}")
//	public Apple log1(@PathVariable("productid")int productid ,@RequestBody Apple a) {
//		Apple aa=ps.editdata(productid,a);
//		return aa;
//	}
	@DeleteMapping("/deletedata/{productid}")
	public String s(@PathVariable("productid")int productid ) {
		
		ps.deletdata(productid);
		return "Delete Done";
	}
	@PutMapping("/editdata/{productid}")
	public Apple e(@PathVariable("productid")int productid,@RequestBody Apple a) {
		Apple aa=ps.setdata(a);
		return aa;
	}
}

