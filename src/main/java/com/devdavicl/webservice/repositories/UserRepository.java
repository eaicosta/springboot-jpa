package com.devdavicl.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdavicl.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
