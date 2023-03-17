package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Product;
import com.main.service.HomeService;
@CrossOrigin("http://localhost:4200")
@RestController
public class MainController {
	@Autowired
	HomeService hs;
	
	@PostMapping("/setdata")
	public Product pro(@RequestBody Product p) {
		Product pp=hs.savedata(p);
		return pp;
	}
	@GetMapping("/getalldata")
	public List po() {
		List list=hs.getalldata();
		return list;
	}
	@DeleteMapping("/deletedata/{id}")
	public String del(@PathVariable ("id")int id) {
		hs.deletedata(id);
		return "delete sucessfully";
	}
	@PutMapping("/editdata/{id}")
	public Product edi(@PathVariable("id")int id,@RequestBody Product p) {
		Product pp=hs.savedata(p);
		return pp;
	}

}
