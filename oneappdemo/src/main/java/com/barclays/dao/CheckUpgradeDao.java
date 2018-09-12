package com.barclays.dao;

import com.barclays.dto.CheckUpgradeDto;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class CheckUpgradeDao {
    public void setvNumber()
    {
        CheckUpgradeDto checkUpgrade=new CheckUpgradeDto();
        checkUpgrade.setvNumber("1.0001");
        //return  checkUpgrade.getvNumber();
    }
}
