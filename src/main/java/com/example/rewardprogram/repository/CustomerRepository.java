package com.example.rewardprogram.repository;

import com.example.rewardprogram.pojo.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
