package com.testeSpring.usuariodept.repositories;

import com.testeSpring.usuariodept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
