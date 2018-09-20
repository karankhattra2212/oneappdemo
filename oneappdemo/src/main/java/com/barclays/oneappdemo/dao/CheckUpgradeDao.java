package com.barclays.oneappdemo.dao;

import com.barclays.oneappdemo.dto.CheckUpgradeDto;
import org.springframework.stereotype.Repository;

@Repository
public class CheckUpgradeDao {
    public void setvNumber()
    {
        CheckUpgradeDto checkUpgrade=new CheckUpgradeDto();
        checkUpgrade.setvNumber("1.0001");
        //return  checkUpgrade.getvNumber();
    }
}
