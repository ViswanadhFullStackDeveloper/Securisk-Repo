package com.securerisk.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.securerisk.master.model.Product;
import com.securerisk.master.repository.ProductsRepository;

@RestController
@RequestMapping("/master")
@CrossOrigin(origins = "*")
public class ProductsController {

	@Autowired
	private ProductsRepository productsRepository;

	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		return productsRepository.findAll();
	}
}
