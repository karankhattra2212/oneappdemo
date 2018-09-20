package com.barclays.oneappdemo.dao;

import com.barclays.oneappdemo.dto.CustomerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerJPARepository extends JpaRepository<CustomerDTO, Long> {}
