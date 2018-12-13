package spring.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/application-context.xml")
public class LocationIntTest {
    @Autowired
    private LocationService locationService;


    @Test
    public void allTest() {
        //locationService.createLocation("t1", 2, 3);
        //locationService.createLocation("t4", 5, 6);
        //assertEquals("t1", locationService.listLocations().get(0).getName());

        Location l1 = locationService.createLocationTemplate();

        System.out.println(l1);

        Location l2 = locationService.createLocationTemplate();

        System.out.println(l2);

    }
}
