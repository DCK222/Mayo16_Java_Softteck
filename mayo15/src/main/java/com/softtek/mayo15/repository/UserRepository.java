package com.softtek.mayo15.repository;



import com.softtek.mayo15.modelo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    // Since email is unique, we'll find users by email
    Optional<User> findByEmail(String email);
}
