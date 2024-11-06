package com.nicoly.webServices.services;
import com.nicoly.webServices.entities.Category;
import com.nicoly.webServices.entities.Product;
import com.nicoly.webServices.repositories.CategoryRepository;
import com.nicoly.webServices.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
