package com.securerisk.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.securerisk.master.model.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {

}
