package com.securerisk.master.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "productid")
	private Long productId;

	@Column(name = "productname", length = 100)
	private String productName;

	@ManyToOne
	@JoinColumn(name = "productcategory")
	private ProductCategory productcategory;

	@Column(name = "createdDate")
	private LocalDateTime createdDate;

	@Column(name = "updatedDate")
	private LocalDateTime updatedDate;

	@Column(name = "status")
	private boolean status;

}
