package com.ty.shopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping.dto.Product;

public class ProductDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public Product saveProduct(Product product) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		return entityManager.find(Product.class, product.getPid());
	}

	public void updateProductById(Product product) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Product p = entityManager.find(Product.class, product.getPid());
		if (p != null) {
			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
			System.out.println("updated");
		} else {
			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
			System.out.println("No product With Id , so Inserted as new Product");
		}
	}

	public boolean deleteProductById(int id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Product product = entityManager.find(Product.class, id);
		if (product != null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public Product getProductById(int id) {
		return entityManager.find(Product.class, id);
	}

	public List<Product> getProductByBrand(String brand) {
		String sql = "SELECT p FROM Product p WHERE brand=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, brand);
		return query.getResultList();
	}

	public List<Product> getProductByType(String type) {
		String sql = "SELECT p FROM Product p WHERE type=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, type);
		return query.getResultList();
	}

	public List<Product> getProductByPrice(double price) {
		String sql = "SELECT p FROM Product p WHERE price=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, price);
		return query.getResultList();
	}

	public List<Product> getProductBySize(int size) {
		String sql = "SELECT p FROM Product p WHERE size=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, size);
		return query.getResultList();
	}

	public List<Product> getProductByRating(int rating) {
		String sql = "SELECT p FROM Product p WHERE rating=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, rating);
		return query.getResultList();
	}

	public List<Product> getAllProducts() {
		String sql = "SELECT p FROM Product p ";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
}