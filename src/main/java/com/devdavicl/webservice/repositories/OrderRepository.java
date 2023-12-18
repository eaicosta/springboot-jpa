package com.devdavicl.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdavicl.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
