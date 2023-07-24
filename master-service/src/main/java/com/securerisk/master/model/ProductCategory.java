package com.securerisk.master.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "product_category")
public class ProductCategory {

    @Id
    @Column(name = "categoryid")
    private Long categoryId;

    @Column(name = "categoryname", length = 100)
    private String categoryName; 

    @Column(name = "createdDate")
    private LocalDateTime createdDate;

    @Column(name = "updatedDate")
    private LocalDateTime updatedDate;

    @Column(name = "status")
    private boolean status;
    
//    @OneToMany(mappedBy = "productcategory", cascade = CascadeType.ALL)
//    private List<Product> products;

}
