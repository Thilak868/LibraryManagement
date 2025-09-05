package com.example.LibraryProject.Repository;

import com.example.LibraryProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
