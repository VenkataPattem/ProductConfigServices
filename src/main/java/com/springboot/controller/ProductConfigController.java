package com.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.vo.ConfigVO;
import com.springboot.vo.ProductVO;

@RestController
@RequestMapping(value="/api")
public class ProductConfigController {
	@RequestMapping(value="/getproductdetails", method=RequestMethod.GET)
	public ResponseEntity<ProductVO> getProductDetails() {
		ProductVO product = new ProductVO();
		product.setProductCode(123);
		product.setProductName("Toys");
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}
	
	@RequestMapping(value="/getconfigdetails", method=RequestMethod.GET)
	public ResponseEntity<ConfigVO> getConfigDetails() {
		ConfigVO config = new ConfigVO();
		config.setName("config");
		return ResponseEntity.status(HttpStatus.OK).body(config);
	}
}
