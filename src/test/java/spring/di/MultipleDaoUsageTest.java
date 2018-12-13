package spring.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =  AppConfig.class)
@ActiveProfiles("postfix")
public class MultipleDaoUsageTest {

    @Autowired
    private MultipleDaoUsage multipleDaoUsage;

    @Test
    public void testMultiple() {
        multipleDaoUsage.saveEmployeeDaos("ffff");
        System.out.println(multipleDaoUsage.listEmployees());
    }
}
