package com.ty.shopping.service;

import java.util.List;

import com.ty.shopping.dao.ProductDao;
import com.ty.shopping.dto.Product;
import com.ty.shopping.util.AES;

public class ProductService {

	String SECRETE_KEY = "udayapp";

	ProductDao productDao = new ProductDao();

	public Product saveProduct(Product product) {

		String enc = AES.encrypt(product.getDescription(), SECRETE_KEY);
		product.setDescription(enc);
		return productDao.saveProduct(product);
	}

	public void updateProductById(int id, Product product) {
		product.setPid(id);
		String enc = AES.encrypt(product.getDescription(), SECRETE_KEY);
		product.setDescription(enc);
		productDao.updateProductById(product);
	}

	public boolean deleteProductById(int id) {
		return productDao.deleteProductById(id);
	}

	public Product getProductById(int id) {
		Product product = productDao.getProductById(id);
		if (product != null) {
			String dec = AES.decrypt(product.getDescription(), SECRETE_KEY);
			product.setDescription(dec);
			return product;
		} else {
			return null;
		}
	}

	public List<Product> getProductByBrand(String brand) {
		List<Product> products = productDao.getProductByBrand(brand);
		for (Product product : products) {
			String dec = AES.decrypt(product.getDescription(), SECRETE_KEY);
			product.setDescription(dec);

		}
		return products;
	}

	public List<Product> getProductByType(String type) {
		List<Product> products = productDao.getProductByType(type);
		for (Product product : products) {
			String dec = AES.decrypt(product.getDescription(), SECRETE_KEY);
			product.setDescription(dec);

		}
		return products;
	}

	public List<Product> getProductByPrice(double price) {
		List<Product> products = productDao.getProductByPrice(price);
		for (Product product : products) {
			String dec = AES.decrypt(product.getDescription(), SECRETE_KEY);
			product.setDescription(dec);

		}
		return products;
	}

	public List<Product> getProductBySize(int size) {
		List<Product> products = productDao.getProductBySize(size);
		for (Product product : products) {
			String dec = AES.decrypt(product.getDescription(), SECRETE_KEY);
			product.setDescription(dec);

		}
		return products;
	}

	public List<Product> getProductByRating(int rating) {
		List<Product> products = productDao.getProductByRating(rating);
		for (Product product : products) {
			String dec = AES.decrypt(product.getDescription(), SECRETE_KEY);
			product.setDescription(dec);

		}
		return products;
	}

	public List<Product> getAllProducts() {
		List<Product> products = productDao.getAllProducts();
		for (Product product : products) {
			String dec = AES.decrypt(product.getDescription(), SECRETE_KEY);
			product.setDescription(dec);

		}
		return products;
	}
}
