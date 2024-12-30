package com.example.mebook.repository;

import com.example.mebook.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query("SELECT p FROM Users p WHERE p.name = ?1")
    Optional<Users> findUserByName(String name);
}
