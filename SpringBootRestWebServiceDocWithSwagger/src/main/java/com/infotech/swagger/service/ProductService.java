package com.infotech.swagger.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.infotech.swagger.model.Product;

@Service
public interface ProductService {
	public abstract Iterable<Product> listAllProducts();
	public abstract Optional<Product> getProductById(Integer id);
	public abstract Product saveProduct(Product product);
	public abstract void deleteProduct(Integer id);

}
