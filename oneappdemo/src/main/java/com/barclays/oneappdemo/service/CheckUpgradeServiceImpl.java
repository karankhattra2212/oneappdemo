package com.barclays.oneappdemo.service;


import com.barclays.oneappdemo.dao.CheckUpgradeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class CheckUpgradeServiceImpl implements CheckUpgradeService {
    @Autowired
    private CheckUpgradeDao checkUpgradeDao;
       @Override
    public com.barclays.dto.CheckUpgradeDto getCheckUpgradeById() {

           return checkUpgradeDao.getCheckUpgradeById();
    }
}
