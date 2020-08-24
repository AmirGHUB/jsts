package com.jstsapp.io.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jstsapp.io.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
