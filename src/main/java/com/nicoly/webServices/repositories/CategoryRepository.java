package com.nicoly.webServices.repositories;

import com.nicoly.webServices.entities.Category;
import com.nicoly.webServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//uso opcional pois herda a anotação de jparepository
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
