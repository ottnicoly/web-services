package com.nicoly.webServices.repositories;

import com.nicoly.webServices.entities.Category;
import com.nicoly.webServices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
