package com.montes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
