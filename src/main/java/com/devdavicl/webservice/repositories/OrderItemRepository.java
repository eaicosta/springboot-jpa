package com.devdavicl.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdavicl.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
