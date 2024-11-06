package com.nicoly.webServices.services;
import com.nicoly.webServices.entities.Category;
import com.nicoly.webServices.entities.User;
import com.nicoly.webServices.repositories.CategoryRepository;
import com.nicoly.webServices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}
