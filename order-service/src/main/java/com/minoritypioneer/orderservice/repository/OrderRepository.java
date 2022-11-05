package com.minoritypioneer.orderservice.repository;

import com.minoritypioneer.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
