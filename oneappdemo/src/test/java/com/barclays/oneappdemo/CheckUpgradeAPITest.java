package com.barclays.oneappdemo;

import org.h2.tools.Script;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.test.context.junit4.SpringRunner;

import javax.script.ScriptException;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CheckUpgradeAPITest {
@Autowired
    private JdbcTemplate jdbcTemplate;
private static final String CREATE_CONFIGINFO_TABLE="scripts/create/CONFIGINFO_t.sql";
    private static final String DROP_CONFIGINFO_TABLE="scripts/create/CONFIGINFO_t_del.sql";


@Before
public  void before()throws ScriptException, SQLException
{
    ScriptUtils.executeSqlScript(jdbcTemplate.getDataSource().getConnection(),new ClassPathResource(CREATE_CONFIGINFO_TABLE));
}

/*@After
    public  void after() throws SQLException {
    ScriptUtils.executeSqlScript(jdbcTemplate.getDataSource().getConnection(),new ClassPathResource(DROP_CONFIGINFO_TABLE));

}*/
}
