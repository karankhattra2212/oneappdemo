package com.barclays.repository;


import com.barclays.dto.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface CustomerRepository extends JpaRepository<Customer , Integer> {
}
