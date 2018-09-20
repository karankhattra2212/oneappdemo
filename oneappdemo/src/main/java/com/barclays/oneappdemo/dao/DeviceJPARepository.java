package com.barclays.oneappdemo.dao;

import com.barclays.oneappdemo.dto.DeviceDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceJPARepository  extends JpaRepository<DeviceDTO, Long> {
}
