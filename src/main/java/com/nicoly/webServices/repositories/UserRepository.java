package com.nicoly.webServices.repositories;

import com.nicoly.webServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
