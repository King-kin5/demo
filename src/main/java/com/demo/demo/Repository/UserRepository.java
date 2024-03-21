package com.demo.demo.Repository;

import com.demo.demo.Model.NewUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<NewUser,Long> {
    Optional<NewUser> findByEmail(String email);
}
