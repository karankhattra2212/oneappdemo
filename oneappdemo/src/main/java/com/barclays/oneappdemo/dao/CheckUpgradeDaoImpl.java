
package com.barclays.oneappdemo.dao;


import com.barclays.dto.CheckUpgradeDto;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import com.barclays.oneappdemo.dao.CheckUpgradeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;


@Repository
class CheckUpgradeDaoImpl extends JdbcDaoSupport implements CheckUpgradeDao
{
    @Autowired
    private DataSource dataSource;
    @Autowired
    private CheckUpgradeDto checkUpgradeDto;


    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }

    public void setvNumber()
    {
        CheckUpgradeDto checkUpgrade=new CheckUpgradeDto();
        checkUpgrade.setvNumber(1.01);
        //return  checkUpgrade.getvNumber();
    }

    @Override
    public CheckUpgradeDto getCheckUpgradeById() {
        String sql = "SELECT * FROM CONFIGINFO";
        Map<String, Object>row = (getJdbcTemplate().queryForList(sql)).get(0);
        //checkUpgradeDto.setvReq((String)row.get("CONFIGID"));
        checkUpgradeDto.setvNumber((Double) row.get("VERRUN"));
        checkUpgradeDto.setvReq((Double) row.get("VERREQ"));
//System.out.print("PPPPPPPPP"+checkUpgradeDto);
        // Map<String, Object>row= rows.get(0);

        //   System.out.print("7777777777"+row);

        return checkUpgradeDto;
        /*List<CheckUpgradeDto> result = new ArrayList<CheckUpgradeDto>();
        for(Map<String, Object> row:rows){
            CheckUpgradeDto checkUpgradeDto = new CheckUpgradeDto();
            checkUpgradeDto.setvNumber((String)row.get("CONFIGINFO"));

            result.add(checkUpgradeDto);
            System.out.print("7777777777"+result.get(0));
        }

        return result;
*/

    }
}
